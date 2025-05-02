package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.dominio.Aluno;
import maratonajava.javacore.Gassociacao.dominio.Local;
import maratonajava.javacore.Gassociacao.dominio.Professor;
import maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoSeminarioTest {
    public static void main(String[] args) {
        Local local = new Local("Rua Elon Musk");
        Aluno aluno = new Aluno("Leon", 21);
        Professor professor = new Professor("Gelson", "Geografia");
        Aluno[] alunosSeminario = {aluno};

        Seminario seminario = new Seminario("Guerra Fria", alunosSeminario, local);

        Seminario[] seminarioDisponivel = {seminario};

        professor.setSeminarios(seminarioDisponivel);
        professor.imprime();

    }
}
