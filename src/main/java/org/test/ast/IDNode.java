package org.test.ast;

import org.test.ast.visitor.ASTVisitor;

/**
 * Created by serkan on 29.06.2015.
 */
public class IDNode extends ExpressionNode {

    private String id;

    public IDNode(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
