package model;

public class VendaService {

    public Venda realizarVenda(Cliente cliente, Produto produto, int quantidade){

        boolean conseguiu = produto.baixarEstoque(quantidade);

        if (conseguiu) {
            Venda venda = new Venda(cliente, produto, quantidade);
            return venda;
        } else {
            System.out.println("Venda não realizada");
            return null;
        }
    }
}