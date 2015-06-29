package org.test.ast;

/**
 * Created by serkan on 29.06.2015.
 */
public class FunctionCallNode extends ExpressionNode {

    private String functionName;

    private String variableReference;

    public FunctionCallNode(String functionName, String variableReference) {
        this.functionName = functionName;
        this.variableReference = variableReference;
    }
}
