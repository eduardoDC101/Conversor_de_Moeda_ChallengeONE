# 🪙 Conversor de Moedas em Java  

Projeto desenvolvido como parte do **Challenge ONE - Oracle Next Education**, em parceria com a **Alura**.  
O objetivo é criar um **conversor de moedas** que consome dados da **ExchangeRate API**, exibindo valores convertidos com base em cotações atualizadas em tempo real.  

---

##  Sobre o Projeto  

O **Conversor de Moedas** é uma aplicação de linha de comando desenvolvida em **Java**, que permite converter valores entre diferentes moedas de forma simples e interativa.  
Os dados são obtidos via **API REST**, garantindo que as taxas de câmbio estejam sempre atualizadas.

### Conversões disponíveis:
- Dólar -> Peso Argentino  
- Peso Argentino -> Dólar  
- Dólar -> Real Brasileiro  
- Real Brasileiro -> Dólar  
- Dólar -> Peso Colombiano  
- Peso Colombiano -> Dólar  

---

## Tecnologias Utilizadas  

- **Java 17+** 
- **HTTP Client (java.net.http)** 
- **Gson (Google)** 
- **Records e Enums** 
- **POO (Programação Orientada a Objetos)** 

---

## Conceitos Aplicados  

- Consumo de **API REST** com `HttpClient` e `HttpRequest`  
- **Deserialização JSON** em objetos Java usando `Gson`  
- **Encapsulamento e modularização** em pacotes (`modelos`, `servicos`, `main`)  
- Uso de **`record`** para representar dados imutáveis da resposta da API  
- Uso de **`enum`** para representar moedas de forma segura e escalável  
- **Tratamento de exceções** e feedback de erros controlado  

---

## Exemplo de Uso
<img width="424" height="396" alt="image" src="https://github.com/user-attachments/assets/e6f44729-33aa-48fc-b50e-2717df255726" />

---

### Observações:
O código possui diversas anotações, coloquei isso com o intuito de facilitar a compreensão e a localização.