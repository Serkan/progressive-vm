// Generated from /home/serkan/dev/progressive-vm/src/main/resources/Massive.g4 by ANTLR 4.5
package org.test.gen;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.test.ast.*;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an empty implementation of {@link MassiveVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class MassiveBaseVisitor extends AbstractParseTreeVisitor<ASTBase> implements MassiveVisitor<ASTBase> {

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitProgram(@NotNull MassiveParser.ProgramContext ctx) {
        List<MassiveParser.StatContext> stats = ctx.stat();
        List<StatementNode> statementNodes = new ArrayList<>(stats.size());
        for (MassiveParser.StatContext stat : stats) {
            statementNodes.add((StatementNode) visitStat(stat));
        }
        ProgramNode node = new ProgramNode(statementNodes);
        return node;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitStat(@NotNull MassiveParser.StatContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitAssign_stat(@NotNull MassiveParser.Assign_statContext ctx) {
        String id = ctx.ID().getText();
        ExpressionNode expression = (ExpressionNode) visitChildren(ctx.exp());
        AssignStatementNode assignStatementNode = new AssignStatementNode(id, expression);
        return assignStatementNode;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitReturn_stat(@NotNull MassiveParser.Return_statContext ctx) {
        ExpressionNode expression = (ExpressionNode) visit(ctx.exp());
        ReturnStatementNode returnNode = new ReturnStatementNode(expression);
        return returnNode;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitLogical_exp(@NotNull MassiveParser.Logical_expContext ctx) {
        String operator = ctx.LOGICAL_OPERATOR().getText();
        MassiveParser.ExpContext leftExp = ctx.exp(0);
        MassiveParser.ExpContext rightExp = ctx.exp(1);
        ExpressionNode leftNode = (ExpressionNode) visit(leftExp);
        ExpressionNode rightNode = (ExpressionNode) visit(rightExp);
        LogicalExpressionNode logicalExpressionNode = new LogicalExpressionNode(operator, leftNode, rightNode);
        return logicalExpressionNode;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitOperand_exp(@NotNull MassiveParser.Operand_expContext ctx) {
        return visitChildren(ctx.operand());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitNested_exp(@NotNull MassiveParser.Nested_expContext ctx) {
        return visitChildren(ctx.exp());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitEquality_exp(@NotNull MassiveParser.Equality_expContext ctx) {
        String operator = ctx.EQUALITY_OPERATOR().getText();
        MassiveParser.ExpContext leftExp = ctx.exp(0);
        MassiveParser.ExpContext rightExp = ctx.exp(1);
        ExpressionNode leftNode = (ExpressionNode) visit(leftExp);
        ExpressionNode rightNode = (ExpressionNode) visit(rightExp);
        EqualityExpressionNode equalityExpressionNode = new EqualityExpressionNode(operator, leftNode, rightNode);
        return equalityExpressionNode;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitArithmetic_exp(@NotNull MassiveParser.Arithmetic_expContext ctx) {
        String operator = ctx.ARITHMETIC_OPERATOR().getText();
        MassiveParser.ExpContext leftExp = ctx.exp(0);
        MassiveParser.ExpContext rightExp = ctx.exp(1);
        ExpressionNode leftNode = (ExpressionNode) visit(leftExp);
        ExpressionNode rightNode = (ExpressionNode) visit(rightExp);
        ArithmeticExpressionNode arithmeticExpressionNode = new ArithmeticExpressionNode(operator, leftNode, rightNode);
        return arithmeticExpressionNode;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitRelational_exp(@NotNull MassiveParser.Relational_expContext ctx) {
        String operator = ctx.RELATIONAL_OPERATOR().getText();
        MassiveParser.ExpContext leftExp = ctx.exp(0);
        MassiveParser.ExpContext rightExp = ctx.exp(1);
        ExpressionNode leftNode = (ExpressionNode) visit(leftExp);
        ExpressionNode rightNode = (ExpressionNode) visit(rightExp);
        RelationalExpressionNode relationalExpressionNode = new RelationalExpressionNode(operator, leftNode, rightNode);
        return relationalExpressionNode;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitFunction_call(@NotNull MassiveParser.Function_callContext ctx) {
        String functionName = ctx.ID().getText();
        String variableReference = ctx.INTERNAL_TYPE().getText();
        FunctionCallNode functionCallNode = new FunctionCallNode(functionName, variableReference);
        return functionCallNode;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitFunction_call_exp(@NotNull MassiveParser.Function_call_expContext ctx) {
        return visit(ctx.function_call());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitString_literal(@NotNull MassiveParser.String_literalContext ctx) {
        StringNode stringNode = new StringNode(ctx.STRING_LITERAL().getText());
        return stringNode;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitNumber_literal(@NotNull MassiveParser.Number_literalContext ctx) {
        return new NumberNode(ctx.NUMBER_LITERAL().getText());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitBoolean_literal(@NotNull MassiveParser.Boolean_literalContext ctx) {
        return new BooleanNode(ctx.BOOLEAN_LITERAL().getText());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitId_operand(@NotNull MassiveParser.Id_operandContext ctx) {
        return new IDNode(ctx.getText());
    }
}