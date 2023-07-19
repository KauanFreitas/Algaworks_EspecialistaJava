package com.github.KauanFreitas.pagamento;

public class Transferencia implements MetodoPagamento {



    @Override
    public void pagar(DocumentoPagavel documento) {

        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()) {
            throw new RuntimeException("Beneficiário não possui Conta Bancária");
        }

        System.out.printf("DEBUG: Efetuando Transferencia para %s no valor de %.2f Para conta bancária %s%n",
                beneficiario.getNome(), documento.getValorTotal(), beneficiario.getContaBancaria());
    }
}
