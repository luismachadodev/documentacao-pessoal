package Exercicio3.dominio;

public class SomaValores {
//    3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B
//    forem iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de
//    qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.
    private int a;
    private int b;
    private int c;

    public SomaValores(int a, int b) {
        this.a = a;
        this.b = b;
        calcular();
    }

    public void calcular() {
        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
    }

    public int getResultado() {
        return c;
    }
}
