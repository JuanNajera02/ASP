import Exp.BinaryExp;
import Exp.IntegerExp;
import Exp.VariableExp;
import Exp.Exp;

public class Main {
    public static void main(String[] args) {

        Exp expression1 = new BinaryExp(
                "+",
                new VariableExp("x"),
                new VariableExp("y")
        );

        Exp expression2 = new BinaryExp(
                "+",
                new IntegerExp(5),
                new IntegerExp(4)
        );

        Exp fullExpression = new BinaryExp(
                "-",
                expression1,
                expression2
        );

        printExpression(fullExpression, 0);

    }

    public static void printExpression(Exp e, int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }

        if (e.tag == Exp.ExpType.INTEGER_EXP) {
            IntegerExp intExp = (IntegerExp) e;
            System.out.println("IntegerExp(" + intExp.value + ")");
        } else if (e.tag == Exp.ExpType.VARIABLE_EXP) {
            VariableExp varExp = (VariableExp) e;
            System.out.println("VariableExp(\"" + varExp.name + "\")");
        } else if (e.tag == Exp.ExpType.BINARY_EXP) {
            BinaryExp binExp = (BinaryExp) e;
            System.out.println("BinaryExp(" + binExp.binaryOperator + ")");
            printExpression(binExp.left, indent + 1);
            printExpression(binExp.right, indent + 1);
        }
    }

}












