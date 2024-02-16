# API de Controle de Vendas
A API de Controle de Vendas é uma aplicação RESTful que oferece funcionalidades CRUD para usuários e produtos, além de gerenciar o controle de vendas e o estoque.

## Requisitos
- Java
- Maven
- Spring Boot
- MySQL

## Instalação

1. **Clone o repositório**:
```bash
git clone https://github.com/Isailton89/Api-Controle-de-Vendas.git
```
2. **Altere o arquivo application.properties com os dados do banco de dados:**
```
spring.datasource.url=${DATASOURCE_URL}
spring.datasource.username=${DATASOURCE_USERNAME}
spring.datasource.password=${DATASOURCE_PASSWORD}
```
3. **Execute a classe ApiApplication com a IDE de sua escolha.**

## Endpoints

### Usuário (User)

Os endpoints relacionados aos usuários oferecem as operações CRUD, permitindo o gerenciamento completo das informações dos usuários.

- **GET `/user`**:
    - Retorna a lista de todos os usuários cadastrados.
- **GET `/user/{cpf}`**:
    - Retorna o endereço completo do usuário com base no CPF fornecido.
- **POST `/user`**:
    - Cria um novo usuário com os detalhes fornecidos no corpo da requisição.
- **DELETE `/user/{id}`**:
    - Exclui um usuário com o ID correspondente.

### Produto (Product)

Os endpoints relacionados aos produtos também fornecem operações CRUD para gerenciar o catálogo de produtos disponíveis.

- **GET `/product`**:
    - Retorna a lista de todos os produtos cadastrados.
- **POST `/product`**:
    - Adiciona um novo produto ao catálogo com os detalhes fornecidos no corpo da requisição.
- **PUT `/product`**:
    - Atualiza as informações de um produto com os detalhes fornecidos no corpo da requisição.
- **DELETE `/product/{id}`**:
    - Remove um produto com o ID correspondente do catálogo.

### Venda (Sale)

O endpoint de vendas oferece suporte  a possibilidade de enviar um arquivo XLSX para processamento.

- **POST `/sale`**:
    - Submete um arquivo XLSX contendo detalhes das vendas para registro.

### Estoque (Stock)

O endpoint relacionado ao estoque permitem o controle das quantidades disponíveis de produtos em estoque.

- **POST `/stock/{idProduto}`**:
    - Recebe o ID de um produto como parâmetro e realiza a inserção da quantidade em estoque, juntamente com a data da compra.

## Documentação

A documentação detalhada da API pode ser encontrada no Swagger:

- [Swagger Documentação](http://localhost:8080/swagger-ui/index.html)