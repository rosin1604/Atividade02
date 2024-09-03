import java.util.Scanner;

public class ClassificaTemperatura {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura em graus Celsius
        System.out.print("Insira a temperatura em graus Celsius: ");
        double temperatura = scanner.nextDouble();

        // Classifica a temperatura e imprime a classificação correspondente
        if (temperatura > 30) {
            System.out.println("Quente");
        } else if (temperatura >= 15) {
            System.out.println("Agradável");
        } else {
            System.out.println("Frio");
        }

        // Fecha o scanner
        scanner.close();
    }
}