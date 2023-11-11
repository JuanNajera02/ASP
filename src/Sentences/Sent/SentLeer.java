package Sentences.Sent;

import Sentences.Exp.VarExp;

public class SentLeer extends Sent {

    public static final String LEER = "Leer";
    public String leer;
    public VarExp id;

    public SentLeer(VarExp id) {
        super(SentType.SENT_LEER);
        this.leer = LEER;
        this.id = id;
    }
}
