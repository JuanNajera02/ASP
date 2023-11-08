package Exp;

public class Exp {
    public enum ExpType {
        INTEGER_EXP, STRING_EXP, VARIABLE_EXP, BINARY_EXP
    }

    public ExpType tag;

    public Exp(ExpType tag) {
        this.tag = tag;
    }
}