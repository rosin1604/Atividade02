import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a média final do aluno
        System.out.print("Insira a média final do aluno: ");
        double mediaFinal = scanner.nextDouble();

        // Verifica o resultado do aluno com base na média final
        if (mediaFinal >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (mediaFinal >= 5) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        // Fecha o scanner
        scanner.close();
    }
}