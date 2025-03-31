import java.util.Scanner;

public class lista3exerc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para iniciar a contagem regressiva: ");
        int numero = scanner.nextInt();

        do {
            System.out.println(numero);
            numero--; // Decrementa o contador
        } while (numero >= 0);

        System.out.println("Contagem regressiva finalizada!");
        scanner.close();
    }
}
