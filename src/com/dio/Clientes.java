package com.dio;
/**
 *
 * */
public abstract class Clientes {
    private String nome;
    private Contatos contato;
    private Enderecos endereco;

    public Clientes(String nome, Contatos contato, Enderecos endereco) {
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected void clienteInfo(){
        this.contato.exibir();
        this.endereco.exibir();
    }
}
