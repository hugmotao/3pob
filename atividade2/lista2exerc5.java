import java.util.Scanner;

public class lista2exerc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma nota de 0 a 10: ");
        int nota = scanner.nextInt();
        
        switch (nota) {
            case 9:
            case 10:
                System.out.println("Conceito: A");
                break;
            case 7:
            case 8:
                System.out.println("Conceito: B");
                break;
            case 5:
            case 6:
                System.out.println("Conceito: C");
                break;
            case 3:
            case 4:
                System.out.println("Conceito: D");
                break;
            case 0:
            case 1:
            case 2:
                System.out.println("Conceito: E");
                break;
            default:
                System.out.println("Nota inválida.");
                break;
        }
        
        scanner.close();
    }
}
