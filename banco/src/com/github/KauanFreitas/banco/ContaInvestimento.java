package com.github.KauanFreitas.banco;

public class ContaInvestimento extends Conta {

    private double valorTotalRendimento;

    public  ContaInvestimento(){
    super();
    }

    public void creditarRendimento (double percentualJuros){
        double valorRendimentos = getSaldo() * percentualJuros/100;
        this.valorTotalRendimento += valorRendimentos;
        depositar(valorRendimentos);
    }
}
