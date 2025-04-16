/* Exercício 1: Controle de Conta Bancária
Crie um programa que simule uma conta bancária, permitindo depósitos e saques.

Requisitos:
1. Criar o pacote dominio contendo a classe ContaBancaria:
o Atributos: titular (String), saldo (double).
o Métodos:
▪ depositar(double valor): adiciona um valor ao saldo.
▪ sacar(double valor): subtrai um valor do saldo, se houver
saldo suficiente.
▪ exibirSaldo(): exibe o saldo atual.

2. Criar o pacote controle contendo a classe GerenciadorConta:
* Permitir que o usuário cadastre uma conta e realize operações
(depositar, sacar, consultar saldo).
* Utilizar um while para continuar as operações até o usuário escolher
sair. */

package exercicios6.problema1.controle;

import exercicios6.problema1.dominio.*;
import java.util.Scanner;

public class GerenciarConta {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Titular da Conta:");
    String titular = sc.nextLine();
    
    System.out.println("Saldo da conta:");
    double saldo = sc.nextDouble();
    ContaBancaria conta = new ContaBancaria(titular, saldo);
    
    System.out.println("Exibindo as informações da conta:");
    conta.listarContaBancaria();

    while(true) {

      System.out.println("\n------- MENU -------");
      System.out.println("(1)Depositar (2)Sacar (3)Consultar Saldo (4)Sair");
      int op = sc.nextInt();
  
      if(op==4) {
        System.out.println("Programa Finalizado com sucesso!");
        break; 
      }
    
      switch (op) {
        case 1:
          System.out.println("Digite o valor do depósito: ");
          double deposito = sc.nextDouble();
          conta.depositar(deposito);
          break;
        case 2:
          System.out.println("Digite o valor do saque: ");
          double saque = sc.nextDouble();
          conta.sacar(saque);
          break;
        case 3:
          conta.exibirSaldo();
          break;
        default:
          System.out.println("Opção Inexistente!");
      }
    }

    sc.close();
  }
}