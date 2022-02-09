package com.dio;

public class ContaCorrente extends Contas {
    private static float taxaTransferencia;


    public ContaCorrente(Clientes cliente) {
        super(cliente);
    }

    public static float getTaxaTransferencia() {
        return taxaTransferencia;
    }

    public static void setTaxaTransferencia(float taxaTransferencia) {
        ContaCorrente.taxaTransferencia = taxaTransferencia;
    }


    @Override
    public void transferir(double valor, Contas contaDestino) {
        valor -= valor * ContaCorrente.getTaxaTransferencia();
        super.transferir(valor, contaDestino);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Conta Corrente ===");
        super.exibirInfosConta();
    }
}
