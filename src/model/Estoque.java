package model;

public class Estoque {

    int contador = 0;
    Produto[] produtos = new Produto[100];

    public void adicionarProduto(Produto p) {
        produtos[contador] = p;
        contador++;
    }

    public void listarProdutos(){
        for(int i = 0; i < contador; i++){
            System.out.println("Produto: " + produtos[i].getNome() + " - Quantidade estoque: " + produtos[i].getQuantidadeEstoque());
        }
    }

    public Produto buscarProdutoPorNome(String nome){
        for (int i = 0 ; i < contador; i++){
            if (produtos[i].getNome().equalsIgnoreCase(nome)){
                return produtos[i];
            }
        }
        return null;
    }
}