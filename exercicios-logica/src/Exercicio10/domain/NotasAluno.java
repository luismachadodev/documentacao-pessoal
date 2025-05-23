package Exercicio10.domain;

public class NotasAluno {
//     10 - Faça um algoritmo que leia três notas obtidas por um aluno, e
//     imprima na tela a média das notas.
    private Integer[] notas;

    public NotasAluno(int nota1, int nota2, int nota3) {
        this.notas = new Integer[]{nota1, nota2, nota3};
    }

    public void imprimirMedia() {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        double media = soma / 3.0;
        System.out.printf("Média das notas: %.2f%n", media);
    }
}
