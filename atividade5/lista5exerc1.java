import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lista5exerc1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            try {
                System.out.print("Digite um número inteiro: ");
                numeros.add(scanner.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
                continue;
            }
            System.out.print("Deseja adicionar outro número? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Você digitou os seguintes números: " + numeros);
        scanner.close();
    }
}