package Exercicio11.test;

import Exercicio11.domain.NotasAluno;

public class NotasAlunoTest {
    public static void main(String[] args) {
        NotasAluno aluno = new NotasAluno("Luis Henrique",7, 8, 9, 6);
        aluno.imprimirMedia();
        aluno.aprovacaoAluno();
    }
}
