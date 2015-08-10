package org.test.ast;

import org.test.ast.visitor.ASTVisitor;
import org.test.gen.CodePosition;

/**
 * Created by serkan on 29.06.2015.
 */
public class FunctionCallNode extends ExpressionNode {

    private String functionName;

    private String variableReference;

    public FunctionCallNode(CodePosition pos, String functionName, String variableReference) {
        super(pos);
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
