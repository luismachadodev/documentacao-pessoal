package maratonajava.javacore.Dconstrutores.test;

import maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Solo Leveling", "TV", 12, "Ação", "Kretek");
        anime.imprime();
    }
}
