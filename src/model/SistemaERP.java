package model;

public class SistemaERP {

    private Estoque estoque;

    public SistemaERP(Estoque estoque){
        this.estoque = estoque;
    }

    public void adicionarItemNaVenda(Venda venda, String nomeProduto, int quantidade){

        Produto produtoEncontrado = estoque.buscarProdutoPorNome(nomeProduto);
        if(produtoEncontrado != null){
            venda.adicionarItem(produtoEncontrado, quantidade);
           // System.out.println("Produto adicionado com sucesso!");
        } else{
            System.out.println("Produto não localizado no estoque.");
        }
    }
}

