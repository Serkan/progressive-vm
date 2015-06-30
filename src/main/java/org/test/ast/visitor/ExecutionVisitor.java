package org.test.ast.visitor;

import org.test.ast.*;

import java.util.Stack;

/**
 * Created by serkan on 30.06.2015.
 */
public class ExecutionVisitor implements ASTVisitor {

    Stack<Object> operandStack = new Stack<>();

    @Override
    public void visit(ArithmeticExpressionNode node) {

    }

    @Override
    public void visit(AssignStatementNode node) {

    }

    @Override
    public void visit(ASTBase node) {

    }

    @Override
    public void visit(BooleanNode node) {

    }

    @Override
    public void visit(EqualityExpressionNode node) {

    }

    @Override
    public void visit(ExpressionNode node) {

    }

    @Override
    public void visit(FunctionCallNode node) {

    }

    @Override
    public void visit(IDNode node) {

    }

    @Override
    public void visit(LogicalExpressionNode node) {

    }

    @Override
    public void visit(NumberNode node) {

    }

    @Override
    public void visit(ProgramNode node) {

    }

    @Override
    public void visit(RelationalExpressionNode node) {

    }

    @Override
    public void visit(ReturnStatementNode node) {

    }

    @Override
    public void visit(StatementNode node) {

    }

    @Override
    public void visit(StringNode node) {

    }
}
