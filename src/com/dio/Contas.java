package com.dio;

public abstract class Contas implements IConta{
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0000001;
    private int agencia;
    private int numeroConta;
    private Clientes cliente;

    private double saldo;


    public Contas(Clientes cliente) {
        this.agencia = 1;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo(){
    return this.saldo;
    }

    @Override
    public void sacar(double valor) {
        if((this.saldo - valor) > 0)
        {
            this.saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficie para saque!");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Contas contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void exibirInfosConta(){
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Conta: %d",this.numeroConta));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }
}
