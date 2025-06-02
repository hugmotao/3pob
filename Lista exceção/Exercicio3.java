import java.util.Scanner;

class PrecoInvalidoException extends Exception {
    public PrecoInvalidoException(String mensagem) {
        super(mensagem);
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) throws PrecoInvalidoException {
        if (preco <= 0) {
            throw new PrecoInvalidoException("Preço deve ser maior que zero.");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return "Produto: " + nome + ", Preço: R$ " + preco;
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        try {
            double preco = Double.parseDouble(scanner.nextLine());
            Produto produto = new Produto(nome, preco);
            System.out.println(produto);
        } catch (PrecoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Preço inválido! Digite um valor numérico.");
        }
        scanner.close();
    }
}
