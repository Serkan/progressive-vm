package org.test.ast;

import org.test.ast.visitor.ASTVisitor;

/**
 * Created by serkan on 28.06.2015.
 */
public abstract class ASTBase {

    final void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
