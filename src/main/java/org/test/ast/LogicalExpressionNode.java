package org.test.ast;

/**
 * Created by serkan on 29.06.2015.
 */
public class LogicalExpressionNode extends ExpressionNode {

    private final String operator;
    private final ExpressionNode leftExp;
    private final ExpressionNode rightExp;

    public LogicalExpressionNode(String operator, ExpressionNode leftExp, ExpressionNode rightExp) {
        this.operator = operator;
        this.leftExp = leftExp;
        this.rightExp = rightExp;
    }

    public String getOperator() {
        return operator;
    }

    public ExpressionNode getLeftExp() {
        return leftExp;
    }

    public ExpressionNode getRightExp() {
        return rightExp;
    }
}
