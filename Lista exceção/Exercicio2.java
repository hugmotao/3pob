import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int i = 0;
        while (i < 5) {
            System.out.printf("Digite o %dº número inteiro: ", i + 1);
            try {
                numeros[i] = Integer.parseInt(scanner.nextLine());
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
            }
        }
        System.out.print("Números digitados: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}
