import Sentences.Exp.BinaryExp;
import Sentences.Exp.IntegerExp;
import Sentences.Exp.VarExp;
import Sentences.Exp.StringExp;
import Sentences.Exp.Exp;
import Sentences.Exp.ConstExp;


public class Main {
    public static void main(String[] args) {

        VarExp miVariable = new VarExp("miVariable", VarExp.TipoDato.Numero);

        VarExp miVariable2 = new VarExp("miVariable2", VarExp.TipoDato.Numero);

        ConstExp miConstante = new ConstExp(
                new IntegerExp(42),
                "miConstante",
                ConstExp.TipoDato.NUMERO
        );


        Exp expression1 = new BinaryExp(
                "+",
                miConstante.valor,
                new IntegerExp(3)
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
            VarExp varExp = (VarExp) e;
            System.out.println("VariableExp(\"" + varExp.name + "\")");
        } else if (e.tag == Exp.ExpType.BINARY_EXP) {
            BinaryExp binExp = (BinaryExp) e;
            System.out.println("BinaryExp(" + binExp.binaryOperator + ")");
            printExpression(binExp.left, indent + 1);
            printExpression(binExp.right, indent + 1);
        } else if (e.tag == Exp.ExpType.STRING_EXP) {
            StringExp strExp = (StringExp) e;
            System.out.println("StringExp(\"" + strExp.value + "\")");
        }



    }

}












