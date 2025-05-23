package Exercicio12.domain;

public class Produto {
    private double valor;
    private int codigo;

    public Produto(double valor, int codigo) {
        this.valor = valor;
        this.codigo = codigo;
    }

    public double calcularValorl() {
        return switch (codigo) {
            case 1 -> valor * 0.85; // 15% de desconto
            case 2 -> valor * 0.90; // 10% de desconto
            case 3 -> valor; // preço normal
            case 4 -> valor * 1.10; // 10% de juros
            default -> {
                System.out.println("Código de pagamento inválido.");
                yield valor;
            }
        };
    }

    public void imprimirValor() {
        double valorFinal = calcularValorl();
        System.out.printf("Valor a ser pago: R$ %.2f%n", valorFinal);
    }
}
