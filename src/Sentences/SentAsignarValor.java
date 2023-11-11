package Sentences;

import Exp.Exp;

public class SentAsignarValor extends Sentences {
    public static final String SIGNO_ASIGNACION = "=";

    public SentVar variable;
    public String signo;
    public Exp valor;

    public SentAsignarValor(SentVar variable, Exp valor) {
        super(SentencesType.ASIGNACION_EXP);
        this.variable = variable;
        this.signo = SIGNO_ASIGNACION;
        this.valor = valor;
    }

}