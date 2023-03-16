package com.github.KauanFreitas.fiscal;

public class NotaFiscalServico extends  NotaFiscal{

    private boolean interMunicipal;

    public NotaFiscalServico(String descricao, double valorTotal, boolean interMunicipal){
        super(descricao, valorTotal);
        this.interMunicipal =interMunicipal;
    }

    public boolean isInterMunicipal(){
        return interMunicipal;
    }
}
