package org.test.ast;

/**
 * Created by serkan on 29.06.2015.
 */
public class EqualityExpressionNode extends ExpressionNode {

    private ExpressionNode leftNode;

    private ExpressionNode rightNode;

    private final String operator;

    public EqualityExpressionNode(String operator, ExpressionNode leftNode, ExpressionNode rightNode) {
        this.operator = operator;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}
