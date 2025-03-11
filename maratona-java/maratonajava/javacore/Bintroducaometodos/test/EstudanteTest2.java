package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Midoriya";
        estudante.idade = 15;
        estudante.sexo = 'M';

        estudante2.nome = "Sakura";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        estudante.imprime();
        estudante2.imprime();

    }
}
