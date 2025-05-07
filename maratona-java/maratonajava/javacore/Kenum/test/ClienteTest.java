package maratonajava.javacore.Kenum.test;

import maratonajava.javacore.Kenum.dominio.Cliente;
import maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Luis", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Dora", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
