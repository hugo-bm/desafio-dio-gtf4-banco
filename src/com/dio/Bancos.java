package com.dio;

import java.util.ArrayList;
import java.util.List;

public class Bancos {
    private String nome;
    private List<Contas> contas;

    public Bancos() {
    }

    public Bancos(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contas> getContas() {
        return contas;
    }

    public void addConta(Contas conta){
        this.contas.add(conta);
    }
    public void setTaxaContaCorrente(float taxa){
        if(taxa >0){
            ContaCorrente.setTaxaTransferencia(taxa);
        }
    }
}
