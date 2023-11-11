package Sentences;

import Exp.Exp;

public class Sentences {

    public enum SentencesType {
       VARIABLE_EXP, BINARY_EXP, ASIGNACION_EXP, CONST_EXP
    }

    public SentencesType tagSentences;

    public Sentences(SentencesType tagSentences) {
        this.tagSentences = tagSentences;
    }

}

