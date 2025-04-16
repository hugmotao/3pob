/* 2. Criar o pacote controle contendo a classe SimuladorElevador:
*Permitir que o usuário suba e desça os andares de acordo com sua escolha.

*Garantir que o elevador não ultrapasse os limites (térreo e último andar).

*Utilizar um do-while para manter a simulação em execução até o
usuário escolher sair. */

package exercicios6.problema3.controle;

import exercicios6.problema3.dominio.*;
import java.util.Scanner;

public class SimuladorElevador {
 
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o total de andares do prédio: ");
    int totalAndares = sc.nextInt();

    System.out.println("Digite o andar atual:");
    int andar = sc.nextInt();

    Elevador elevador = new Elevador(andar, totalAndares);
    int op;
    do {

      System.out.println("\n-------- MENU --------");
      System.out.println("(1) Subir");
      System.out.println("(2) Descer");
      System.out.println("(3) Exibir Andar");
      System.out.println("(4) Sair");
      op = sc.nextInt();

      switch (op) {
        case 1:
          elevador.subir();
          System.out.println("Você subiu de andar");
          break;
        
        case 2:
          elevador.descer();
          System.out.println("Você desceu de andar");
          break;
        
        case 3:
          elevador.exibirAndar();
          break;

        case 4:
          System.out.println("Programa encerrado com sucesso.");
          break;
      
        default:
          System.out.println("Opção inexistente.");
      }

    } while(op!=4);

    sc.close();
  }
}