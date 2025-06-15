package maratonajava.javacore.Qstring.test;

public class StringBuilderTest1 {
    public static void main(String[] args) {
        String nome = "Luis Henrique";
        nome.concat(" cursed");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Luis Henrique");
        sb.append(" cursed").append(" da silva");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
