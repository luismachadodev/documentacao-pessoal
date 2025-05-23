package Exercicio15.test;

import Exercicio15.domain.IdadePessoa;

public class IdadePessoaTest {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa(2003);
        pessoa.calcularTempoDeVida(2025);
    }
}
