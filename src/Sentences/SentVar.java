package Sentences;

import Exp.Exp;
import Exp.StringExp;
import Exp.IntegerExp;

public class SentVar extends Exp {
    public enum TipoDato {
        Cadena, Numero
    }

    public String name;
    public TipoDato tipoDato;
    public Exp valor;

    public SentVar(String varName, TipoDato tipoDato) {
        super(ExpType.VARIABLE_EXP);
        this.tipoDato = tipoDato;
        this.name = varName;

        if (tipoDato == TipoDato.Numero) {
            this.valor = new IntegerExp(0);
        } else if (tipoDato == TipoDato.Cadena) {
            this.valor = new StringExp("");
        }

    }

    public Exp getValor() {
        return this.valor;
    }

}
