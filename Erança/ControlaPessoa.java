/* Exercício 1 – Classe Pessoa → Aluno e Professor
Objetivo: Criar uma classe genérica Pessoa e especializar em Aluno e Professor.
Crie uma hierarquia de classes com base na generalização de uma Pessoa. Essa classe deve conter
os seguintes atributos:
• String nome
• int idade

A partir dessa classe, crie duas subclasses:
• Aluno: com o atributo extra String curso
• Professor: com o atributo extra double salario

Implemente um método exibirDados() na classe Pessoa que mostre o nome e a idade. Faça a
sobrescrita desse método nas subclasses para incluir os dados específicos.

Requisitos:
• Use super() no construtor das subclasses.
• Teste a criação de um objeto de cada tipo e chame exibirDados() para ambos. */

package exerciciosHeranca.problema1.controle;

import exerciciosHeranca.problema1.dominio.*;

public class ControlaPessoa {
 
  public static void main(String[] args) {

    Aluno aluno = new Aluno("Marcos", 18, "ADS");
    Professor professor = new Professor("José", 50, 50.25);

    System.out.println("Exibindo dados do aluno: ");
    aluno.exibirDados();

    System.out.println("\nExibindo dados do professor: ");
    professor.exibirDados();
  }
} 