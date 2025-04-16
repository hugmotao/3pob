/* Exercício 2: Cálculo de Salário com Bônus
Descrição:
Crie um programa que calcule o salário final de um funcionário, considerando um
bônus de acordo com sua categoria.

Requisitos:
1. Criar o pacote dominio contendo a classe Funcionario:
* Atributos: nome (String), salarioBase (double), categoria (String).
* Método:
▪ calcularSalarioFinal(): adiciona um bônus ao salário base:
▪ "A" → +20%
▪ "B" → +10%
▪ "C" → sem bônus
* Utilizar switch-case para aplicar a regra do bônus. 

2. Criar o pacote controle contendo a classe GerenciadorFuncionario:
Permitir que o usuário cadastre um funcionário e consulte seu
salário final. */

package exercicios6.problema2.dominio;

public class Funcionario {
 
  private String nome;  //declarando as variáveis
  private double salarioBase;
  private String categoria;

  public Funcionario(String nome, double salarioBase, String categoria) {  //método construtor 
    this.nome = nome;
    this.salarioBase = salarioBase;
    this.categoria = categoria;
  }

  public String getNome() {  //"getters and setters"
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }
  
  public void listarFuncionario() {
    System.out.println("\nNome: " + nome);
    System.out.println("Salário Base: R$" + salarioBase);
    System.out.println("Categoria: " + categoria + "\n");
  }

  public void calcularSalarioFinal() {

    switch (categoria) {
      case "A":
        salarioBase +=  salarioBase * 0.2;
        System.out.println("Bônus de 20% adicionado ao seu sálario base! Salário Atual: R$" + salarioBase);
        break;

      case "B":
        salarioBase +=  salarioBase * 0.1;
        System.out.println("Bônus de 10% adicionado ao seu sálario base! Salário Atual: R$" + salarioBase);
        break;

      case "C":
        System.out.println("Nenhum bônus adicionado ao seu salário base! Salário atual: R$" + salarioBase);
        break;
        
      default:
        System.out.println("Categoria inexistente...");
    }
  }
}