package br.com.conversorDeMoedas.servicos;

import br.com.conversorDeMoedas.modelos.Moeda;
import br.com.conversorDeMoedas.modelos.TipoMoeda;

public class Conversor {

    public double converter(Moeda moeda, TipoMoeda destino, double valor){
        Double taxa = moeda.conversion_rates().get(destino.name());

        if(taxa == null){
            throw new IllegalArgumentException("Conversão para " + destino + " não disponível.");
        }

        return valor * taxa;

    }

}
