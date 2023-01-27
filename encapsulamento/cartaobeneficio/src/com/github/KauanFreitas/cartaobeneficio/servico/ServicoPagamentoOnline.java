package com.github.KauanFreitas.cartaobeneficio.servico;

import com.github.KauanFreitas.cartaobeneficio.Cartao;
import com.github.KauanFreitas.cartaobeneficio.Estabelecimento;
import com.github.KauanFreitas.cartaobeneficio.Recibo;

public class ServicoPagamentoOnline {

    public Recibo efetuarPagamento (Estabelecimento estabelecimento,
                                    Cartao cartao, double valor){

        if (cartao.saldo < valor){
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        cartao.saldo -= valor;

        // TODO Realizar outras lógicas para efetuar o pagamento ao estabelecimento

        return  new Recibo(cartao.titular, "Pagamento", valor);
    }
}
