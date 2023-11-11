package Sentences.Exp;

import Sentences.Sentences;

public class Exp extends Sentences {
    public enum ExpType {
        INTEGER_EXP, VARIABLE_EXP, BINARY_EXP, CONST_EXP, STRING_EXP
    }

    public ExpType tag;

    public Exp(ExpType tag) {
        super(SentencesType.SENTENCIA_EXP);
        this.tag = tag;
    }
}