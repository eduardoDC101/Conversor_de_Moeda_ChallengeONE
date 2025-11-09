package br.com.conversorDeMoedas.principal;

import br.com.conversorDeMoedas.modelos.Menu;
import br.com.conversorDeMoedas.modelos.Moeda;
import br.com.conversorDeMoedas.modelos.TipoMoeda;
import br.com.conversorDeMoedas.servicos.ApiCliente;
import br.com.conversorDeMoedas.servicos.Conversor;

import java.util.InputMismatchException;
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

            TipoMoeda base = null, destino = null;

            switch(opcao){
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
                Moeda moeda = api.buscarCotacao(base.name());
                double convertido = conversor.converter(moeda, destino, valor);
                System.out.printf("Valor %.2f [%s] corresponde a %.2f [%s]%n", valor, base, convertido, destino);
            } catch (Exception e){
                System.out.println("ERRO: " + e.getMessage());
            }

        }

    }
}
