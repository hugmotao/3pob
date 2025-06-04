import java.util.Scanner;

public class TestaFormas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");
        double largura = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();
        FormaGeometrica retangulo = new Retangulo(largura, altura);
        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        FormaGeometrica circulo = new Circulo(raio);
        System.out.println("Retângulo - Área: " + retangulo.calcularArea() + ", Perímetro: " + retangulo.calcularPerimetro());
        System.out.println("Círculo - Área: " + circulo.calcularArea() + ", Perímetro: " + circulo.calcularPerimetro());
        sc.close();
    }
}
