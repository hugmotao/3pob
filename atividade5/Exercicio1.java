import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite um número: ");
            numeros.add(scanner.nextInt());
            System.out.print("Deseja adicionar outro número? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Números digitados: " + numeros);
        scanner.close();
    }
}
