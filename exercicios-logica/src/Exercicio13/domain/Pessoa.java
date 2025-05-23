package Exercicio13.domain;

public class Pessoa {
//    Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome
//    da pessoa e se ela é maior ou menor de idade.
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void verificaIdade() {
        if (idade < 18) {
            System.out.println(nome + " é menor de idade.");
        } else {
            System.out.println(nome + " é maior de idade.");
        }
    }
}
