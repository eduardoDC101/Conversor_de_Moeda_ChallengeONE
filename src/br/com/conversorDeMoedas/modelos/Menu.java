package br.com.conversorDeMoedas.modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Menu {

    public String mostrarMenu(){
        return """
            *************************************************
            Seja bem-vindo ao Conversor de Moedas!!!
            
            1- Dólar -> Peso Argentino
            2- Peso Argentino -> Dólar
            3- Dólar -> Real Brasileiro
            4- Real Brasileiro -> Dólar
            5- Dólar -> Peso Colombiano
            6- Peso Colombiano -> Dólar
            7- Histórico de Logs e Conversões
            8- Sair
            
            *************************************************
            Escolha uma opção válida: """;
    }
}
