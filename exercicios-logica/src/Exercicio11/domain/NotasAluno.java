package Exercicio11.domain;

public class NotasAluno {
// 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota
// obtidas, imprima na tela o nome do aluno e
//  se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado
//  sua média final deve ser maior ou igual a 7.

    private String nome;
    private Integer[] notas;

    public NotasAluno(String nome, int nota1, int nota2, int nota3, int nota4) {
        this.nome = nome;
        this.notas = new Integer[]{nota1, nota2, nota3, nota4};
    }

    public double calcularMedia() {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return soma / 4.0;
    }

    public void imprimirMedia() {
        double media = calcularMedia();
        System.out.printf("Aluno: %s%nMédia das notas: %.2f%n", nome, media);
    }

    public void aprovacaoAluno() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println(nome + " foi aprovado.");
        } else {
            System.out.println(nome + " foi reprovado.");
        }
    }
}
