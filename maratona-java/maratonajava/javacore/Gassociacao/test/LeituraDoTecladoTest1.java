package maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Seu Nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite M ou F para seu sexo: ");
        char sexo = sc.next().toUpperCase().charAt(0);

        System.out.println("--------------");
        System.out.println("Nome: "+nome);
        System.out.println("Nome: "+idade);
        System.out.println("Nome: "+sexo);
    }
}
