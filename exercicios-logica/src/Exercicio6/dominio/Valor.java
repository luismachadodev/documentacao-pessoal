package Exercicio6.dominio;

public class Valor {
    // 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
    private double valor;

    public Valor(double valor) {
        this.valor = valor;
    }

    public double getValorReajuste() {
        return valor * 1.05;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
