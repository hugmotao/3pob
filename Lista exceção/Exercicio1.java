import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double celsius = 0;
            boolean entradaValida = false;
            while (!entradaValida) {
                System.out.print("Digite a temperatura em Celsius: ");
                try {
                    celsius = Double.parseDouble(scanner.nextLine());
                    entradaValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! Por favor, digite um valor numérico.");
                }
            }
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", celsius, fahrenheit);
        }
    }
}
