public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("001", "Teclado Mecânico", 2, 250.00);

        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por item: R$ " + fatura.getPrecoPorItem());
        System.out.println("Total da fatura: R$ " + fatura.getTotalFatura());

        fatura.setQuantidade(3);
        fatura.setPrecoPorItem(200.00);
         System.out.println("\nApós atualização:");
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por item: R$ " + fatura.getPrecoPorItem());
        System.out.println("Total da fatura: R$ " + fatura.getTotalFatura());
    }
}