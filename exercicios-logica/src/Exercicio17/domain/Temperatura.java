package Exercicio17.domain;

public class Temperatura {
    private double fahrenheit;

    public Temperatura(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double converterParaCelsius() {
        return (5 * (fahrenheit - 32)) / 9;
    }

    public void imprimirTemperaturas() {
        double celsius = converterParaCelsius();
        System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Temperatura em Celsius: %.2f°C%n", celsius);
    }
}
