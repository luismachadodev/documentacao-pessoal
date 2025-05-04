package maratonajava.javacore.Hheranca.test;

import maratonajava.javacore.Hheranca.dominio.Endereco;
import maratonajava.javacore.Hheranca.dominio.Funcionario;
import maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Luis Henrique");
        pessoa.setCpf("111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-----------");

        Funcionario funcionario = new Funcionario("Kassadin");
        funcionario.setCpf("666");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();
    }
}
