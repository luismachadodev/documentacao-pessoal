package Exercicio3.test;

import Exercicio3.dominio.SomaValores;

import java.util.Scanner;

public class SomaValoresTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();

        SomaValores calculo = new SomaValores(a, b);

        System.out.println("Resultado (C): " + calculo.getResultado());
        sc.close();
    }
}
