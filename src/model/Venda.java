package model;

public class Venda {

    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private float valorTotal;

    public Venda(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = produto.getPreco() * quantidade;
    }

    private void realizarVenda() {

        boolean conseguiuBaixar = produto.baixarEstoque(quantidade);

        if(conseguiuBaixar){
            this.valorTotal = produto.getPreco() * quantidade;
        }else{
            System.out.println("Venda não realizada por falta de estoque.");
            this.valorTotal = 0;
        }
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
