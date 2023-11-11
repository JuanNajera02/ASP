package Sentences.Sent;

import Sentences.Sentences;

public class Sent extends Sentences {

    public enum SentType {
        SENT_SI, SENT_MIENTRAS, SENT_LEER, SENT_ESCRIBIR, SENT_ASIGNAR_VALOR
    }

    public SentType tagSent;

    public Sent(SentType tagSent) {
        super(SentencesType.SENTENCIA_SENT);
        this.tagSent = tagSent;
    }
}
