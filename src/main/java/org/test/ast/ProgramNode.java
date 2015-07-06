package org.test.ast;

import org.test.ast.visitor.ASTVisitor;

import java.util.List;

/**
 * Created by serkan on 29.06.2015.
 */
public class ProgramNode extends ASTBase {

    List<StatementNode> statements;


    public ProgramNode(List<StatementNode> statements) {
        this.statements = statements;
    }

    public List<StatementNode> getStatements() {
        return statements;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
