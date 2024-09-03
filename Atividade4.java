import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // Cria as variáveis para armazenar o nome de usuário e a senha corretos
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";

        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o nome de usuário
        System.out.print("Insira o nome de usuário: ");
        String usuarioInserido = scanner.nextLine();

        // Solicita ao usuário que insira a senha
        System.out.print("Insira a senha: ");
        String senhaInserida = scanner.nextLine();

        // Verifica se o nome de usuário e a senha inseridos correspondem aos valores corretos
        if (usuarioInserido.equals(usuarioCorreto) && senhaInserida.equals(senhaCorreta)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos.");
        }

        // Fecha o scanner
        scanner.close();
    }
}