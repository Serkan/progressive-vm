// Generated from /home/serkan/dev/progressive-vm/src/main/resources/Massive.g4 by ANTLR 4.5
package org.test.gen;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.test.ast.*;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an empty implementation of {@link MassiveVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 */
public class ASTBuilderVisitor extends AbstractParseTreeVisitor<ASTBase> implements MassiveVisitor<ASTBase> {

    private CodePosition extractPosition(ParserRuleContext ctx) {
        int startLine = ctx.getStart().getLine();
        int stopLine = ctx.getStop().getLine();
        String line = startLine - stopLine == 0 ? String.valueOf(startLine) : startLine + "..." + stopLine;
        int startIndex = ctx.getStart().getStartIndex();
        int stopIndex = ctx.getStop().getStopIndex();
        return new CodePosition(startIndex, stopIndex, line);
    }


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
            statementNodes.add((StatementNode) stat.accept(this));
        }
        ProgramNode node = new ProgramNode(extractPosition(ctx), statementNodes);
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
        return visitChildrenAndGetTree(ctx);
    }


    private ASTBase visitChildrenAndGetTree(ParserRuleContext ctx) {
        int childCount = ctx.getChildCount();
        List<ASTBase> children = new ArrayList<>(childCount);
        for (int i = 0; i < childCount; i++) {
            ParseTree c = ctx.getChild(i);
            ASTBase visit = visit(c);
            if (visit != null) {
                children.add(visit);
            }
        }
        if (children.size() == 1) {
            return children.get(0);
        } else {
            throw new IllegalStateException("AST can not be build due to unhandled children");
        }
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
        ExpressionNode expression = (ExpressionNode) visit(ctx.exp());
        AssignStatementNode assignStatementNode = new AssignStatementNode(extractPosition(ctx), id, expression);
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
        ReturnStatementNode returnNode = new ReturnStatementNode(extractPosition(ctx), expression);
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
        LogicalExpressionNode logicalExpressionNode = new LogicalExpressionNode(extractPosition(ctx), operator, leftNode, rightNode);
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
        return visitChildrenAndGetTree(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitNested_exp(@NotNull MassiveParser.Nested_expContext ctx) {
        return visitChildrenAndGetTree(ctx);
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
        EqualityExpressionNode equalityExpressionNode = new EqualityExpressionNode(extractPosition(ctx), operator, leftNode, rightNode);
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
        ArithmeticExpressionNode arithmeticExpressionNode = new ArithmeticExpressionNode(extractPosition(ctx), operator, leftNode, rightNode);
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
        RelationalExpressionNode relationalExpressionNode = new RelationalExpressionNode(extractPosition(ctx), operator, leftNode, rightNode);
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
        FunctionCallNode functionCallNode = new FunctionCallNode(extractPosition(ctx), functionName, variableReference);
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
        StringNode stringNode = new StringNode(extractPosition(ctx), ctx.STRING_LITERAL().getText());
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
        return new NumberNode(extractPosition(ctx), ctx.NUMBER_LITERAL().getText());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitBoolean_literal(@NotNull MassiveParser.Boolean_literalContext ctx) {
        return new BooleanNode(extractPosition(ctx), ctx.BOOLEAN_LITERAL().getText());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ASTBase visitId_operand(@NotNull MassiveParser.Id_operandContext ctx) {
        return new IDNode(extractPosition(ctx), ctx.getText());
    }
}