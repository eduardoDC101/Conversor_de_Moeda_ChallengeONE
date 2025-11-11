package br.com.conversorDeMoedas.modelos;

import java.util.Map;

//Usamos Record para modelar dados imutáveis
public record Moeda(String base_code, Map<String, Double> conversion_rates) {
}
