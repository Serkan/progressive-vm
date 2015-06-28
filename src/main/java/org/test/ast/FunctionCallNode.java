package org.test.ast;

import java.util.Map;
import java.util.Stack;

/**
 * Created by serkan on 28.06.2015.
 */
public class FunctionCallNode extends ASTBase {

    private Map<String, Object> environment;

    private String functionName;

    private String variableRef;

    public FunctionCallNode(Map<String, Object> environment, String functionName, String variableRef) {
        this.environment = environment;
        this.functionName = functionName;
        this.variableRef = variableRef;
    }

    @Override
    public void eval() {
        // fetch variable from environment
        Object functionParameter = environment.get(variableRef);
        // TODO do the call
        Object result = null;
        operandStack.push(result);
    }
}
