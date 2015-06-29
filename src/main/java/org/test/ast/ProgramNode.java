package org.test.ast;

import java.util.List;

/**
 * Created by serkan on 29.06.2015.
 */
public class ProgramNode extends ASTBase {

    List<StatementNode> statements;


    public ProgramNode(List<StatementNode> statements) {
        this.statements = statements;
        this.statements = statements;
    }
}
