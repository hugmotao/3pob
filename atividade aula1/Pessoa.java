package projetos.projeto1.dominio;

public class Pessoa {

  private String nome;
  private int idade;
  private double altura;
  private double peso;
  private char sexo;

  public Pessoa (String nome, int idade, double altura, double peso, char sexo) {
    this.nome = nome;
    // this.idade = idade;
    this.altura = altura;
    this.peso = peso;
    this.sexo = sexo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  // }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public void listarPessoa() {

    System.out.println("\nNome da pessoa:" + nome);
    System.out.println("\nIdade da pessoa:" + idade);
    System.out.println("\nAltura da pessoa:" + altura);
    System.out.println("\nPeso da pessoa:" + peso);
    System.out.println("\nSexo da pessoa:" + sexo + "\n");
  }

  public double calcularIMC() {
    return (peso/(altura * altura));
  }

  public String classificarIMC() {

    String resposta = "";
    double imc = calcularIMC();

    if(imc < 18.5) {

      resposta = "Magreza";
    } else if(imc <= 24.9) {

      resposta = "Normal";
    } else if(imc <= 29.9) {

      resposta = "Sobrepeso";
    } else if(imc <= 34.9) {

      resposta = "Obesidade grau I";
    } else if(imc <= 39.9) {

      resposta = "Obesidade grau II";
    } else {

      resposta = "Obesidade grau III";
    }

    return resposta;
  }
}