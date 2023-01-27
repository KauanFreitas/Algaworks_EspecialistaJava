package com.github.KauanFreitas.cartaobeneficio2.serviço;

import com.github.KauanFreitas.cartaobeneficio2.Estabelecimento;
import com.github.KauanFreitas.cartaobeneficio2.Recibo;
import com.github.KauanFreitas.cartaobeneficio2.Cartao;

public class ServicoPagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {
        cartao.debitar(valor);

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }
}
