import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        System.out.println("Digite números (digite -1 para encerrar):");
        while (true) {
            double numero = scanner.nextDouble();
            if (numero == -1) break;
            numeros.add(numero);
        }

        for (double numero : numeros) {
            soma += numero;
        }

        double media = numeros.isEmpty() ? 0 : soma / numeros.size();
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        scanner.close();
    }
}
