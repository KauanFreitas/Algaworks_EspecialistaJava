package br.com.algamilhas.pontuacao;

import java.util.Objects;

public class Participante {

    private String nome;
    private int saldoDePontos;

    Participante(String nome){
        this(nome, 0);
    }
    public Participante(String nome, int saldoDePontosInicial){
        Objects.requireNonNull(nome,"Nome é obrigatorio");

        if (saldoDePontosInicial < 0){
            throw new IllegalArgumentException("Saldo inicial de pontos não pode ser negativo");
        }

        this.nome =nome;
        this.saldoDePontos =saldoDePontosInicial;
    }

    public void creditarPontos (int pontos){

        if (pontos < 0){
            throw new IllegalArgumentException("Pontos a creditar não pode ser negativo");

        }
        this.saldoDePontos += pontos;
    }
}
