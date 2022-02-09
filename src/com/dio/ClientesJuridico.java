package com.dio;

public class ClientesJuridico extends Clientes{
    private String cnpj;
    public ClientesJuridico(String nome,String cnpj, Contatos contato, Enderecos endereco) {
        super(nome, contato, endereco);
        //Verificação cnpj
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }


    public void clienteCompleteInfo(){
        System.out.println("== Informações do Cliente ==");
        System.out.println("Titular: "+super.getNome());
        System.out.println("CPF: "+this.cnpj);
        this.clienteInfo();
    }
}
