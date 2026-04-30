package model;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente novoCliente = new Cliente ("Mateus", 123456789, 25); //cadastra o cliente

        Estoque estoque = new Estoque();  //declara a variavel "estoque"

        estoque.adicionarProduto(new Produto("Poltrona", 589.25f, 30));
        estoque.adicionarProduto(new Produto("Cadeira", 289.25f, 50));
        estoque.adicionarProduto(new Produto("Mesa", 1850.79f, 15));

        estoque.listarProdutos(); //execulta o metedodo e devolve o resultado

        Produto produtoParaVenda = estoque.buscarProdutoPorNome("Poltrona"); //cria variavel produtoParaVenda.
        Produto produtoParaVenda1 = estoque.buscarProdutoPorNome("Cadeira");
        Produto produtoParaVenda2 = estoque.buscarProdutoPorNome("Mesa");

        VendaService service = new VendaService();
        Venda venda = service.realizarVenda(novoCliente, produtoParaVenda, 25); //venda a ser realizada

        if (venda != null) {
            System.out.println("\nNome do cliente: " + novoCliente.getNome());
            System.out.println("Produto: " + produtoParaVenda.getNome());
            System.out.println("Quantidade: " + venda.getQuantidade());
            System.out.println("Valor total da venda: R$ " + venda.getValorTotal() + "\n");
        }
        estoque.listarProdutos();

    }
}
