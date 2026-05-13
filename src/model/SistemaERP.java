package model;

public class SistemaERP {

    private Estoque estoque;
    private RegistroVendas registro;

    public SistemaERP(Estoque estoque){
        this.estoque = estoque;
        this.registro = new RegistroVendas();

    }
    public Produto buscarProdutoMaisVendido(){
        return registro.buscarProdutoMaisVendido();
    }

    public float consultarTotalPorCliente(Cliente cliente){
        return registro.calcularTotalPorCliente(cliente);
    }

    public void finalizarVenda(Venda venda){
        registro.adicionarVenda(venda);
    }

    public void listarVendas(){
        registro.listarVendas();
    }

    public void adicionarItemNaVenda(Venda venda, String nomeProduto, int quantidade){

        Produto produtoEncontrado = estoque.buscarProdutoPorNome(nomeProduto);
        if(produtoEncontrado != null){
            venda.adicionarItem(produtoEncontrado, quantidade);
           // System.out.println("Produto adicionado com sucesso!");
        } else{
            System.out.println("Produto: '" + nomeProduto + "' não identificado no sistema. Favor verificar cadastro.");
        }
    }
}

