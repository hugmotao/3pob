public class TestaPagamento {
    public static void main(String[] args) {
        Pagamento cartao = new CartaoCredito();
        Pagamento boleto = new BoletoBancario();

        cartao.realizarPagamento(150.0);
        boleto.realizarPagamento(200.0);
    }
}
