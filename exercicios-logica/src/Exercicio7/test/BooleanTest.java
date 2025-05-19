package Exercicio7.test;

import Exercicio7.domain.ValoresLogicos;

import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor (true/false): ");
        boolean valor1 = sc.nextBoolean();

        System.out.println("Digite o segundo valor (true/false): ");
        boolean valor2 = sc.nextBoolean();

        ValoresLogicos valoresLogicos = new ValoresLogicos(valor1, valor2);

        System.out.println(valoresLogicos.verificaValores());
        sc.close();
    }
}
