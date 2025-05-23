package Exercicio21.domain;

import java.util.Random;

public class NumeroAleatorio {
    public void gerarValor() {
        Random random = new Random();
        int valor = random.nextInt(101);
        System.out.println("Valor aleatório entre 0 e 100: " + valor);
    }
}
