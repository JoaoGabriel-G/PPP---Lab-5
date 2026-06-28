public class Main {
    public static void main(String[] args) {

        AcaoBroker broker = new AcaoBroker();
        
        Acao petr4 = new Acao("PETR4", 35.00);

        Investidor joao = new InvestidorConcreto("João Silva", 30.00, 42.00, broker);

        Investidor maria = new InvestidorConcreto("Maria Souza", 28.00, 38.00, broker);

        petr4.registrarInvestidor(joao);
        petr4.registrarInvestidor(maria);

        petr4.setPreco(36.50);

        petr4.setPreco(39.00);

        petr4.setPreco(43.00);
    }
}