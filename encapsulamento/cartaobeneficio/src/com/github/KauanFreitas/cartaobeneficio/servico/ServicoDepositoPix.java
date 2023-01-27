package com.github.KauanFreitas.cartaobeneficio.servico;

import com.github.KauanFreitas.cartaobeneficio.Cartao;
import com.github.KauanFreitas.cartaobeneficio.Recibo;

public class ServicoDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito){
        // TODO Faz cobrança do valor pix

        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO){
            throw new IllegalArgumentException(
                    String.format("VAlor de depósito não pode ser menor que %.2f",Cartao.VALOR_MINIMO_DEPOSITO)
            );
        }

        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;

        return new Recibo(cartao.titular, "Depósito",valorDeposito);
    }

}
