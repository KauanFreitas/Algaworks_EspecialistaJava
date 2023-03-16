package com.github.KauanFreitas.fiscal;

public class NotalFiscalProduto extends NotaFiscal{

    private  double valorFrete;

    public NotalFiscalProduto(String descricao, double valorTotal, double valorFrete) {
        super(descricao, valorTotal);
        this.valorFrete =valorFrete;
    }

    public double getValorFrete() {
        return valorFrete;
    }
}
