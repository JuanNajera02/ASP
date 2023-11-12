package Sentences.Sent;

import ExpRel.ExpRel;
import Sentences.Sentences;

public class SentSi extends Sent{
    public static final String SI = "Si";
    public static final String PARENTESIS1 = "(";
    public static final String PARENTESIS2 = ")";
    public static final String ENTONCES = "Entonces";
    public static final String SI_NO = "SiNo";
    public static final String FIN_SI = "FinSi";
    public static final String PUNTO_COMA = ";";
    public String si;
    public String parentesis1;
    public ExpRel expresionRelacional;
    public String parentesis2;
    public String entonces;
    public Sentences sentencia1;
    public String siNo;
    public Sentences sentencia2;
    public String finSi;
    public String puntoComa;

    public SentSi(ExpRel expresionRelacional, Sentences sentencia1) {
        super(SentType.SENT_SI);
        this.si = SI;
        this.parentesis1 = PARENTESIS1;
        this.expresionRelacional = expresionRelacional;
        this.parentesis2 = PARENTESIS2;
        this.entonces = ENTONCES;
        this.sentencia1 = sentencia1;
        this.finSi = FIN_SI;
        this.puntoComa = PUNTO_COMA;
    }

    public SentSi(ExpRel expresionRelacional, Sentences sentencia1, Sentences sentencia2) {
        super(SentType.SENT_SI);
        this.si = SI;
        this.parentesis1 = PARENTESIS1;
        this.expresionRelacional = expresionRelacional;
        this.parentesis2 = PARENTESIS2;
        this.entonces = ENTONCES;
        this.sentencia1 = sentencia1;
        this.siNo = SI_NO;
        this.sentencia2 = sentencia2;
        this.finSi = FIN_SI;
        this.puntoComa = PUNTO_COMA;
    }


}
