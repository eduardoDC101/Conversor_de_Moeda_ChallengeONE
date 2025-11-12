# 🪙 Conversor de Moedas em Java

Projeto desenvolvido como parte do **Challenge ONE - Oracle Next Education**, em parceria com a **Alura**.  
O objetivo é criar um **Conversor de Moedas** que consome dados da **ExchangeRate API**, exibindo valores convertidos com base em cotações atualizadas em tempo real e agora também **mantém um histórico completo das conversões realizadas** durante a execução.

---

## Sobre o Projeto

O **Conversor de Moedas** é uma aplicação de **linha de comando em Java**, que permite converter valores entre diferentes moedas de forma interativa, exibindo resultados precisos e atualizados via API REST.

Com a nova funcionalidade de **Histórico de Conversões**, o usuário pode consultar todas as operações feitas durante a execução do programa, incluindo:
- Valor original e valor convertido;
- Moeda de origem e moeda de destino;
- Data e hora exata da conversão (utilizando `java.time`).

---

## Conversões Disponíveis

- Dólar → Peso Argentino
- Peso Argentino → Dólar
- Dólar → Real Brasileiro
- Real Brasileiro → Dólar
- Dólar → Peso Colombiano
- Peso Colombiano → Dólar

---

## Tecnologias Utilizadas

- **Java 17+**
- **HTTP Client (`java.net.http`)**
- **Gson (Google)**
- **Records e Enums**
- **POO (Programação Orientada a Objetos)**
- **java.time (LocalDateTime / DateTimeFormatter)**
- **Coleções (`List`, `ArrayList`)**

---

## Conceitos Aplicados

- Consumo de **API REST** com `HttpClient` e `HttpRequest`
- **Deserialização JSON** em objetos Java com `Gson`
- **Encapsulamento e modularização** em pacotes (`modelos`, `servicos`, `principal`)
- Uso de **`record`** para representar respostas imutáveis da API
- Uso de **`enum`** para representar moedas de forma segura e escalável
- **Tratamento de exceções** e mensagens de erro personalizadas
- Implementação de um **Histórico de Conversões** utilizando `List` e `LocalDateTime`
- Sobrescrita de **`toString()`** para exibição formatada das conversões
- Uso de **switch expressions modernas (`case -> {}`)** introduzidas no Java 14+

---

## Exemplo de Uso

<img width="500" height="400" alt="exemplo" src="https://github.com/user-attachments/assets/e6f44729-33aa-48fc-b50e-2717df255726" />

### Observações: 
O código possui diversas anotações, coloquei isso com o intuito de facilitar a compreensão e a localização.
