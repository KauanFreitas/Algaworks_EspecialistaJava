package com.github.KauanFreitas.cartaobeneficio2.serviço;

import com.github.KauanFreitas.cartaobeneficio2.Recibo;
import com.github.KauanFreitas.cartaobeneficio2.Cartao;

public class ServicoDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no Pix

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);
    }

}
