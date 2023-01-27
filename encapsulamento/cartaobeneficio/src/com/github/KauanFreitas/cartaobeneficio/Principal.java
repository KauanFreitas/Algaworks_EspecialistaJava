package com.github.KauanFreitas.cartaobeneficio;

import com.github.KauanFreitas.cartaobeneficio.servico.ServicoDepositoPix;
import com.github.KauanFreitas.cartaobeneficio.servico.ServicoPagamentoOnline;

public class Principal {

    public static void main(String[] args) {
        var supermercado = new Estabelecimento("Supermercado do Zé");
        var cartao = new Cartao("João Souza Silva");

//        cartao.saldo = -700;

        var servicoDeDeposito = new ServicoDepositoPix();
        Recibo reciboDeposito = servicoDeDeposito.efetuarDeposito(cartao, 500);
        reciboDeposito.imprimir();

        var servicoDePagamento = new ServicoPagamentoOnline();
        Recibo reciboPagamento = servicoDePagamento.efetuarPagamento(supermercado, cartao, 100);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.titular);
        System.out.printf("Saldo: R$%.2f%n", cartao.saldo);
    }
}
