package Exercicio6.test;

import Exercicio6.dominio.Valor;

import java.util.Scanner;

public class ValorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valorDigitado = sc.nextDouble();

        Valor valor = new Valor(valorDigitado);

        System.out.printf("Valor com reajuste de 5%%: R$ %.2f\n", valor.getValorReajuste());
        sc.close();
    }
}
