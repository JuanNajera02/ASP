package Exp;

public class VariableExp extends Exp {
    public String name;

    public VariableExp(String varName) {
        super(ExpType.VARIABLE_EXP);
        this.name = varName;
    }
}
