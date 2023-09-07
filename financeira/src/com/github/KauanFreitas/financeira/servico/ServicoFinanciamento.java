package com.github.KauanFreitas.financeira.servico;

import com.github.KauanFreitas.financeira.modelo.Empresa;
import com.github.KauanFreitas.financeira.modelo.Fazenda;

public class ServicoFinanciamento {
    public void solicitarFinanciamento(Fazenda empresa, double valorSolicitado) {
        double limiteAprovado = empresa.calcularLimiteAprovado();

        if (limiteAprovado < valorSolicitado) {
            throw new RuntimeException(String.format(
                    "Financiamento não aprovado. Limite máximo de %.2f", limiteAprovado));
        }

        // registraríamos a solicitação do financiamento aqui em alguma classe de persistência de dados,
        // mas por enquanto, apenas imagine isso acontecendo...
        System.out.printf("DEBUG: Financiamento aprovado. Limite máximo de %.2f%n",
                limiteAprovado);
    }

    public double consultarLimiteAprovado(Empresa empresa) {
        // aqui poderia registrar a consulta em algum lugar para um consultor comercial entrar em contato
        // com o cliente (não vamos fazer isso, porque o objetivo agora é estudar OO primeiro)

        return empresa.calcularLimiteAprovado();
    }
}
