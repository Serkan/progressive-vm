package org.test.ast;

/**
 * Created by serkan on 29.06.2015.
 */
public class RelationalExpressionNode extends ExpressionNode {

    private ExpressionNode leftNode;

    private ExpressionNode rightNode;

    private final String operator;

    public RelationalExpressionNode(String operator, ExpressionNode leftNode, ExpressionNode rightNode) {
        this.operator = operator;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}
