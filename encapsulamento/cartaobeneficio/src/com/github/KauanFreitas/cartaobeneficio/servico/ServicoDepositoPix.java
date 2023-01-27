package com.github.KauanFreitas.cartaobeneficio.servico;

import com.github.KauanFreitas.cartaobeneficio.Cartao;
import com.github.KauanFreitas.cartaobeneficio.Recibo;

public class ServicoDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito){
        // TODO faz cobrança do valor no Pix

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.obterTitular(), "Depósito", valorDeposito);
    }

}
