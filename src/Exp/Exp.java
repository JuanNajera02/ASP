package Exp;

public class Exp {
    public enum ExpType {
        INTEGER_EXP, VARIABLE_EXP, BINARY_EXP, CONST_EXP, STRING_EXP //este ultimo no
    }

    public ExpType tag;

    public Exp(ExpType tag) {
        this.tag = tag;
    }
}