package com.github.KauanFreitas.pagamento;

public interface DocumentoPagavel {
    public abstract double getValorTotal();

    Beneficiario getBeneficiario();

}
