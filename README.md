# 🌱 API RESTful para Gestão de Hortas e Plantios

## Descrição

Este projeto é uma API RESTful desenvolvida em Spring Boot, que permite gerenciar hortas e seus respectivos plantios.  
As operações CRUD (Create, Read, Update, Delete) são implementadas para as duas entidades, que possuem relacionamento One-to-Many.

A API persiste os dados em um banco de dados PostgreSQL utilizando JPA (Java Persistence API) com Spring Data.  
A documentação interativa é fornecida via Swagger (SpringDoc OpenAPI).

---

## Tecnologias Utilizadas

- Java 17  
- Spring Boot 3.1.2  
- Spring Data JPA  
- PostgreSQL  
- Maven  
- Swagger (SpringDoc OpenAPI)  

---

## Entidades Principais

- **Horta:** Representa um local de plantio, com campos `id`, `nome` e `localizacao`.  
- **Plantio:** Representa o plantio de uma cultura em uma horta, com campos `id`, `cultura`, `dataPlantio`, `status` e uma referência para a horta.

---

## Funcionalidades

- Criar, listar, atualizar e deletar hortas.  
- Criar, listar, atualizar e deletar plantios, vinculados a uma horta específica.  
- Relacionamento um-para-muitos entre Horta e Plantio.  
- Documentação interativa da API via Swagger UI.

---

## Como Executar

### Requisitos

- Java JDK 17+  
- Maven  
- Banco PostgreSQL configurado  

### Passos

1. Clone este repositório:
    ```bash
    git clone https://github.com/seu-usuario/nome-do-repositorio.git
    cd nome-do-repositorio
    ```
2. Configure o banco de dados PostgreSQL e ajuste o arquivo `src/main/resources/application.properties` com suas credenciais.

3. Compile e gere o `.jar`:
    ```bash
    mvn clean package
    ```
4. Execute a aplicação:
    ```bash
    java -jar target/horta-1.0-SNAPSHOT.jar
    ```
5. Acesse a documentação Swagger na URL:
    ```
    http://localhost:8080/swagger-ui/index.html
    ```

---

## Testando os Endpoints

### Criar Horta (POST `/api/hortas`)

```json
{
  "nome": "Horta do Bairro",
  "localizacao": "Rua Exemplo, 123"
}
````

### Criar Plantio (POST `/api/plantios`)

```json
{
  "cultura": "Tomate",
  "dataPlantio": "2025-06-26",
  "status": "ativo",
  "horta": {
    "id": 1
  }
}
```

Você pode testar os endpoints via Swagger UI, Postman, ou `curl`.

---

## Dificuldades Encontradas

* Configurar corretamente o relacionamento One-to-Many entre as entidades.
* Ajustar a documentação Swagger para funcionar com Spring Boot 3.
* Garantir que os dados persistissem corretamente no banco PostgreSQL.
* Aprender o fluxo de build com Maven e execução do `.jar`.

---

## Contato

Desenvolvido por: Luis Gustavo Brito

