package maratonajava.javacore.Eblocosinicializacao.test;

import maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
