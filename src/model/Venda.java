package model;

public class Venda {

    private Cliente cliente;
    private ItemVenda[] itens = new ItemVenda[100];
    private int contadorItens = 0;

    public Venda (Cliente cliente){
        this.cliente = cliente;
    }

    public void adicionarItem(Produto produto, int quantidade){

        boolean conseguiu = produto.baixarEstoque(quantidade);

        if(conseguiu){
            itens[contadorItens] = new ItemVenda(produto, quantidade);
            contadorItens++;
        } else {
            System.out.println("\nESTOQUE INSUFICIENTE: " + produto.getNome() + " - " + produto.getQuantidadeEstoque() + " unidades disponiveis");
            System.out.println("\n---------------------------------------------------------");
        }
    }

    public float getValorTotal(){
        float total = 0;

        for (int i = 0; i < contadorItens; i++){
            total += itens[i].getSubtotal();
        }
       return total;
    }

    public void listarItensDaVenda(){
        for (int i = 0; i < contadorItens; i++){
            System.out.println("Produto: " + itens[i].getProduto().getNome() + " | Quantidade: " + itens[i].getQuantidade() + " | Subtotal: R$ " + itens[i].getSubtotal());
        }
    }



    public Cliente getCliente() {
        return cliente;
    }

    public ItemVenda[] getItens() {
        return itens;
    }

    public int getContadorItens() {
        return contadorItens;
    }
}
