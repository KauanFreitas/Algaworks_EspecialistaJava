package com.github.KauanFreitas.fiscal;

public class NotaFiscalServico extends  NotaFiscal{

    public static final int VALOR_MAXIMO_ISENCAO_FISCAL = 1_000;
    public static final double ALIQUOTA_IMPOSTO =0.18;

    private boolean interMunicipal;

    public NotaFiscalServico(String descricao, double valorTotal, boolean interMunicipal){
        super(descricao, valorTotal);
        this.interMunicipal =interMunicipal;
    }

    public boolean isInterMunicipal(){
        return interMunicipal;
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = getValorTotal() * ALIQUOTA_IMPOSTO;
        if (isIsendoImposto()){
            valorImpostos = 0;
        }
        return valorImpostos;
    }

    private boolean isIsendoImposto() {
        return isInterMunicipal() && getValorTotal() <= VALOR_MAXIMO_ISENCAO_FISCAL;
    }
}
