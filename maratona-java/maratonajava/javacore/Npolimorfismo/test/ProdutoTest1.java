package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest1 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Gauderio", 10);
        Televisao televisao = new Televisao("Samsung 50", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
