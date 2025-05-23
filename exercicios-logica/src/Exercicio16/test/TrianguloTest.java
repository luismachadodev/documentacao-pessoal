package Exercicio16.test;

import Exercicio16.domain.Triangulo;

public class TrianguloTest {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(5, 5, 5);
        t1.verificarTipo();

        Triangulo t2 = new Triangulo(5, 5, 3);
        t2.verificarTipo();

        Triangulo t3 = new Triangulo(5, 4, 3);
        t3.verificarTipo();

        Triangulo t4 = new Triangulo(1, 2, 10);
        t4.verificarTipo();
    }
}
