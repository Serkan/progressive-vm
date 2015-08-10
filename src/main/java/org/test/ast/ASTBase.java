package org.test.ast;

import org.test.ast.visitor.ASTVisitor;
import org.test.gen.CodePosition;

/**
 * Created by serkan on 28.06.2015.
 */
public abstract class ASTBase {

    private CodePosition pos;

    public ASTBase(CodePosition pos) {
        this.pos = pos;
    }

    public CodePosition getPos() {
        return pos;
    }

    public abstract void accept(ASTVisitor visitor);

}
