package Exercicio18.domain;

public class Crescimento {

    public void calcularAnos() {
        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        int anos = 0;

        while (alturaSara <= alturaFrancisco) {
            alturaFrancisco += 0.02;
            alturaSara += 0.03;
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos para que Sara ultrapasse Francisco.");
    }
}
