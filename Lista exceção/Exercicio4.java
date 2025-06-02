import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa por índice");
            System.out.println("3 - Exibir todas as tarefas");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.print("Digite a tarefa: ");
                        String tarefa = scanner.nextLine();
                        tarefas.add(tarefa);
                        System.out.println("Tarefa adicionada!");
                        break;
                    case 2:
                        System.out.print("Digite o índice da tarefa a remover: ");
                        int indice = Integer.parseInt(scanner.nextLine());
                        tarefas.remove(indice);
                        System.out.println("Tarefa removida!");
                        break;
                    case 3:
                        System.out.println("Tarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + ": " + tarefas.get(i));
                        }
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Índice fora do intervalo!");
            }
        }
        scanner.close();
    }
}
