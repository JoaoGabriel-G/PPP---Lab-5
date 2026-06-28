import java.util.ArrayList;
import java.util.List;

public class Acao {

    private String codigo;
    private double preco;
    private List<Investidor> investidores;

    public Acao(String codigo, double precoInicial) {
        this.codigo = codigo;
        this.preco = precoInicial;
        this.investidores = new ArrayList<>();
    }

    public void registrarInvestidor(Investidor i) {
        investidores.add(i);
    }

    public void removerInvestidor(Investidor i) {
        investidores.remove(i);
    }

    public void notificarInvestidores() {
        for (Investidor investidor : investidores) {
            investidor.atualizar(this);
        }
    }

    public void setPreco(double novoPreco) {
        System.out.println("MERCADO: A ação " + this.codigo + " mudou de preço para R$ " + novoPreco);
        this.preco = novoPreco;
        notificarInvestidores();
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }
}