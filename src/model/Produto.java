package model;

public class Produto {

    private String nome;
    private float preco;
    private int quantidadeEstoque;

    public Produto(String nome, float preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public boolean baixarEstoque(int quantidade){
        if (quantidade > quantidadeEstoque){
            return false;
        }else{
            quantidadeEstoque -= quantidade;
            return true;
        }

    }

}
