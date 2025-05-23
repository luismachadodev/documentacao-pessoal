package Exercicio14.domain;

public class Valores {
//     Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e
//     o valor de B por A e imprima na tela os valores.
    private int a;
    private int b;

    public Valores(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void trocarValores() {
        int temp = a;
        a = b;
        b = temp;
    }

    public void imprimirValores() {
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);
    }
}
