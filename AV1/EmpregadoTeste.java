public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Silva", 3000.00);
        Empregado empregado2 = new Empregado("Maria", "Oliveira", 4000.00);

        System.out.println("Salário anual de " + empregado1.getNome() + ": R$ " + empregado1.getSalarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + ": R$ " + empregado2.getSalarioAnual());

        empregado1.aplicarAumento(10);
        empregado2.aplicarAumento(10);

        System.out.println("\nApós aumento de 10%:");
        System.out.println("Salário anual de " + empregado1.getNome() + ": R$ " + empregado1.getSalarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + ": R$ " + empregado2.getSalarioAnual());
    }
}