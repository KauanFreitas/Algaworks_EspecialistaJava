package com.github.KauanFreitas.contaspagar.servico;

import com.github.KauanFreitas.pagamento.DocumentoPagavel;
import com.github.KauanFreitas.pagamento.MetodoPagamento;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {


        //Poderia ter outras regras de negócio aqui
        //Como por exemplo registrar o pagamento no banco de dados,
        // enviar uma notificação por e-mail, etc...

        metodoPagamento.pagar(documento);
    }

}
