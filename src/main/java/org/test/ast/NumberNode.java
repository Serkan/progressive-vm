package org.test.ast;

import org.test.ast.visitor.ASTVisitor;
import org.test.gen.CodePosition;

/**
 * Created by serkan on 29.06.2015.
 */
public class NumberNode extends ExpressionNode {

    private Double value;

    public NumberNode(CodePosition pos, String text) {
        super(pos);
        this.value = Double.parseDouble(text);
    }

    public Double getValue() {
        return value;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
