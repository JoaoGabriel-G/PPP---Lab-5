import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> itens;

    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
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

    public void realizaPagamento(PagamentoStrategy estrategiaPagamento) {
        double total = calculaTotal();
        if (total == 0) {
            System.out.println("O carrinho está vazio. Adicione itens antes de pagar.");
            return;
        }

        estrategiaPagamento.pagar(total);
    }
}