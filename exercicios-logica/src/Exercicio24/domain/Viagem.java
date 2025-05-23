package Exercicio24.domain;

public class Viagem {
    private double tempoHoras;
    private double velocidadeMedia;

    public Viagem(double tempoHoras, double velocidadeMedia) {
        this.tempoHoras = tempoHoras;
        this.velocidadeMedia = velocidadeMedia;
    }

    public void calcularConsumo() {
        double distancia = tempoHoras * velocidadeMedia;
        double litrosUsados = distancia / 12;

        System.out.printf("Tempo de viagem: %.2f horas%n", tempoHoras);
        System.out.printf("Velocidade média: %.2f km/h%n", velocidadeMedia);
        System.out.printf("Distância percorrida: %.2f km%n", distancia);
        System.out.printf("Litros de combustível utilizados: %.2f L%n", litrosUsados);
    }
}
