package Exercicio19.domain;

public class Tabuada {
    public void imprimirTabuada() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuda do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
