package br.com.conversorDeMoedas.modelos;

public enum TipoMoeda {
    USD("Dólar Americano"),
    ARS("Peso Argentino"),
    BRL("Real Brasileiro"),
    COP("Peso Colombiano");

    private final String nome;

    TipoMoeda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

