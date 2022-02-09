package com.dio;

public class Main {

    public static void main(String[] args) {
        Bancos bancoPovo = new Bancos("Banco do Povo");
        bancoPovo.setTaxaContaCorrente(0.01f);
        Contatos ct = new Contatos("(21)99999-9999","pessoa_email@provedor.com");
        Enderecos endereco = new Enderecos("Rua Cristovão Colombo",
                903,
                "Alameda dos Anjos",
                "Metroplois");
        ClientesFisico pessoa1 = new ClientesFisico("Pessoa Primeira","000.000.000.-00",ct,endereco);
        ContaPoupanca cp = new ContaPoupanca(pessoa1);
        bancoPovo.addConta(cp);
        ContaCorrente cc = new ContaCorrente(pessoa1);
        bancoPovo.addConta(cc);

        cc.depositar(150.50);
        cp.depositar(230);
        cc.transferir(60,cp);

        pessoa1.clienteCompleteInfo();

        cp.imprimirExtrato();
        cc.imprimirExtrato();




    }
}
