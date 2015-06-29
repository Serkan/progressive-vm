package org.test.ast;

/**
 * Created by serkan on 29.06.2015.
 */
public class NumberNode extends ExpressionNode {

    private Double value;

    public NumberNode(String text) {
        this.value = Double.parseDouble(text);
    }
}
