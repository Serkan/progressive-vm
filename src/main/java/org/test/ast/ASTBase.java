package org.test.ast;

import java.util.Stack;

/**
 * Created by serkan on 28.06.2015.
 */
public abstract class ASTBase {

    protected Stack<Object> operandStack;

    public Object eval(Stack<Object> operandStack) {
        this.operandStack = operandStack;
        eval();
        return operandStack.pop();
    }

    protected abstract void eval();
}
