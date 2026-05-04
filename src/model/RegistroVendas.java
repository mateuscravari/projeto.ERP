package model;

public class RegistroVendas {

    Venda[] vendas = new Venda[100];
    int contador = 0;

    public void adicionarVenda(Venda v){
        vendas[contador] = v;
        contador ++;
    }

    public void listarVendas(){
        for(int i = 0; i < contador ; i++) {

            System.out.println("\nVendas: " + (i+1));
            System.out.println("Cliente: " + vendas[i].getCliente().getNome());
            System.out.println("Total da venda: R$" + vendas[i].getValorTotal());
            vendas[i].listarItensDaVenda();
        }
    }
}
