import java.util.Scanner;

class LoginInvalidoException extends Exception {
    public LoginInvalidoException(String mensagem) {
        super(mensagem);
    }
}

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
            if (usuario == null || usuario.trim().isEmpty() || senha == null || senha.trim().isEmpty()) {
                throw new LoginInvalidoException("Nome de usuário e senha não podem ser vazios!");
            }
            System.out.println("Login realizado com sucesso!");
        } catch (LoginInvalidoException e) {
            System.out.println("Erro de login: " + e.getMessage());
        }
        scanner.close();
    }
}
