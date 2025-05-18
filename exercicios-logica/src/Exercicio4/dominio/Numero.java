package Exercicio4.dominio;

public class Numero {
    // 4 - Faça um algoritmo que receba um número inteiro e
    // imprima na tela o seu antecessor e o seu sucessor.
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getAntecessor() {
        return numero - 1;
    }

    public int getSucessor() {
        return numero + 1;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
