package Exercicio9.test;

import Exercicio9.domain.CalcularImc;

public class CalcularImcTest {
    public static void main(String[] args) {
        CalcularImc pessoa = new CalcularImc(64, 1.66);
        pessoa.imprimirCondicaoImc();
    }
}
