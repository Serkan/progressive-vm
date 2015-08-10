package org.test.ast;

import org.test.ast.visitor.ASTVisitor;
import org.test.gen.CodePosition;

/**
 * Created by serkan on 29.06.2015.
 */
public class ReturnStatementNode extends StatementNode {

    private ExpressionNode expression;

    public ReturnStatementNode(CodePosition pos, ExpressionNode expression) {
        super(pos);
        this.expression = expression;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
