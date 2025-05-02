# Desafio Dio Api na Nuvem
Java RESTful API criada para o desafio Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway da DIO.

## Diagrama de Classe
```mermaid
classDiagram
    class User {
      -Long id
      -String name
      -Account account
      -Card card
      -List<Feature> features
      -List<News> news
    }
    class Account {
      -Long id
      -String number
      -String agency
      -BigDecimal balance
      -BigDecimal limit
    }
    class Feature {
      -Long id
      -String icon
      -String description
    }
    class Card {
      -Long id
      -String number
      -BigDecimal limit
    }
    class News {
      -Long id
      -String icon
      -String description
    }

    User "1" *-- "1" Account
    User "1" *-- "0..*" Feature 
    User "1" *-- "1" Card
    User "1" *-- "0..*" News
```
