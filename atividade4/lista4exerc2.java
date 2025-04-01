import java.util.Scanner;

public class lista4exerc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];

        System.out.println("Digite 4 notas:");
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("Média: " + media);
        System.out.println(media >= 7 ? "Aprovado" : "Reprovado");

        scanner.close();
    }
}
