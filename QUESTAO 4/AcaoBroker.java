public class AcaoBroker {
    public void comprar(String nomeInvestidor, String codigoAcao, double preco) {
        System.out.printf("[BROKER] Executando COMPRA para %s: %s por R$ %.2f%n",
                nomeInvestidor, codigoAcao, preco);
    }

    public void vender(String nomeInvestidor, String codigoAcao, double preco) {
        System.out.printf("[BROKER] Executando VENDA para %s: %s por R$ %.2f%n",
                nomeInvestidor, codigoAcao, preco);
    }
}