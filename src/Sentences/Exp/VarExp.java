package Sentences.Exp;

import Sentences.Sent.SentAsignarValor;

public class VarExp extends Exp {
    public enum TipoDato {
        Cadena, Numero
    }

    public String name;
    public TipoDato tipoDato;
    public SentAsignarValor valor;

    public VarExp(String varName, TipoDato tipoDato) {
        super(ExpType.VARIABLE_EXP);
        this.tipoDato = tipoDato;
        this.name = varName;
    }

    public VarExp(String varName, TipoDato tipoDato, SentAsignarValor valor) {
        super(ExpType.VARIABLE_EXP);
        this.tipoDato = tipoDato;
        this.name = varName;
        this.valor = valor;
    }



}
