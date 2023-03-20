package com.github.KauanFreitas.impostos;

public abstract class PessoaJuridica extends Pessoa {

    private double faturamentoAnual;
    private double despesaAnual;

    PessoaJuridica(String nome, double farutamentoAnual, double despesaAnual){
        super(nome);
        this.faturamentoAnual = farutamentoAnual;
        this.despesaAnual = despesaAnual;
    }

    public double getFaturamentoAnual() {
        return faturamentoAnual;
    }

    public double getDespesaAnual() {
        return despesaAnual;
    }

    public double getLucroAnual() {
        return getFaturamentoAnual() - getDespesaAnual();
    }
}
