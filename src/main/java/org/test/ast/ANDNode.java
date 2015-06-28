package org.test.ast;

import java.util.Stack;

/**
 * Created by serkan on 28.06.2015.
 */
public class ANDNode extends ASTBase {

    private ASTBase leftNode;

    private ASTBase rightNode;

    public ANDNode(ASTBase leftNode, ASTBase rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public void eval() {
        leftNode.eval();
        Boolean operand1 = (Boolean) operandStack.pop();
        // short circuit AND operator
        if (!operand1) {
            operandStack.push(Boolean.FALSE);
        } else {
            rightNode.eval();
            Boolean operand2 = (Boolean) operandStack.pop();
            operandStack.push(operand1 & operand2);
        }
    }
}
