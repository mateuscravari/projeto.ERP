package model;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente novoCliente = new Cliente ("Mateus", 123456789, 25); //cadastra o cliente

        Estoque estoque = new Estoque();  //declara a variavel "estoque"

        estoque.adicionarProduto(new Produto("Poltrona", 589.25f, 40));
        estoque.adicionarProduto(new Produto("Cadeira", 289.25f, 50));
        estoque.adicionarProduto(new Produto("Mesa", 3850.79f, 15));
        estoque.adicionarProduto(new Produto("Banqueta", 350.79f, 15));
        estoque.adicionarProduto(new Produto("Sofá", 2350.79f, 10));

        estoque.listarProdutos(); //execulta o metodo e devolve o resultado

        Venda venda = new Venda(novoCliente);

        SistemaERP sistema = new SistemaERP(estoque);

        sistema.adicionarItemNaVenda(venda, "Poltrona", 110);
        sistema.adicionarItemNaVenda(venda, "Cadeira", 555);
        sistema.adicionarItemNaVenda(venda, "Mesa", 25);

        System.out.print(System.lineSeparator());

        RegistroVendas registro = new RegistroVendas();
        registro.adicionarVenda(venda);

        registro.listarVendas();

        System.out.print(System.lineSeparator());
        estoque.listarProdutos();

    }
}
