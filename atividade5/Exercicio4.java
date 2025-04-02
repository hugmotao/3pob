import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros.add(scanner.nextInt());
        }

        System.out.print("Digite um número para contar as ocorrências: ");
        int numeroParaContar = scanner.nextInt();
        int ocorrencias = 0;

        for (int numero : numeros) {
            if (numero == numeroParaContar) {
                ocorrencias++;
            }
        }

        System.out.println("O número " + numeroParaContar + " aparece " + ocorrencias + " vezes.");
        scanner.close();
    }
}
