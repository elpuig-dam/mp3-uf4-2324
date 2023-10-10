package setmana4.enums;

public enum Qualifier {
    NO_SATISFACTORI("NS",0),
    SATISFACTORI("ST",5),
    NOTABLE("NT",8),
    EXCELLENT("EX",10);

    private String code;
    private int valor;

    Qualifier(String code, int valor) {
        this.code = code;
        this.valor = valor;
    }

    public String getCode() {
        return code;
    }

    public int getValor() {
        return valor;
    }
}
