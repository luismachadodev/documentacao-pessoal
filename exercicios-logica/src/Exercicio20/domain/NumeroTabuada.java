package Exercicio20.domain;

public class NumeroTabuada {
    private int numero;

    public NumeroTabuada(int numero) {
        this.numero = numero;
    }

    public void imprimirTabuada() {
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
