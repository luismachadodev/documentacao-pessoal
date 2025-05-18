package Exercicio5.test;

import Exercicio5.dominio.Salario;

import java.util.Scanner;

public class SalarioTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: R$ ");
        double salario = sc.nextDouble();

        Salario salarioUser = new Salario(salario);

        System.out.printf("Voce recebe %.2f salários mínimos. ", salarioUser.getQntdSalariosMinimos());
        sc.close();
    }
}
