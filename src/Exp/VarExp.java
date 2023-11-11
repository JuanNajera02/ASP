package Exp;

public class VarExp extends Exp {
    public enum TipoDato {
        Cadena, Numero
    }

    public String name;
    public TipoDato tipoDato;
    public Exp valor;

    public VarExp(String varName, TipoDato tipoDato) {
        super(ExpType.VARIABLE_EXP);
        this.tipoDato = tipoDato;
        this.name = varName;

        if (tipoDato == TipoDato.Numero) {
            this.valor = new IntegerExp(0);
        } else if (tipoDato == TipoDato.Cadena) {
            this.valor = new StringExp("");
        }

    }

    public VarExp(String varName, TipoDato tipoDato, Exp valor) {
        super(ExpType.VARIABLE_EXP);
        this.tipoDato = tipoDato;
        this.name = varName;
        this.valor = valor;
    }



}
