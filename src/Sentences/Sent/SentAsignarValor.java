package Sentences.Sent;

import Sentences.Exp.Exp;
import Sentences.Exp.VarExp;


public class SentAsignarValor extends Sent {
    public static final String SIGNO_ASIGNACION = "=";

    public VarExp variable;
    public String signo;
    public Exp valor;

    public SentAsignarValor(VarExp variable, Exp valor) {
        super(SentType.SENT_ASIGNAR_VALOR);
        this.variable = variable;
        this.signo = SIGNO_ASIGNACION;
        this.valor = valor;
    }

}