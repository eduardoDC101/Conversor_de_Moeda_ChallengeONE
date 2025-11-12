package br.com.conversorDeMoedas.servicos;

import br.com.conversorDeMoedas.modelos.Conversao;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private final List<Conversao> historico = new ArrayList<>();

    public void adicionar(Conversao c){
        historico.add(c);
    }

    public void mostrarHistorico(){
        if(historico.isEmpty()){
            System.out.println("Nenhuma conversão realizada ainda");
        } else{
            System.out.println("=== Histórico de Conversões ===");
            historico.forEach(System.out::println);
            /* ou
             for (Conversao c : conversoes) {
                System.out.println(c);
             }
            */
        }
    }

}
