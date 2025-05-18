package Exercicio4.test;

import Exercicio4.dominio.Numero;

import java.util.Scanner;

public class NumeroTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = sc.nextInt();

        Numero numero = new Numero(num);

        System.out.println("Antecessor: " + numero.getAntecessor());
        System.out.println("Sucessor: " + numero.getSucessor());
        sc.close();
    }
}
