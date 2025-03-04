package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Gelson";
        professor.idade = 60;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " " + "idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
