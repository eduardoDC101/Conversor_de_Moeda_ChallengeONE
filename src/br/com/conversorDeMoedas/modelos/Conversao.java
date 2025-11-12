package br.com.conversorDeMoedas.modelos;

import java.time.LocalDateTime;

public class Conversao {
    private double valorOriginal, valorConvertido;
    private String moedaBase, moedaDestino, dataHora;

    public Conversao(double valorOriginal, double valorConvertido, String moedaBase, String moedaDestino, String dataHora) {
        this.valorOriginal = valorOriginal;
        this.valorConvertido = valorConvertido;
        this.moedaBase = moedaBase;
        this.moedaDestino = moedaDestino;
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return String.format(
                "[%s] %.2f %s -> %.2f %s",
                dataHora, valorOriginal, moedaBase, valorConvertido, moedaDestino
        );
    }
}
