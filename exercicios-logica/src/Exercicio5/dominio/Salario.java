package Exercicio5.dominio;

public class Salario {
    // Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários
    // mínimos esse suário ganha e imprima na tela o resultado.
    // (Base para o Salário mínimo R$ 1.293,20).
    private double salario;
    private static final double SALARIO_MINIMO = 1293.20;

    public Salario(double salario) {
        this.salario = salario;
    }

    public double getQntdSalariosMinimos() {
        return salario / SALARIO_MINIMO;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
