package org.test.ast;

/**
 * Created by serkan on 28.06.2015.
 */
public class PredicateNode extends ASTBase {

    private ASTBase leftNode;

    private String operator;

    private ASTBase rightNode;

    public PredicateNode(ASTBase leftNode, String operator, ASTBase rightNode) {
        this.leftNode = leftNode;
        this.operator = operator;
        this.rightNode = rightNode;
    }

    @Override
    public void eval() {
        leftNode.eval();
        rightNode.eval();
        Object operand1 = operandStack.pop();
        Object operand2 = operandStack.pop();
        boolean result;
        switch (operator) {
            case ">":
                result = (double) operand1 > (double) operand2;
                break;
            case "<":
                result = (double) operand1 < (double) operand2;
                break;
            case "==":
                result = operand1.equals(operand2);
                break;
            case "!=":
                result = !operand1.equals(operand2);
                break;
            default:
                throw new IllegalStateException("Wrong relational operator type");
        }
        operandStack.push(result);
    }
}
