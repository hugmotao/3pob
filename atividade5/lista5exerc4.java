import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lista5exerc4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.print("Número " + (i + 1) + ": ");
                numeros.add(scanner.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
                i--; // Repetir a iteração para corrigir a entrada
            }
        }

        System.out.print("Digite um número para contar as ocorrências: ");
        int numeroParaContar;
        try {
            numeroParaContar = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Encerrando o programa.");
            scanner.close();
            return;
        }

        int ocorrencias = 0;
        for (int numero : numeros) {
            if (numero == numeroParaContar) {
                ocorrencias++;
            }
        }

        System.out.println("O número " + numeroParaContar + " aparece " + ocorrencias + " vez(es).");
        scanner.close();
    }
}