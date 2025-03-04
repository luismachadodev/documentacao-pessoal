package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Dean";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante);
    }
}
