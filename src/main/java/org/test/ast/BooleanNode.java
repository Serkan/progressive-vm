package org.test.ast;

/**
 * Created by serkan on 29.06.2015.
 */
public class BooleanNode extends ExpressionNode {

    private Boolean value;

    public BooleanNode(String text) {
        this.value = Boolean.parseBoolean(text);
    }
}
