import java.util.ArrayList;
import java.util.Scanner;

public class lista5exerc2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
        }

        System.out.print("Digite o nome que deseja remover: ");
        String nomeParaRemover = scanner.nextLine().trim();

        if (nomeParaRemover.isEmpty()) {
            System.out.println("O nome informado está vazio. Operação cancelada.");
        } else if (nomes.remove(nomeParaRemover)) {
            System.out.println("Nome '" + nomeParaRemover + "' removido com sucesso.");
        } else {
            System.out.println("Nome '" + nomeParaRemover + "' não encontrado na lista.");
        }

        System.out.println("Lista atual: " + nomes);
        scanner.close();
    }
}