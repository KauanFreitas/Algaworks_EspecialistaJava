package com.github.KauanFreitas.cartaobeneficio2;


import com.github.KauanFreitas.cartaobeneficio2.serviço.ServicoDepositoPix;
import com.github.KauanFreitas.cartaobeneficio2.serviço.ServicoPagamentoOnline;

public class Principal {

    public static void main(String[] args) {
        var supermercado = new Estabelecimento("Supermercado do Zé");
        var cartao = new Cartao("João Souza Silva");

        var servicoDeDeposito = new ServicoDepositoPix();
        com.github.KauanFreitas.cartaobeneficio2.Recibo reciboDeposito = servicoDeDeposito.efetuarDeposito(cartao, 500);
        reciboDeposito.imprimir();

        var servicoDePagamento = new ServicoPagamentoOnline();
        Recibo reciboPagamento = servicoDePagamento.efetuarPagamento(supermercado, cartao, 100);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.getTitular());
        System.out.printf("Saldo: R$%.2f%n", cartao.getSaldo());
    }
}

