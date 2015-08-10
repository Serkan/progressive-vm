package org.test.ast;

import org.test.gen.CodePosition;

/**
 * Created by serkan on 29.06.2015.
 */
public abstract class StatementNode extends ASTBase {

    public StatementNode(CodePosition pos) {
        super(pos);
    }
}
