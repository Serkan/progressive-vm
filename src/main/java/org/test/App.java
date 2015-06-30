package org.test;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.test.ast.ASTBase;
import org.test.gen.MassiveBaseVisitor;
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

        MassiveBaseVisitor visitor = new MassiveBaseVisitor();
        ASTBase tree = visitor.visitProgram(parser.program());
        System.out.println(tree);
    }
}
