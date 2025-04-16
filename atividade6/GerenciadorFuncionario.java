package exercicios6.problema2.controle;

import exercicios6.problema2.dominio.*;
import java.util.Scanner;

public class GerenciadorFuncionario {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o nome do funcionário: ");
    String nome = sc.nextLine();

    System.out.println("Digite seu salário base: R$");
    double salario = sc.nextDouble();
    sc.nextLine();

    if(salario<=0) {
      System.out.println("Salário Inexistente!");
      System.exit(1);
    }

    System.out.println("Digite sua categoria: ");
    String categoria = sc.nextLine();
    
    Funcionario funcionario = new Funcionario(nome, salario, categoria);

    System.out.println("Exibindo as informações do funcionário: ");
    funcionario.listarFuncionario();

    funcionario.calcularSalarioFinal();

    sc.close();
  }
}