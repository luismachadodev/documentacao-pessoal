package Exercicio14.test;

import Exercicio14.domain.Valores;

public class ValoresTest {
    public static void main(String[] args) {
        Valores v = new Valores(10, 20);
        System.out.println("Antes da troca: ");
        v.imprimirValores();

        System.out.println("----------");
        v.trocarValores();

        System.out.println("Depois da troca: ");
        v.imprimirValores();
    }
}
