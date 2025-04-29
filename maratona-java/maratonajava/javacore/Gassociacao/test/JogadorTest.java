package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cr7");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Alan Patrick");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
