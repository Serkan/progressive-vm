package org.test.ast;

/**
 * Created by serkan on 28.06.2015.
 */
public class BooleanLiteralNode extends ASTBase {

    private Boolean value;

    public BooleanLiteralNode(Boolean value) {
        this.value = value;
    }

    @Override
    public void eval() {
        operandStack.push(value);
    }
}
