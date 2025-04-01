package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Luis");
        funcionario1.setIdade(21);
        funcionario1.setSalarios(new double[]{1200, 1000, 753.27});
        funcionario1.imprirDadosFuncionario();
        System.out.println("Media "+ funcionario1.getMedia());
    }
}
