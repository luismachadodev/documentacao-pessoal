package Exercicio12.test;

import Exercicio12.domain.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto(100.00, 1);
        produto1.imprimirValor();

        Produto produto2 = new Produto(100.00, 4);
        produto2.imprimirValor();

    }
}
