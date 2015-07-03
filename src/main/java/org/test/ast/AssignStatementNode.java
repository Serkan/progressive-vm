package org.test.ast;

/**
 * Created by serkan on 29.06.2015.
 */
public class AssignStatementNode extends StatementNode {

    private String variable;

    private ExpressionNode expression;


    public AssignStatementNode(String variable, ExpressionNode expression) {
        this.variable = variable;
        this.expression = expression;
    }

    public String getVariable() {
        return variable;
    }

    public ExpressionNode getExpression() {
        return expression;
    }
}
