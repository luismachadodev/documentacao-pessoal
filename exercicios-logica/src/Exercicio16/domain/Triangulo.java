package Exercicio16.domain;

public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void verificarTipo() {
        if (ehTrianguloValido()) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os lados não formam um triângulo válido.");
        }
    }

    private boolean ehTrianguloValido() {
        return lado1 + lado2 > lado3 &&
                lado1 + lado3 > lado2 &&
                lado2 + lado3 > lado1;
    }
}