package org.test.ast;

import org.test.ast.visitor.ASTVisitor;

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

    public String getFunctionName() {
        return functionName;
    }

    public String getVariableReference() {
        return variableReference;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
