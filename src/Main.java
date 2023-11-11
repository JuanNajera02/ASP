import Exp.BinaryExp;
import Exp.IntegerExp;
import Sentences.SentVar;
import Exp.StringExp;
import Exp.Exp;
import Exp.SentConst;
import Sentences.SentAsignarValor;


public class Main {
    public static void main(String[] args) {

        SentVar miVariable = new SentVar("miVariable", SentVar.TipoDato.Numero);

        SentVar miVariable2 = new SentVar("miVariable2", SentVar.TipoDato.Numero);

        SentConst miConstante = new SentConst(
                new IntegerExp(42),
                "miConstante",
                SentConst.TipoDato.NUMERO
        );


        Exp expression1 = new BinaryExp(
                "+",
                miConstante.getValor(),
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
            SentVar varExp = (SentVar) e;
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












