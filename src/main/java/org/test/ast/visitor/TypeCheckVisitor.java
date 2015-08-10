package org.test.ast.visitor;

import org.test.ast.*;
import org.test.ast.control.WrongTypeException;
import org.test.ast.env.MassiveEnvironment;
import org.test.ast.env.Symbol;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author serkan
 */
public class TypeCheckVisitor implements ASTVisitor {

    public enum MassiveTypes {
        NUMBER, BOOLEAN, STRING, ARRAY
    }

    private Stack<MassiveTypes> typeStack = new Stack<>();

    // keeps type of variables
    private Map<String, MassiveTypes> typeBridge = new HashMap<>();


    private MassiveEnvironment environment;

    public TypeCheckVisitor(MassiveEnvironment environment) {
        this.environment = environment;
    }

    @Override
    public void visit(ArithmeticExpressionNode node) {
        node.getLeftNode().accept(this);
        node.getRightNode().accept(this);
        // both side must be numeric
        if (typeStack.pop() != MassiveTypes.NUMBER || typeStack.pop() != MassiveTypes.NUMBER) {
            throw new WrongTypeException("Both sides must be numeric", node);
        }
        typeStack.push(MassiveTypes.NUMBER);
    }

    @Override
    public void visit(EqualityExpressionNode node) {
        node.getLeftNode().accept(this);
        node.getRightNode().accept(this);
        // both sides must be same type
        if (typeStack.pop() != typeStack.pop()) {
            throw new WrongTypeException("Both sides must be same type", node);
        }
        typeStack.push(MassiveTypes.BOOLEAN);
    }

    @Override
    public void visit(LogicalExpressionNode node) {
        node.getLeftExp().accept(this);
        node.getRightExp().accept(this);
        // both sides must be same boolean
        if (typeStack.pop() != MassiveTypes.BOOLEAN || typeStack.pop() != MassiveTypes.BOOLEAN) {
            throw new WrongTypeException("Both sides must be boolean", node);
        }
        typeStack.push(MassiveTypes.BOOLEAN);
    }

    @Override
    public void visit(RelationalExpressionNode node) {
        node.getLeftNode().accept(this);
        node.getRightNode().accept(this);
        // both sides must be numeric
        if (typeStack.pop() != MassiveTypes.NUMBER || typeStack.pop() != MassiveTypes.NUMBER) {
            throw new WrongTypeException("Both sides must be number", node);
        }
        typeStack.push(MassiveTypes.BOOLEAN);
    }

    @Override
    public void visit(AssignStatementNode node) {
        node.getExpression().accept(this);
        // right side of the statement, (expression) binds required type to the variable name
        typeBridge.put(node.getVariable(), typeStack.pop());
    }

    @Override
    public void visit(BooleanNode node) {
        typeStack.push(MassiveTypes.BOOLEAN);
    }

    @Override
    public void visit(NumberNode node) {
        typeStack.push(MassiveTypes.NUMBER);
    }

    @Override
    public void visit(StringNode node) {
        typeStack.push(MassiveTypes.STRING);
    }

    @Override
    public void visit(FunctionCallNode node) {
        // lookup for function definition using external environment information
        Symbol functionSymbol = environment.lookup(node.getFunctionName());
        typeStack.push(functionSymbol.getType());
    }

    @Override
    public void visit(IDNode node) {
        // find the type of variable and push to type stack
        typeStack.push(typeBridge.get(node.getId()));
    }

    @Override
    public void visit(ProgramNode node) {
        List<StatementNode> statements = node.getStatements();
        for (StatementNode statement : statements) {
            statement.accept(this);
        }
    }

    @Override
    public void visit(ReturnStatementNode node) {
        // no op for return
    }

}
