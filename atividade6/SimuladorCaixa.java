/* 2. Criar o pacote controle contendo a classe SimuladorCaixa:
o Permitir que o usuário realize múltiplos saques, verificando a
validade do valor.
o Utilizar um while para continuar as operações até o usuário decidir
sair. */

package exercicios6.problema5.controle;

import java.util.Scanner;
import exercicios6.problema5.dominio.*;

public class SimuladorCaixa {
 
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor da sua conta: ");
    double valor = sc.nextDouble();

    CaixaEletronico caixa = new CaixaEletronico(valor);
    System.out.println("Exibindo seu saldo: R$ " + valor);

    int op;
    while(true) {

      System.out.println("-------- MENU --------");
      System.out.println("(1) Sacar");
      System.out.println("(2) Exibir o saldo");
      System.out.println("(3) Sair");
      op = sc.nextInt();

      if(op==3)
        break;

      switch (op) {
        case 1:
          System.out.println("Digite o valor para sacar: ");
          double saque = sc.nextDouble();
          caixa.sacar(saque);
          break;
        
        case 2:
          caixa.exibirSaldo();
          break;
        
        case 3:
          System.out.println("Programa finalizado com sucesso."); 
          break;

        default:
          System.out.println("Opção inexistente.");
      }
    }

    sc.close();
  }
}