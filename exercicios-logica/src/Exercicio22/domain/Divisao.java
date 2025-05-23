package Exercicio22.domain;

public class Divisao {
    private int a;
    private int b;

    public Divisao(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calcular() {
        if (b == 0) {
            System.out.println("DDivisão por zero não é permitida");
            return;
        }
        int quociente = a / b;
        int resto = a % b;
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}
