package org.test.ast.env;

import org.test.ast.visitor.TypeCheckVisitor;

/**
 * @author serkan
 */
public class Symbol {

    private String identifier;

    private TypeCheckVisitor.MassiveTypes type;

    public Symbol(String identifier, TypeCheckVisitor.MassiveTypes type) {
        this.identifier = identifier;
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public TypeCheckVisitor.MassiveTypes getType() {
        return type;
    }
}
