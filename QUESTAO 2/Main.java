public class Main {
    public static void main(String[] args) {

        CarrinhoCompras carrinho = new CarrinhoCompras();

        Item notebook = new Item("Notebook Gamer", 4500.00);
        Item mouse = new Item("Mouse Sem Fio", 150.00);

        carrinho.adicionaItem(notebook);
        carrinho.adicionaItem(mouse);

        carrinho.calculaFrete(new FreteNormal());
        carrinho.realizaPagamento(new PixPagamento());

        carrinho.calculaFrete(new FreteSedex());
        carrinho.realizaPagamento(new CartaoPagamento());
    }
}