public class DiaDaSemana {
    public static void main(String[] args) {
        // Cria a variável que armazena o número do dia da semana
        int diaDaSemana = 3; // Exemplo: 3 = quarta-feira

        // Usa a estrutura switch para determinar o dia da semana
        switch (diaDaSemana) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido. Por favor, insira um número de 1 a 7.");
                break;
        }
    }
}