import java.util.Scanner;

public class CalculaDesconto {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o valor total da compra
        System.out.print("Insira o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        // Variáveis para armazenar o percentual de desconto e o valor descontado
        double desconto = 0;
        double valorDesconto = 0;

        // Aplica as regras de desconto progressivo
        if (valorCompra > 500) {
            desconto = 20;
        } else if (valorCompra >= 200) {
            desconto = 10;
        } else if (valorCompra >= 100) {
            desconto = 5;
        } else {
            desconto = 0;
        }

        // Calcula o valor do desconto
        valorDesconto = (valorCompra * desconto) / 100;

        // Calcula o valor final após o desconto
        double valorFinal = valorCompra - valorDesconto;

        // Imprime o resultado detalhado
        System.out.println("\nResumo da Compra:");
        System.out.printf("Valor original: R$ %.2f\n", valorCompra);
        System.out.printf("Percentual de desconto aplicado: %.0f%%\n", desconto);
        System.out.printf("Valor descontado: R$ %.2f\n", valorDesconto);
        System.out.printf("Valor final da compra: R$ %.2f\n", valorFinal);

        // Fecha o scanner
        scanner.close();
    }
}