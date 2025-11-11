package br.com.conversorDeMoedas.principal;

import br.com.conversorDeMoedas.modelos.Menu;
import br.com.conversorDeMoedas.modelos.Moeda;
import br.com.conversorDeMoedas.modelos.TipoMoeda;
import br.com.conversorDeMoedas.servicos.ApiCliente;
import br.com.conversorDeMoedas.servicos.Conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Menu menu = new Menu();
        ApiCliente api = new ApiCliente();
        Conversor conversor = new Conversor();

        int opcao = 0;

        while (opcao != 7){
            System.out.println(menu.mostrarMenu());
            opcao = ler.nextInt();

            if (opcao == 7){
                System.out.println("Sistema Encerrado!");
                break;
            }

            System.out.println("Digite o valor a ser convertido: ");
            double valor = ler.nextDouble();


            //Com base na opção escolhida pelo usuário, o programa precisa descobrir qual a moeda base e a moeda destino
            //Logo, se ele escolher 1, o programa sabe que é de Dólar para Peso Argentino

            //Criamos 2 variáveis do tipo TipoMoeda que é um enum.
            TipoMoeda base = null, destino = null;
            switch(opcao){
                //Se for 1, ele atribui USD a Base e ARS ao Destino
                case 1 -> {base = TipoMoeda.USD; destino = TipoMoeda.ARS;}
                case 2 -> {base = TipoMoeda.ARS; destino = TipoMoeda.USD;}
                case 3 -> {base = TipoMoeda.USD; destino = TipoMoeda.BRL;}
                case 4 -> {base = TipoMoeda.BRL; destino = TipoMoeda.USD;}
                case 5 -> {base = TipoMoeda.USD; destino = TipoMoeda.COP;}
                case 6 -> {base = TipoMoeda.COP; destino = TipoMoeda.USD;}
                default -> {
                    System.out.println("Opção Inválida!");
                    continue;
                }
            }

            try{
                //Aqui chamamos a Classe ApiCliente para consultar a cotação
                //base.name() retorna (se opcao for 1) "USD", passamos o "USD" como parametro para o métod0 de busca da classe ApiCliente
                //O métod0 retorna um objeto moeda com todas com todas as taxas atuais. Retorno esse que está em "moeda" agora.
                Moeda moeda = api.buscarCotacao(base.name());

                //passamos o objeto moeda, o destino("ARS") e o valor, assim fazendo a conversão
                double convertido = conversor.converter(moeda, destino, valor);
                System.out.printf("Valor %.2f [%s] corresponde a %.2f [%s]%n", valor, base, convertido, destino);
            } catch (Exception e){
                System.out.println("ERRO: " + e.getMessage());
            }

        }

    }
}
