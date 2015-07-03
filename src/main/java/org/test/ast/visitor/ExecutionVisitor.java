package org.test.ast.visitor;

import org.test.ast.*;
import org.test.ast.control.ReturnControlException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Created by serkan on 30.06.2015.
 */
public class ExecutionVisitor implements ASTVisitor {

    Stack<Object> operandStack = new Stack<>();

    Map<String, Object> memory = new HashMap<>();

    @Override
    public void visit(ProgramNode node) {
        List<StatementNode> statements = node.getStatements();
        for (StatementNode statement : statements) {
            statement.accept(this);
        }
    }

    @Override
    public void visit(ArithmeticExpressionNode node) {
        node.getLeftNode().accept(this);
        node.getRightNode().accept(this);
        String operator = node.getOperator();
        Double p1 = (Double) operandStack.pop();
        Double p2 = (Double) operandStack.pop();
        switch (operator) {
            case "+":
                operandStack.push(p1 + p2);
                break;
            case "-":
                operandStack.push(p1 - p2);
                break;
            case "*":
                operandStack.push(p1 * p2);
                break;
            case "/":
                operandStack.push(p1 / p2);
                break;
            default:
                throw new IllegalStateException("Unknown operator");
        }

    }

    @Override
    public void visit(EqualityExpressionNode node) {
        node.getLeftNode().accept(this);
        node.getRightNode().accept(this);
        String operator = node.getOperator();
        Object p1 = operandStack.pop();
        Object p2 = operandStack.pop();
        switch (operator) {
            case "==":
                operandStack.push(p1.equals(p2));
                break;
            case "=!":
                operandStack.push(!p1.equals(p2));
                break;
            default:
                throw new IllegalStateException("Unknown operator");
        }
    }

    @Override
    public void visit(LogicalExpressionNode node) {
        node.getLeftExp().accept(this);
        Boolean p1 = (Boolean) operandStack.pop();
        String operator = node.getOperator();
        switch (operator) {
            case "AND":
                if (!p1) {
                    operandStack.push(Boolean.FALSE);
                } else {
                    node.getRightExp().accept(this);
                    Boolean p2 = (Boolean) operandStack.pop();
                    operandStack.push(p1 & p2);
                }
                break;
            case "OR":
                if (p1) {
                    operandStack.push(Boolean.TRUE);
                } else {
                    node.getRightExp().accept(this);
                    Boolean p2 = (Boolean) operandStack.pop();
                    operandStack.push(p1 & p2);
                }
                break;
            default:
                throw new IllegalStateException("Unknown Operator");
        }
    }

    @Override
    public void visit(RelationalExpressionNode node) {
        node.getLeftNode().accept(this);
        node.getRightNode().accept(this);
        Double p1 = (Double) operandStack.pop();
        Double p2 = (Double) operandStack.pop();
        String operator = node.getOperator();
        switch (operator) {
            case ">":
                operandStack.push(p1 > p2);
                break;
            case "<":
                operandStack.push(p1 < p2);
                break;
            case ">=":
                operandStack.push(p1 >= p2);
                break;
            case "<=":
                operandStack.push(p1 <= p2);
                break;
            default:
                throw new IllegalStateException("Unknown operator");
        }
    }

    @Override
    public void visit(AssignStatementNode node) {
        node.getExpression().accept(this);
        Object result = operandStack.pop();
        // store in memory
        memory.put(node.getVariable(), result);
    }

    @Override
    public void visit(FunctionCallNode node) {
        String variableReference = node.getVariableReference();
        Object value = memory.get(variableReference);
        String functionName = node.getFunctionName();
        // TODO find and call function
        // TODO push result to stack back
    }

    @Override
    public void visit(IDNode node) {
        operandStack.push(node.getId());
    }

    @Override
    public void visit(NumberNode node) {
        operandStack.push(node.getValue());
    }

    @Override
    public void visit(StringNode node) {
        operandStack.push(node.getValue());
    }

    @Override
    public void visit(BooleanNode node) {
        // load the constant
        operandStack.push(node.getValue());
    }

    @Override
    public void visit(ReturnStatementNode node) {
        node.getExpression().accept(this);
        throw new ReturnControlException(operandStack.pop());
    }

    @Override
    public void visit(ASTBase node) {
        // no op
    }

    @Override
    public void visit(ExpressionNode node) {
        // no op
    }

    @Override
    public void visit(StatementNode node) {
        // no op
    }

}
