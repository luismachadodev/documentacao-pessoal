package maratonajava.introducao;

public class Aula07Arrays2 {
    public static void main(String[] args) {
        // byte, short, int, long float e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "Dean";
        nomes[1] = "Castiel";
        nomes[2] = "Sam";
        nomes[3] = "Crowley";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
