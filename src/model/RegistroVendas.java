package model;

public class RegistroVendas {

    Venda[] vendas = new Venda[100];
    int contador = 0;


    public void adicionarVenda(Venda v) {
        vendas[contador] = v;
        contador++;
    }

    public float calcularTotalPorCliente(Cliente cliente) {
        float total = 0;
        for (int i = 0; i < contador; i++) {
            if (cliente == vendas[i].getCliente()) {
                total += vendas[i].getValorTotal();
            }
        }
        return total;
    }

    public Cliente buscarClienteQueMaisComprou(){

        Cliente clienteQueMaisComprou = null;
        float maiorValor = 0;

        for (int i = 0; i < contador; i++){
            Cliente cliente = vendas[i].getCliente(); //pega o cliente da venda
            float valorVenda = vendas[i].getValorTotal();    //pega o valor total da venda

            if (valorVenda > maiorValor) {
                maiorValor = valorVenda;
                clienteQueMaisComprou = cliente;
            }
        }
        return clienteQueMaisComprou;
    }

    public void listarVendas(){
        for(int i = 0; i < contador ; i++) {

            System.out.println("\nVenda: " + (i+1));
            System.out.println("Cliente: " + vendas[i].getCliente().getNome());
            System.out.println("Total da venda: R$" + vendas[i].getValorTotal());
            vendas[i].listarItensDaVenda();
        }
    }

    public Produto buscarProdutoMaisVendido(){

        Produto produtoMaisVendido = null;
        int maiorQuantidade = 0;

        for(int i = 0 ; i < contador; i++) { //Primeiro laço percorrer as vendas

            Venda vendaAtual = vendas[i];

            for(int j = 0 ; j < vendaAtual.getContadorItens(); j++){ //Segundo laço percorrer os itens da venda

                ItemVenda item = vendaAtual.getItens()[j];
                Produto produto = item.getProduto();
                int quantidade = item.getQuantidade();

                if (quantidade > maiorQuantidade) {
                    maiorQuantidade = quantidade;
                    produtoMaisVendido = produto;
                }
            }
        }
        return produtoMaisVendido;
    }
}
