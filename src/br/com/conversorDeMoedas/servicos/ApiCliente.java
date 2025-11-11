package br.com.conversorDeMoedas.servicos;

import br.com.conversorDeMoedas.modelos.Moeda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCliente {
    private static final String API_KEY = "c2a435231ece85daef4bfc91";
    private static final String URL_BASE = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    private final HttpClient client = HttpClient.newHttpClient();
    private final Gson gson = new Gson();

    public Moeda buscarCotacao(String codigoMoedaBase){
        String endereco = URL_BASE + codigoMoedaBase;

        HttpRequest requizicao = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        try {
            HttpResponse<String> resposta = client
                    .send(requizicao, HttpResponse.BodyHandlers.ofString());

            // Pegamos o corpo da resposta da API, passamos seus dados para a Classe Record Moeda.
            //Ou seja, gson pega o JSON da resposta, "coloca ele em um objeto java" (assim podemo
            // usar seus atributos, POO) e retorna esse objeto Moeda.
            return gson.fromJson(resposta.body(), Moeda.class);
        } catch (Exception e){
            //usamos 'throw new" para mostrar um erro de forma mais clara, ele para o código
            throw new RuntimeException("Erro ao buscar dados da API: " + e.getMessage(), e);
            //RuntimeException é uma exceção genérica, ela informa que deu erro em tempo de execução.
            //Mas que não faz sentido tratar, logo, apenas paramos o programa. É um alerta vermelho que algo aconteceu
            // e que precisamos parar
        }
    }
}
