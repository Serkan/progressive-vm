package org.test.ast.control;

/**
 * Created by serkan on 02.07.2015.
 */
public class ReturnControlException extends RuntimeException {

    private Object result;

    public ReturnControlException(Object result) {
        this.result = result;
    }

    public Object getResult() {
        return result;
    }
}
