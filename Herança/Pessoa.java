package exerciciosHeranca.problema1.dominio;

public class Pessoa {
 
  protected String nome;
  protected int idade;
  
  public Pessoa(String nome, int idade) {  //Construtor 
    this.nome = nome;
    this.idade = idade;
  }

  public void exibirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
  }
}