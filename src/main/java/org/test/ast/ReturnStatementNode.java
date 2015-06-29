package org.test.ast;

/**
 * Created by serkan on 29.06.2015.
 */
public class ReturnStatementNode extends StatementNode {

    private ExpressionNode expression;

    public ReturnStatementNode(ExpressionNode expression) {
        this.expression = expression;
    }
}
