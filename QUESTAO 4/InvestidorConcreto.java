public class InvestidorConcreto implements Investidor {

    private String nome;
    private double limiteMinimo;
    private double limiteMaximo;
    private AcaoBroker broker;

    public InvestidorConcreto(String nome, double limiteMinimo, double limiteMaximo, AcaoBroker broker) {
        this.nome = nome;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.broker = broker;
    }

    @Override
    public void atualizar(Acao acao) {
        double precoAtual = acao.getPreco();
        System.out.printf("[Notificação] Investidor %s ciente que %s está R$ %.2f%n", nome, acao.getCodigo(), precoAtual);

        if (precoAtual >= limiteMaximo) {
            System.out.printf("Limite MÁXIMO (R$ %.2f) atingido para %s! %s enviando ordem...%n", limiteMaximo, acao.getCodigo(), nome);
            broker.vender(this.nome, acao.getCodigo(), precoAtual);
        }
        else if (precoAtual <= limiteMinimo) {
            System.out.printf("Limite MÍNIMO (R$ %.2f) atingido para %s! %s enviando ordem...%n", limiteMinimo, acao.getCodigo(), nome);
            broker.comprar(this.nome, acao.getCodigo(), precoAtual);
        }
    }
}