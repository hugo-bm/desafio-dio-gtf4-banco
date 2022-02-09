package com.dio;

public class ClientesFisico extends Clientes{

    private String cpf;

    public ClientesFisico(String nome,String cpf, Contatos contato, Enderecos endereco) {
        super(nome, contato, endereco);
        //Verificação cpf
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }


    public void clienteCompleteInfo(){
        System.out.println("== Informações do Cliente ==");
        System.out.println("Titular: "+super.getNome());
        System.out.println("CPF: "+this.cpf);
        this.clienteInfo();
    }
}
