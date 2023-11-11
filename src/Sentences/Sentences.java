package Sentences;

public class Sentences {

    public enum SentencesType {
        SENTENCIA_EXP,
        SENTENCIA_SENT
    }

    public SentencesType tag;

    public Sentences(SentencesType tag) {
        this.tag = tag;
    }

}
