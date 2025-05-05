package maratonajava.javacore.Jmodificadorfinal.test;

import maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Abel");
        System.out.println(carro.COMPRADOR);
    }
}
