import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> itens;
    private double valorFrete;

    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
        this.valorFrete = 0.0;
    }

    public void adicionaItem(Item item) {
        this.itens.add(item);
        System.out.println(item.getNome() + " adicionado ao carrinho.");
    }

    public void removeItem(Item item) {
        this.itens.remove(item);
        System.out.println(item.getNome() + " removido do carrinho.");
    }

    public double calculaTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public double calculaFrete(FreteStrategy estrategiaFrete) {
        double totalItens = calculaTotal();
        this.valorFrete = estrategiaFrete.calcular(totalItens);
        return this.valorFrete;
    }

    public void realizaPagamento(PagamentoStrategy estrategiaPagamento) {
        double totalItens = calculaTotal();
        if (totalItens == 0) {
            System.out.println("O carrinho está vazio.");
            return;
        }

        double totalFinal = totalItens + valorFrete;

        System.out.printf("Subtotal: R$ %.2f | Frete: R$ %.2f%n", totalItens, valorFrete);
        System.out.printf("Total a pagar: R$ %.2f%n", totalFinal);

        estrategiaPagamento.pagar(totalFinal);
    }
}