package com.github.KauanFreitas.contaspagar.modelo;

import com.github.KauanFreitas.pagamento.Beneficiario;
import com.github.KauanFreitas.pagamento.DocumentoPagavel;

public class OrdemServico implements DocumentoPagavel {

        private Beneficiario fornecedor;
        private double valorTotal;


    public OrdemServico(Beneficiario fornecedor, double valorTotal) {
        this.fornecedor = fornecedor;
        this.valorTotal = valorTotal;
    }

    public Beneficiario getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Beneficiario fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public Beneficiario getBeneficiario() {
        return fornecedor;
    }
}
