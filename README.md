# Arquitetura Hexagonal em Microsserviços

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/postgresql-4169E1?style=for-the-badge&logo=postgresql&logoColor=blue&color=%23f6f7f8)
![Docker](https://img.shields.io/badge/docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)

## Índice
- [Sobre o Projeto](#sobre-o-projeto)
- [Objetivos](#Objetivo)
- [Descrição](#Descrição)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura do Projeto](#Estrutura-do-Projeto)
- [Instalação](#instalação)
- [Contribuição](#contribuição)
- [Contato](#contato)


## Sobre o Projeto
Este projeto demonstra a aplicação prática da arquitetura hexagonal em microsserviços, que se comunicam com outros clientes, banco de dados e sistemas de mensageria.

## Objetivo
- Implementar microsserviços seguindo os princípios da arquitetura hexagonal.
- Facilitar a comunicação entre microsserviços e clientes externos.
- Integrar com bancos de dados e sistemas de mensageria de maneira eficiente.

## Descrição
A arquitetura hexagonal, também conhecida como Ports and Adapters, visa criar aplicações que sejam facilmente testáveis, escaláveis e que tenham baixo acoplamento entre seus componentes. Este projeto aplica esses conceitos na construção de microsserviços, permitindo:

- Comunicação com Clientes: Microsserviços que expõem APIs REST para interação com clientes externos.
- Integração com Bancos de Dados: Uso de repositórios e persistência de dados de forma desacoplada.
- Mensageria: Integração com sistemas de mensageria como Kafka para comunicação assíncrona entre microsserviços.

## Tecnologias Utilizadas
- Spring Boot: Para a criação e gerenciamento dos microsserviços.
- Spring Data JPA: Para a persistência de dados em bancos de dados relacionais.
- Apache Kafka: Para a mensageria e comunicação assíncrona.
- MapStruct: Para a transformação de objetos entre diferentes camadas.

## Pré-requisitos
- Java 17 ou superior
- Docker
- Maven

## Estrutura do Projeto
O projeto está organizado de acordo com a arquitetura hexagonal, dividindo as responsabilidades 
em camadas distintas:

- Core: Contém a lógica de negócios central da aplicação.
- Ports: Interfaces que definem como os dados entram e saem do core.
- Adapters: Implementações das interfaces definidas nos ports, que lidam com a comunicação 
  externa (como banco de dados e sistemas de mensageria).


## Instalação
1. Clone o repositório:
    ```bash
    git clone https://github.com/lucassouzadebarros/hexagonal-architecture.git    
    ```
2. Executar com Docker Compose:

- Certifique-se de que você tem o Docker e o Docker Compose instalados.
- Navegue até o diretório do projeto onde o arquivo docker-compose.yml está localizado.
- Execute o comando Docker Compose:

    ```bash
    docker-compose up
    ```
- Para parar os containers, use:
     ```bash
    docker-compose down
    ```

3. Atualize as configurações de banco de dados no arquivo `application.properties`:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5433/seubanco
    spring.datasource.username=usuario
    spring.datasource.password=senha
    ```
4. Execute a aplicação:
    ```bash
    mvn spring-boot:run
    ```

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests. 


## Contato
- Lucas Souza de Barros - [LinkedIn](https://www.linkedin.com/in/lucassouzadebarros/)
- Email: lucassouzadebarros@gmail.com
