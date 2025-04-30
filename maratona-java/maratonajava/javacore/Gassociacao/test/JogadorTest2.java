package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.dominio.Jogador;
import maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("CR7");
        Time time = new Time("Gauderios");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
