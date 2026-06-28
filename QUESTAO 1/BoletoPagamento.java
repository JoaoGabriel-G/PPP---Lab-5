public class BoletoPagamento implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " gerado via Boleto Bancário. Código de barras emitido!");
    }
}