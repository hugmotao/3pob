/* Exercício 3: Simulação de Um Elevador
Descrição:
Implemente um programa que simule o funcionamento básico de um elevador,
permitindo subir, descer e exibir o andar atual.
Requisitos:
1. Criar o pacote dominio contendo a classe Elevador:
o Atributos: andarAtual (int), totalAndares (int).
o Métodos:
▪ subir(): aumenta o andar atual, se não for o último.
▪ descer(): reduz o andar atual, se não for o térreo.
▪ exibirAndar(): exibe o andar atual. */

package exercicios6.problema3.dominio;

public class Elevador {
 
  private int andarAtual;
  private int totalAndares;
  
  public Elevador(int andarAtual, int totalAndares) {
    this.andarAtual = andarAtual;
    this.totalAndares = totalAndares;
  }
  
  public int getAndarAtual() {
    return andarAtual;
  }
  
  public void setAndarAtual(int andarAtual) {
    this.andarAtual = andarAtual;
  }
  
  public int getTotalAndares() {
    return totalAndares;
  }
  
  public void setTotalAndares(int totalAndares) {
    this.totalAndares = totalAndares;
  }

  public void subir() {

    if(andarAtual<0)
      System.out.println("Andar inexistente.");

    if(andarAtual < totalAndares)
      andarAtual++;
    else 
      System.out.println("Você chegou no último andar.");

  }

  public void descer() {

    if(andarAtual<0)
      System.out.println("Andar inexistente.");

    if(andarAtual==0)
    System.out.println("Você chegou no térrero.");

    if(andarAtual <= totalAndares)
      andarAtual--;
  }

  public void exibirAndar() {
    System.out.println("Andar atual: " + andarAtual);
  }
}