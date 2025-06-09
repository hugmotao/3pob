import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Cadastrar novo veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Sair");
            System.out.print(">> ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer
            switch (opcao) {
                case 1:
                    System.out.print("Tipo (1-Carro, 2-Moto, 3-Caminhão): ");
                    int tipo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Placa: ");
                    String placa = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    if (tipo == 1) {
                        System.out.print("Qtd Portas: ");
                        int portas = sc.nextInt();
                        sc.nextLine();
                        veiculos.add(new Carro(placa, modelo, ano, portas));
                    } else if (tipo == 2) {
                        System.out.print("Cilindrada: ");
                        int cilindrada = sc.nextInt();
                        sc.nextLine();
                        veiculos.add(new Moto(placa, modelo, ano, cilindrada));
                    } else if (tipo == 3) {
                        System.out.print("Capacidade de Carga (toneladas): ");
                        double carga = sc.nextDouble();
                        sc.nextLine();
                        veiculos.add(new Caminhao(placa, modelo, ano, carga));
                    } else {
                        System.out.println("Tipo inválido!");
                    }
                    break;
                case 2:
                    if (veiculos.isEmpty()) {
                        System.out.println("Nenhum veículo cadastrado.");
                    } else {
                        for (Veiculo v : veiculos) {
                            v.exibirDados();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
        sc.close();
    }
}
