package org.test.ast;

import org.test.ast.visitor.ASTVisitor;

/**
 * Created by serkan on 29.06.2015.
 */
public class BooleanNode extends ExpressionNode {

    private Boolean value;

    public BooleanNode(String text) {
        this.value = Boolean.parseBoolean(text);
    }

    public Boolean getValue() {
        return value;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
