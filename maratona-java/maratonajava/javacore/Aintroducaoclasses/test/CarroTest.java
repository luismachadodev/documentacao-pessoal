package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.modelo = "Tunado";
        carro1.ano = 1997;

        carro2.nome = "Impala";
        carro2.modelo = "Chevrolet";
        carro2.ano = 1977;

        System.out.println("Carro 1: " + carro1);
        System.out.println("Carro 2: " + carro2);
    }
}
