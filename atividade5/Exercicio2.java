import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            nomes.add(scanner.nextLine());
        }

        System.out.print("Digite o nome que deseja remover: ");
        String nomeParaRemover = scanner.nextLine();

        if (nomes.remove(nomeParaRemover)) {
            System.out.println("Nome removido com sucesso.");
        } else {
            System.out.println("Nome não encontrado na lista.");
        }

        System.out.println("Lista atual: " + nomes);
        scanner.close();
    }
}
