package Exercicio2.test;

import Exercicio2.dominio.Numero;

import java.util.Scanner;

public class NumeroTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero qualquer: ");
        int numeroQualquer = sc.nextInt();

        Numero numero = new Numero(numeroQualquer);

        if (numero.ehPar()) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

        System.out.println("------");

        if (numero.ehPositivo()) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }

        sc.close();
    }
}
