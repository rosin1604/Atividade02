import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o salário bruto do funcionário
        System.out.print("Insira o salário bruto do funcionário: R$ ");
        double salarioBruto = scanner.nextDouble();

        // Solicita o número de anos que o funcionário trabalhou na empresa
        System.out.print("Insira o número de anos que o funcionário trabalhou na empresa: ");
        int anosTrabalhados = scanner.nextInt();

        // Variáveis para armazenar o bônus e o imposto
        double bonus = 0;
        double imposto = 0;

        // Aplica as regras de bonificação
        if (anosTrabalhados > 10) {
            bonus = salarioBruto * 0.10; // 10% de bônus
        } else if (anosTrabalhados >= 5) {
            bonus = salarioBruto * 0.05; // 5% de bônus
        } else {
            bonus = 0; // Sem bônus
        }

        // Aplica as regras de desconto de impostos
        if (salarioBruto > 5000) {
            imposto = salarioBruto * 0.27; // 27% de imposto
        } else if (salarioBruto >= 3000) {
            imposto = salarioBruto * 0.18; // 18% de imposto
        } else {
            imposto = salarioBruto * 0.10; // 10% de imposto
        }

        // Calcula o salário líquido
        double salarioLiquido = salarioBruto + bonus - imposto;

        // Imprime os resultados
        System.out.println("\nResumo do Salário:");
        System.out.printf("Salário bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Bônus recebido: R$ %.2f\n", bonus);
        System.out.printf("Imposto descontado: R$ %.2f\n", imposto);
        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);

        // Fecha o scanner
        scanner.close();
    }
}