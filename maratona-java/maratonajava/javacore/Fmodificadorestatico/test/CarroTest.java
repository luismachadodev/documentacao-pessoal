package maratonajava.javacore.Fmodificadorestatico.test;

import maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);


        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
