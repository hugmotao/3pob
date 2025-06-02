/* Exercício 2 – Veículo → Carro e Moto
Objetivo: Exercitar o conceito de herança com atributos e métodos específicos por especialização.
Enunciado:
Implemente uma classe genérica chamada Veiculo com os seguintes atributos:
• String marca
• int ano

E os seguintes métodos:
• void exibirDados(): mostra marca e ano.

Crie duas subclasses especializadas:
• Carro: possui um atributo adicional int numeroDePortas
• Moto: possui um atributo adicional boolean temPartidaEletrica

As subclasses devem sobrescrever o método exibirDados() para incluir seus atributos específicos.
Regras:
• Use super() no construtor das subclasses para inicializar marca e ano.
• No main, instancie um Carro e uma Moto, e chame o método exibirDados() para mostrar os
dados de cada objeto. */

package exerciciosHeranca.problema2.controle;

import exerciciosHeranca.problema2.dominio.Carro;
import exerciciosHeranca.problema2.dominio.Moto;

public class ControlaVeiculo {
 
  public static void main(String[] args) {

    Carro carro = new Carro("Fusca", 1980, 4);
    Moto moto = new Moto("Yamaha", 2005, true);

    System.out.println("Exibindo as informações do carro: ");
    carro.exibirDados();

    System.out.println("\nExibindo as informações da moto: ");
    moto.exibirDados();
  }
}