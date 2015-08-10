package org.test.ast;

import org.test.ast.visitor.ASTVisitor;
import org.test.gen.CodePosition;

/**
 * Created by serkan on 29.06.2015.
 */
public class ArithmeticExpressionNode extends ExpressionNode {

    private ExpressionNode leftNode;

    private ExpressionNode rightNode;

    private final String operator;

    public ArithmeticExpressionNode(CodePosition pos, String operator, ExpressionNode leftNode, ExpressionNode rightNode) {
        super(pos);
        this.operator = operator;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public ExpressionNode getLeftNode() {
        return leftNode;
    }

    public ExpressionNode getRightNode() {
        return rightNode;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
