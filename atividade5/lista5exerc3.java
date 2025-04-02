import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lista5exerc3 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        System.out.println("Digite números (digite -1 para encerrar):");
        while (true) {
            try {
                double numero = scanner.nextDouble();
                if (numero == -1) break;
                numeros.add(numero);
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa a entrada inválida
            }
        }

        for (double numero : numeros) {
            soma += numero;
        }

        double media = numeros.isEmpty() ? 0 : soma / numeros.size();
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
        scanner.close();
    }
}