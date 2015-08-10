package org.test.ast;

import org.test.ast.visitor.ASTVisitor;
import org.test.gen.CodePosition;

/**
 * Created by serkan on 29.06.2015.
 */
public class IDNode extends ExpressionNode {

    private String id;

    public IDNode(CodePosition pos, String id) {
        super(pos);
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
