package model;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente novoCliente = new Cliente ("Mateus", 123456789, 25); //cadastra o cliente

        Estoque estoque = new Estoque();  //declara a variavel "estoque"

        estoque.adicionarProduto(new Produto("Poltrona", 589.25f, 40));
        estoque.adicionarProduto(new Produto("Cadeira", 289.25f, 50));
        estoque.adicionarProduto(new Produto("Mesa", 1850.79f, 15));

        estoque.listarProdutos(); //execulta o metedodo e devolve o resultado

        Produto produtoParaVenda = estoque.buscarProdutoPorNome("Poltrona"); //cria variavel produtoParaVenda.
        Produto produtoParaVenda1 = estoque.buscarProdutoPorNome("Cadeira");
        Produto produtoParaVenda2 = estoque.buscarProdutoPorNome("Mesa");

        Venda venda = new Venda(novoCliente);

        venda.adicionarItem(produtoParaVenda, 10);
        venda.adicionarItem(produtoParaVenda1, 5);
        venda.adicionarItem(produtoParaVenda2, 2);
        System.out.print(System.lineSeparator());

        RegistroVendas registro = new RegistroVendas();
        registro.adicionarVenda(venda);

        registro.listarVendas();

        System.out.print(System.lineSeparator());
        estoque.listarProdutos();

    }
}
