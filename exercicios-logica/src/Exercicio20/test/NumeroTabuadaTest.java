package Exercicio20.test;

import Exercicio20.domain.NumeroTabuada;

import java.util.Scanner;

public class NumeroTabuadaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para ver sua tabuada: ");
        int numero = sc.nextInt();

        NumeroTabuada tabuada = new NumeroTabuada(numero);
        tabuada.imprimirTabuada();
        sc.close();
    }
}
