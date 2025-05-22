package Exercicio8.domain;

import java.util.Arrays;
import java.util.Collections;

public class ValoresDecrescente {
//    8 - Faça um algoritmo que leia três valores inteiros diferentes e
//    imprima na tela os valores em ordem decrescente.
    private Integer[] numeros;

    public ValoresDecrescente(int numero1, int numero2, int numero3) {
        this.numeros = new Integer[]{numero1, numero2, numero3};
    }

    public void imprimirEmOrdemDecrescente() {
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("Valores em ordem decrescente: " + Arrays.toString(numeros));
    }
}
