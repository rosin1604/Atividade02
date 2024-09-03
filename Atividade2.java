public class ClassificaNota {
    public static void main(String[] args) {
        // Cria a variável nota e atribui um valor
        double nota = 8.5;

        // Classifica a nota usando condições encadeadas
        if (nota >= 9) {
            System.out.println("Classificação: Excelente");
        } else if (nota >= 7) {
            System.out.println("Classificação: Bom");
        } else if (nota >= 5) {
            System.out.println("Classificação: Satisfatório");
        } else {
            System.out.println("Classificação: Insatisfatório");
        }
    }
}