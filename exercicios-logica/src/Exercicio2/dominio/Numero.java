package Exercicio2.dominio;

public class Numero {
    // 2 - Faça um algoritmo para receber um número qualquer e
    // imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public boolean ehPar() {
        return numero % 2 == 0;
    }

    public boolean ehPositivo() {
        return numero >= 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
