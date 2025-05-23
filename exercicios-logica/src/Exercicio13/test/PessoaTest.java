package Exercicio13.test;

import Exercicio13.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Luis", 21);
        p1.verificaIdade();

        Pessoa p2 = new Pessoa("Rafaela", 19);
        p2.verificaIdade();
    }
}
