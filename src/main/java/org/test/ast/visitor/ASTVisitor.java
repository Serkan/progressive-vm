package org.test.ast.visitor;

import org.test.ast.*;

/**
 * Created by serkan on 30.06.2015.
 */
public interface ASTVisitor {

    void visit(ArithmeticExpressionNode node);

    void visit(AssignStatementNode node);

    void visit(ASTBase node);

    void visit(BooleanNode node);

    void visit(EqualityExpressionNode node);

    void visit(ExpressionNode node);

    void visit(FunctionCallNode node);

    void visit(IDNode node);

    void visit(LogicalExpressionNode node);

    void visit(NumberNode node);

    void visit(ProgramNode node);

    void visit(RelationalExpressionNode node);

    void visit(ReturnStatementNode node);

    void visit(StatementNode node);

    void visit(StringNode node);

}
