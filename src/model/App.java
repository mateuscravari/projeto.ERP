package model;

public class App {
    public static void main(String[] args) throws Exception {

        //CADASTRA CLIENTE:
        Cliente novoCliente = new Cliente ("Mateus", 123456789, 25); //cadastra o cliente
        Cliente novoCliente1 = new Cliente ("José", 123456489, 45); //cadastra o cliente
        Cliente novoCliente2 = new Cliente ("Marcio", 789654321, 95); //cadastra o cliente

        //CADASTRA PRODUTO:
        Estoque estoque = new Estoque();  //declara a variavel "estoque"
        estoque.adicionarProduto(new Produto("Poltrona", 589.25f, 40)); //adiciona produto no estoque
        estoque.adicionarProduto(new Produto("Cadeira", 389.25f, 80)); //adiciona produto no estoque
        estoque.adicionarProduto(new Produto("Banqueta", 489.25f, 30)); //adiciona produto no estoque
        estoque.adicionarProduto(new Produto("Mesa", 1579.35f, 23)); //adiciona produto no estoque
        estoque.listarProdutos(); //execulta o metodo e devolve o resultado

        //CADASTRA CLIENTE PARA VENDA:
        System.out.println("\n---------------------------------------------------------");
        Venda venda = new Venda(novoCliente);
        Venda venda1 = new Venda(novoCliente1);
        Venda venda2 = new Venda(novoCliente2);

        SistemaERP sistema = new SistemaERP(estoque);
        //ADICIONA PRODUTO PARA VENDA:
        sistema.adicionarItemNaVenda(venda, "Cadeira", 20);
        sistema.adicionarItemNaVenda(venda, "Mesa", 14);
        sistema.adicionarItemNaVenda(venda1, "Banqueta", 10);
        sistema.adicionarItemNaVenda(venda1, "Poltrona", 10);
        sistema.adicionarItemNaVenda(venda2, "Mesa", 20);

        RegistroVendas registro = new RegistroVendas();
        registro.adicionarVenda(venda);
        registro.adicionarVenda(venda1);
        registro.adicionarVenda(venda2);
        registro.listarVendas();

        System.out.println("\n---------------------------------------------------------");
        System.out.println("\nESTOQUE ATUALIZADO: ");
        estoque.listarProdutos();

    }
}
