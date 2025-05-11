package maratonajava.javacore.Lclassesabstratas.test;

import maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest1 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Rafaela", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Luis", 3500);
        System.out.println(desenvolvedor);
        System.out.println(gerente);
    }
}
