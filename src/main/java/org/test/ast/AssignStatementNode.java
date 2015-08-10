package org.test.ast;

import org.test.ast.visitor.ASTVisitor;
import org.test.gen.CodePosition;

/**
 * Created by serkan on 29.06.2015.
 */
public class AssignStatementNode extends StatementNode {

    private String variable;

    private ExpressionNode expression;


    public AssignStatementNode(CodePosition pos, String variable, ExpressionNode expression) {
        super(pos);
        this.variable = variable;
        this.expression = expression;
    }

    public String getVariable() {
        return variable;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
