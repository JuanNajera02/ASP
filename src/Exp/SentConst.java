package Exp;

import Exp.Exp;
import Sentences.Sentences;

public class SentConst extends Exp {
    public static final String SIGNO_ASIGNACION = "=";
    public static final String CONST = "Const";
    public enum TipoDato {
        NUMERO, CADENA
    }
    public TipoDato tipoDato;
    public String constante;
    public String nombre;
    public String signo;
    public Exp valor;

    public Exp getValor() {
        return this.valor;
    }

    public SentConst(Exp valor, String nombre, TipoDato TipoDato) {
        super(ExpType.CONST_EXP);
        this.constante = CONST;
        this.nombre = nombre;
        this.signo = SIGNO_ASIGNACION;
        this.tipoDato = TipoDato;
        this.valor = valor;
    }

}
