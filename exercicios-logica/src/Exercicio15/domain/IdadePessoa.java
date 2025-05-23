package Exercicio15.domain;

public class IdadePessoa {
    private int anoNascimento;

    public IdadePessoa(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void calcularTempoDeVida(int anoAtual) {
        int anos = anoAtual - anoNascimento;
        int meses = anos * 12;
        int dias = anos * 365;

        System.out.println("Idade aproximada:");
        System.out.println(anos + " anos");
        System.out.println(meses + " meses");
        System.out.println(dias + " dias");
    }
}
