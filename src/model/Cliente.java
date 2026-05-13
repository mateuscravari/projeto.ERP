package model;

public class Cliente { // cria cadastro cliente

    private String nome;
    private long cpf;
    private int idade;

    public Cliente(String nome, long cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

}

