package org.test.ast.control;

import org.test.ast.ASTBase;

/**
 * Created by sturgut on 8/10/2015.
 */
public class WrongTypeException extends RuntimeException {

    public WrongTypeException(String message, ASTBase node) {
        super(message + " --- Line number(s) " + node.getPos().getLine());

    }
}
