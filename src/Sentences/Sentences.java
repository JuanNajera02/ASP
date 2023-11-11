package Sentences;

import Exp.Exp;

public class Sentences {

    public enum SentencesType {
       SENT_SI, SENT_MIENTRAS, SENT_LEER, SENT_ESCRIBIR, SENT_ASIGNAR_VALOR
    }

    public SentencesType tagSentences;

    public Sentences(SentencesType tagSentences) {
        this.tagSentences = tagSentences;
    }

}

