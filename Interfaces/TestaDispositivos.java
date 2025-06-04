import java.util.Scanner;

public class TestaDispositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DispositivoEletronico smartphone = new Smartphone();
        DispositivoEletronico televisao = new Televisao();
        while (true) {
            System.out.println("Escolha o dispositivo:");
            System.out.println("1 - Smartphone");
            System.out.println("2 - Televisão");
            System.out.println("0 - Sair");
            int escolha = sc.nextInt();
            if (escolha == 0) break;
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            int acao = sc.nextInt();
            if (escolha == 1) {
                if (acao == 1) smartphone.ligar();
                else if (acao == 2) smartphone.desligar();
            } else if (escolha == 2) {
                if (acao == 1) televisao.ligar();
                else if (acao == 2) televisao.desligar();
            }
        }
        sc.close();
    }
}
