package projetos.projeto1.controle;

import projetos.projeto1.dominio.*;
import java.util.Scanner;

public class ControlaPessoa {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com o nome: ");  //pedindo ao usuário as informações necessárias
    String nome = sc.nextLine();

    System.out.println("Entre com a idade: ");
    int idade = sc.nextInt();

    System.out.println("Entre com a altura: ");
    double altura = sc.nextDouble();    
    
    System.out.println("Entre com o peso: ");
    double peso = sc.nextDouble();

    System.out.println("Entre com o sexo: ");
    char sexo = sc.next().charAt(0);

    Pessoa pessoa = new Pessoa(nome, idade, altura, peso, sexo);  //criando um novo objeto

    System.out.println("Exibindo os dados das pessoas: ");  //exibindo os resultados
    pessoa.listarPessoa();
    System.out.println("Exibindo seu IMC: " + pessoa.calcularIMC());
    System.out.println("Classificação do IMC da pessoa: " + pessoa.classificarIMC());

    sc.close();
  }
}