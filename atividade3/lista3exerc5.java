import java.util.Scanner;

public class lista3exerc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int fim = scanner.nextInt();

        System.out.println("Números primos no intervalo entre " + inicio + " e " + fim + ":");
        for (int i = Math.min(inicio, fim); i <= Math.max(inicio, fim); i++) {
            if (i > 1) { // Números primos são maiores que 1
                boolean ehPrimo = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
                if (ehPrimo) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}