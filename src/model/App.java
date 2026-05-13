package model;

public class App {
    public static void main(String[] args) {

        //CADASTRA CLIENTE:
        Cliente novoCliente = new Cliente ("Mateus", 123456789, 15);
        Cliente novoCliente1 = new Cliente ("José", 123456489, 45);
        Cliente novoCliente2 = new Cliente ("Marcio", 789654321, 95);
        Cliente novoCliente3 = new Cliente ("Giovanna", 456789123, 35);

        //CADASTRA PRODUTO:
        Estoque estoque = new Estoque();  //declara a variavel "estoque"

        estoque.adicionarProduto(new Produto("Poltrona", 589.25f, 40));
        estoque.adicionarProduto(new Produto("Cadeira", 389.25f, 80));
        estoque.adicionarProduto(new Produto("Banqueta", 489.25f, 30));
        estoque.adicionarProduto(new Produto("Mesa", 1579.35f, 23));
        estoque.listarProdutos(); //execulta o metodo e devolve o resultado

        //CADASTRA CLIENTE PARA VENDA:
        System.out.println("\n---------------------------------------------------------");
        Venda venda = new Venda(novoCliente);
        Venda venda1 = new Venda(novoCliente);
        Venda venda2 = new Venda(novoCliente2);
        Venda venda3 = new Venda(novoCliente3);

        //ADICIONA PRODUTO PARA VENDA:
        SistemaERP sistema = new SistemaERP(estoque);

        sistema.adicionarItemNaVenda(venda, "Cadeira", 20);
        sistema.adicionarItemNaVenda(venda, "Mesa", 14);
        sistema.adicionarItemNaVenda(venda1, "Banqueta", 10);
        sistema.adicionarItemNaVenda(venda1, "Poltrona", 10);
        sistema.adicionarItemNaVenda(venda2, "Mesa", 2);
        sistema.adicionarItemNaVenda(venda3, "Cadeira", 2);

        //LISTA AS VENDAS EFETIVADAS:
        sistema.finalizarVenda(venda);
        sistema.finalizarVenda(venda1);
        sistema.finalizarVenda(venda2);
        sistema.finalizarVenda(venda3);
        sistema.listarVendas();

        Produto maisVendido = sistema.buscarProdutoMaisVendido();
        System.out.println("\nProduto mais vendido: " + maisVendido.getNome());

        System.out.println("\nTotal de venda para o cliente " + novoCliente.getNome() + ": R$ " + sistema.consultarTotalPorCliente(novoCliente));

        System.out.println("\n---------------------------------------------------------");
        System.out.println("\nESTOQUE ATUALIZADO: ");
        estoque.listarProdutos();

    }
}
