package org.test.ast;

import org.test.ast.visitor.ASTVisitor;

/**
 * Created by serkan on 29.06.2015.
 */
public class NumberNode extends ExpressionNode {

    private Double value;

    public NumberNode(String text) {
        this.value = Double.parseDouble(text);
    }

    public Double getValue() {
        return value;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
