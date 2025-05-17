package Exercicio1.test;

import Exercicio1.dominio.Numeros;

import java.util.Scanner;

public class NumerosTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int a = sc.nextInt();

        System.out.println("Digite o valor de B");
        int b = sc.nextInt();

        System.out.println("Digite o valor de C");
        int c = sc.nextInt();

        Numeros numeros = new Numeros(a, b, c);
        int soma = numeros.getA() + numeros.getB();

        System.out.println("A soma de A + B é: " + soma);

        if (soma < numeros.getC()) {
            System.out.println("A soma é menor que C");
        } else {
            System.out.println("A soma não é menor que C");
        }
        sc.close();
    }
}
