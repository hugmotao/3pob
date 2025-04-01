import java.util.Scanner;

public class lista4exerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        System.out.println("Digite 8 números inteiros:");
        int contagemPares = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) contagemPares++;
        }

        System.out.println("Quantidade de números pares: " + contagemPares);

        scanner.close();
    }
}
