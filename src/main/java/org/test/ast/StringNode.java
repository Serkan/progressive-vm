package org.test.ast;

/**
 * Created by serkan on 29.06.2015.
 */
public class StringNode extends ExpressionNode {

    private String value;

    public StringNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
