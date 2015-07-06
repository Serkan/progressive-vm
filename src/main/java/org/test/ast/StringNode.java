package org.test.ast;

import org.test.ast.visitor.ASTVisitor;

/**
 * Created by serkan on 29.06.2015.
 */
public class StringNode extends ExpressionNode {

    private String value;

    public StringNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
