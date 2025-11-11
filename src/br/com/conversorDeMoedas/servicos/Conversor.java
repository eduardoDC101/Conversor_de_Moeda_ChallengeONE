package br.com.conversorDeMoedas.servicos;

import br.com.conversorDeMoedas.modelos.Moeda;
import br.com.conversorDeMoedas.modelos.TipoMoeda;

public class Conversor {

    public double converter(Moeda moeda, TipoMoeda destino, double valor){
        Double taxa = moeda.conversion_rates().get(destino.name());

        //Se não houver uma moeda destino válida, ele para
        if(taxa == null){
            //se ele pedir uma conversão impossível, temos um erro de arumento ilegal(pois não existe)
            throw new IllegalArgumentException("Conversão para " + destino + " não disponível.");
        }

        return valor * taxa;

    }

}
