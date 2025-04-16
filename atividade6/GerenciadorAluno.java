/* 2. Criar o pacote controle contendo a classe GerenciadorAluno:
o Solicitar o nome e a nota do aluno e verificar sua validade antes de
exibir a classificação.
o Utilizar um while para garantir que o usuário informe uma nota
válida. */

package exercicios6.problema4.controle;

import exercicios6.problema4.dominio.*;
import java.util.Scanner;

public class GerenciadorAluno {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); 
    System.out.println("Digite o nome do aluno: ");
    String nome = sc.nextLine();

    Aluno aluno = null;
    while(true) {

      System.out.println("Digite a nota do aluno: ");
      double nota = sc.nextDouble();

      aluno = new Aluno(nome, nota);
      if(aluno.validarNota()) 
        break;
      
      System.out.println("Nota inválida, tente novamente.");
    }

    aluno.classificarAluno();

    sc.close();
  }
}