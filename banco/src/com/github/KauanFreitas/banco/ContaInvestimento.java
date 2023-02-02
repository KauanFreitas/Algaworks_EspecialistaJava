package com.github.KauanFreitas.banco;

public class ContaInvestimento extends Conta {

    private double valorTotalRendimento;


    public void creditarRendimento (double percentualJuros){
        double valorRendimentos = getSaldo() * percentualJuros/100;
        this.valorTotalRendimento += valorRendimentos;
        depositar(valorRendimentos);
    }
}
