package maratonajava.javacore.introducaoclasses.test;

import maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Dean";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante);
    }
}
