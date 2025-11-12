package br.com.conversorDeMoedas.servicos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTempo {

    public String capturaData(){
        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String dataFormatada = formatterData.format(agora);

        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = formatterHora.format(agora);

        String dataFinal = dataFormatada + " | " + horaFormatada;

        return dataFinal;
    }
}
