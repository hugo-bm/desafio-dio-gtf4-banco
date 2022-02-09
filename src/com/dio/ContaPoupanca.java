package com.dio;

public class ContaPoupanca extends Contas {


    public ContaPoupanca(Clientes cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Conta Poupança ===");
        super.exibirInfosConta();
    }
}
