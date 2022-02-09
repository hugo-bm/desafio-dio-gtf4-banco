package com.dio;



public class Contatos {
    private String telefone;
    private String email;

    public Contatos() {
    }

    public Contatos(String telefone, String email) {
        this.telefone = telefone;
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void exibir(){
        System.out.println("= Informações de contato =");
        System.out.println("Telefone: "+ this.telefone+" E-mail: "+this.telefone);
    }
}
