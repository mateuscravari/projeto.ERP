package model;
import java.util.ArrayList;

public class Venda {

    private Cliente cliente;
    private ArrayList<ItemVenda> itens = new ArrayList<>(); //cria array para armazenar os produtos

    public Venda(Cliente cliente){
        this.cliente = cliente;
    }

    public void adicionarItem(Produto produto, int quantidade){

        boolean conseguiu = produto.baixarEstoque(quantidade);

        if (conseguiu){
            ItemVenda item = new ItemVenda(produto, quantidade);
            itens.add(item);
        } else {
            System.out.println("Sem estoque para o item: " + produto.getNome());
        }
    }

    public float getValorTotal(){
        float total = 0;

        for (ItemVenda item : itens){
            total += item.getSubtotal();
        }

        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }
}
