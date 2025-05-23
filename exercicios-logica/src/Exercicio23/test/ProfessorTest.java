package Exercicio23.test;

import Exercicio23.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor(50.0, 40, 11);
        professor.calcularSalarioLiquido();
    }
}
