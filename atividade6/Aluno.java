/* Exercício 4: Validação de Nota de um Aluno
Descrição:
Crie um programa que leia uma nota de um aluno e verifique sua validade. Se for
válida, classifique o aluno conforme sua média.

Requisitos:
1. Criar o pacote dominio contendo a classe Aluno:

o Atributos: nome (String), nota (double).
o Métodos:
▪ validarNota(): verifica se a nota está entre 0 e 10.
▪ classificarAluno(): classifica o aluno:
▪ Nota >= 7 → "Aprovado"
▪ Nota >= 5 e < 7 → "Recuperação"
▪ Nota < 5 → "Reprovado" */

package exercicios6.problema4.dominio;

public class Aluno {
 
  private String nome;
  private double nota;

  public Aluno(String nome, double nota) {
    this.nome = nome;
    this.nota = nota;
  }
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public double getNota() {
    return nota;
  }
  
  public void setNota(double nota) {
    this.nota = nota;
  }

  public boolean validarNota() {

    if(nota>=0 && nota<=10) {
      System.out.println("Nota válida.");
      return true;
    } 
    else 
      System.out.println("Nota Inválida.");

    return false;
  }

  public void classificarAluno() {

    if(nota>=7) 
      System.out.println("Aluno aprovado!");
    else if(nota >=5) 
      System.out.println("Aluno em Recuperação!");
    else 
      System.out.println("Aluno reprovado");
  }
}