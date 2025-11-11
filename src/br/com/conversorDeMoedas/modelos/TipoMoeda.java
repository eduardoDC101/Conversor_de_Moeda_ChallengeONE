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

/*

 Um Enum é um tipo especial do java, ele serve para representar um cojunto e limitado de valores possiveis
 Aqui o enum representa/define todas as moedas válidas no sistema.
 Ou seja, ele só permite criar moedas "conhecidas", se digitarmos "TipoMoeda.EUR", não funciona.

 Cada item do enum (USD("Dólar Americano")) tem um atributo interno (nesse caso, o texto. Ele pode ser visto com:
 getNome()= TipoMoeda.USD.getNome().

 Muito usado para travar/limtar o que pode ser feito(um cátalogo fixo).
 EX:
 public enum TipoConta {
    CORRENTE,
    POUPANCA,
    SALARIO
}
Só temos essas 3 opções, isso evita que passemos "Conta Corrente", pois só podemos passar:
TipoConta.CORRENTE

name() devolve como a constante foi escrita no código-fonte. Se É USD("Dólar Americano"), TipoMoeda.USD.name()
retorna "USD".


*/