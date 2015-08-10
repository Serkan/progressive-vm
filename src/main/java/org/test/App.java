package org.test;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.test.ast.ASTBase;
import org.test.ast.control.ReturnControlException;
import org.test.ast.env.MassiveEnvironment;
import org.test.ast.env.Symbol;
import org.test.ast.visitor.ExecutionVisitor;
import org.test.ast.visitor.TypeCheckVisitor;
import org.test.gen.ASTBuilderVisitor;
import org.test.gen.MassiveLexer;
import org.test.gen.MassiveParser;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String code = "TWITTER_LIMIT = 100;\n" +
                "Result = FacebookFriends(KISI) AND\n" +
                "    (TwitterFollowers(HESAP) > TWITTER_LIMIT) OR\n" +
                "    (SomeFunc(KISI) + 10 > 100) AND SomeOtherFunc(KISI) == \"serkan\";\n" +
                "return Result;";

//        String code = "return SomeFunc(KISI) + 10 > 100";


        ANTLRInputStream is = new ANTLRInputStream(code);
        MassiveLexer lexer = new MassiveLexer(is);
        BufferedTokenStream stream = new BufferedTokenStream(lexer);
        MassiveParser parser = new MassiveParser(stream);

        ASTBuilderVisitor visitor = new ASTBuilderVisitor();
        ASTBase ast = visitor.visitProgram(parser.program());


        // do type checking
        TypeCheckVisitor typeChecker = new TypeCheckVisitor(new MassiveEnvironment() {
            @Override
            public Symbol lookup(String identifier) {
                TypeCheckVisitor.MassiveTypes type;
                switch (identifier) {
                    case "FacebookFriends":
                        type = TypeCheckVisitor.MassiveTypes.BOOLEAN;
                        break;
                    case "TwitterFollowers":
                        type = TypeCheckVisitor.MassiveTypes.NUMBER;
                        break;
                    case "SomeFunc":
                        type = TypeCheckVisitor.MassiveTypes.NUMBER;
                        break;
                    case "SomeOtherFunc":
                        type = TypeCheckVisitor.MassiveTypes.STRING;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown identifier name");
                }
                return new Symbol(identifier, type);
            }
        });
        ast.accept(typeChecker);

        // do execution
//        ExecutionVisitor executionVisitor = new ExecutionVisitor();
//        Object result = null;
//        try {
//            ast.accept(executionVisitor);
//        } catch (ReturnControlException e) {
//            result = e.getResult();
//        }
//
//
//        System.out.println("Result : " + result);
    }
}
