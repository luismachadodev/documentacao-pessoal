package Exercicio7.domain;

public class ValoresLogicos {
    private boolean valor1;
    private boolean valor2;

    public ValoresLogicos(boolean valor1, boolean valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public String verificaValores() {
        if (valor1 && valor2) {
            return "Ambos são verdadeiros.";
        } else if (!valor1 && !valor2) {
            return "Ambos são falsos.";
        } else {
            return "Os valores são diferentes.";
        }


    }
}
