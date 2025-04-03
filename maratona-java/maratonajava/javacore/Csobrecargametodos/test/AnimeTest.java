package maratonajava.javacore.Csobrecargametodos.test;

import maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Solo Leveling", "TV", 12);
        anime.init("Solo Leveling", "TV", 12, "Ação");
        anime.imprime();
    }
}
