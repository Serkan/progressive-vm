package org.test.ast;

/**
 * Created by serkan on 28.06.2015.
 */
public class NumberLiteralNode extends ASTBase {

    private Double value;

    public NumberLiteralNode(Double value) {
        this.value = value;
    }

    @Override
    public void eval() {
        operandStack.push(value);
    }
}
