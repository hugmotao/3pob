import java.util.Scanner;

public class lista3exerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos na turma: ");
        int numeroAlunos = scanner.nextInt();
        double somaNotas = 0;

        for (int i = 1; i <= numeroAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota; // Acumula as notas
        }

        double media = somaNotas / numeroAlunos;
        System.out.println("A média da turma é: " + media);

        scanner.close();
    }
}
