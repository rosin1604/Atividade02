import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os dois números
        System.out.print("Insira o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Insira o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Solicita ao usuário que insira a operação desejada
        System.out.print("Escolha a operação (+, -, *, /): ");
        String operacao = scanner.next();

        // Variável para armazenar o resultado
        double resultado = 0;

        // Realiza o cálculo com base na operação escolhida
        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                // Verifica se o divisor não é zero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                scanner.close();
                return;
        }

        // Imprime o resultado da operação
        System.out.println("O resultado é: " + resultado);

        // Fecha o scanner
        scanner.close();
    }
}