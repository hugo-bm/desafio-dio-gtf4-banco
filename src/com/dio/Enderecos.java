package com.dio;

public class Enderecos {
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;

    public Enderecos() {
    }

    public Enderecos(String logradouro, int numero, String bairro, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void exibir(){
        System.out.println("= Endereço =");
        System.out.println("Logradouro: "+this.logradouro);
        System.out.println("Número: "+this.numero+" Complemento: "+ this.complemento);
        System.out.println("Bairro: "+this.bairro+"         Cidade: "+this.cidade);
    }
}
