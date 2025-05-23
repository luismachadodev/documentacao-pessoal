package Exercicio23.domain;

public class Professor {
    private double valorHoraAula;
    private int numeroAulas;
    private double percentualInss;

    public Professor(double valorHoraAula, int numeroAulas, double percentualInss) {
        this.valorHoraAula = valorHoraAula;
        this.numeroAulas = numeroAulas;
        this.percentualInss = percentualInss;
    }

    public void calcularSalarioLiquido() {
        double salarioBruto = valorHoraAula * numeroAulas;
        double descontoInss = salarioBruto * (percentualInss / 100);
        double salarioLiquido = salarioBruto - descontoInss;

        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
    }

}
