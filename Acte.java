package Hôpital;


public class Acte {

    private int coef;

    private Code code;

    private Type type;

    public Acte (Code code, Type type, int coef) {
        this.code=code;
        this.type=type;
        this.coef=coef;
    }

    public String toString () {
        return code.toString()+ ", coefficient : " + coef + ", de type : " + type.toString();
    }

    public double cout () {
        return code.calculerCout(coef);
    }
}

