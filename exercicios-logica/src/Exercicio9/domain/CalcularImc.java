package Exercicio9.domain;

public class CalcularImc {
    private double peso;
    private double altura;

    public CalcularImc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void imprimirCondicaoImc() {
        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f - ", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal (parabéns)");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }
    }
}
