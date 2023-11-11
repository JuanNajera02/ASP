package Sentences.Sent;

import ExpRel.ExpRel;
import Sentences.Sentences;

public class SentMientras extends Sent{
    public static final String MIENTRAS = "Mientras";
    public static final String PARENTESIS1 = "(";
    public static final String PARENTESIS2 = ")";
    public static final String ENTONCES = "Entonces";
    public static final String FIN_MIENTRAS = "FinMientras";

    public String mientras;
    public String parentesis1;
    public ExpRel expresionRelacional;
    public String parentesis2;
    public String entonces;
    public Sentences sentencia;
    public String finMientras;

    public SentMientras(ExpRel expresionRelacional, Sentences sentencia) {
        super(SentType.SENT_MIENTRAS);
        this.mientras = MIENTRAS;
        this.parentesis1 = PARENTESIS1;
        this.expresionRelacional = expresionRelacional;
        this.parentesis2 = PARENTESIS2;
        this.entonces = ENTONCES;
        this.sentencia = sentencia;
        this.finMientras = FIN_MIENTRAS;
    }

}
