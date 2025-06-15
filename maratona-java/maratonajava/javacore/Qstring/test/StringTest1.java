package maratonajava.javacore.Qstring.test;

public class StringTest1 {
    public static void main(String[] args) {
        String nome = "Luis"; //String constant pool
        String nome2 = "Luis";
        nome = nome.concat(" Henrique"); // nome += " Henrique"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Luis"); // 1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
