package Sentences;

import Exp.Exp;
import Exp.VarExp;


public class SentAsignarValor extends Sentences {
    public static final String SIGNO_ASIGNACION = "=";

    public VarExp variable;
    public String signo;
    public Exp valor;

    public SentAsignarValor(VarExp variable, Exp valor) {
        super(SentencesType.SENT_ASIGNAR_VALOR);
        this.variable = variable;
        this.signo = SIGNO_ASIGNACION;
        this.valor = valor;
    }

}