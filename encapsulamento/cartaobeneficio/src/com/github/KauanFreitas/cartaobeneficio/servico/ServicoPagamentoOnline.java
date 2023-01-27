package com.github.KauanFreitas.cartaobeneficio.servico;

import com.github.KauanFreitas.cartaobeneficio.Cartao;
import com.github.KauanFreitas.cartaobeneficio.Estabelecimento;
import com.github.KauanFreitas.cartaobeneficio.Recibo;

public class ServicoPagamentoOnline {

    public Recibo efetuarPagamento (Estabelecimento estabelecimento,
                                    Cartao cartao, double valor) {
        cartao.debitar(valor);

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.obterTitular(), "Pagamento", valor);
    }
}
