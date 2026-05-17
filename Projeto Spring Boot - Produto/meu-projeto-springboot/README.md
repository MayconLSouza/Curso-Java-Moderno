# Produto API - Spring Boot Project

This repository contains a REST API application built with Spring Boot for managing products (Produtos) using SQLite database.

**Project Structure**

```
├── 📁 src
│   ├── 📁 main
│   │   ├── 📁 java
│   │   │   └── 📁 com
│   │   │       └── 📁 produtoapi
│   │   │           ├── 📁 controller
│   │   │           │   └── ☕ ProdutoController.java
│   │   │           ├── 📁 model
│   │   │           │   └── ☕ Produto.java
│   │   │           ├── 📁 repository
│   │   │           │   └── ☕ ProdutoRepository.java
│   │   │           ├── 📁 service
│   │   │           │   └── ☕ ProdutoService.java
│   │   │           └── ☕ MeuProjetoSpringbootApplication.java
│   │   └── 📁 resources
│   └── 📁 test
│       └── 📁 java
│           └── 📁 com
│               └── 📁 produtoapi
│                   └── ☕ MeuProjetoSpringbootApplicationTests.java
├── ⚙️ .gitattributes
├── ⚙️ .gitignore
├── 📝 README.md
├── 📄 mvnw
├── 📄 mvnw.cmd
└── ⚙️ pom.xml
```

**How to run**

- From the command line (Windows):

	`mvnw.cmd spring-boot:run`

- Or with local Maven:

	`mvn spring-boot:run`

Or run the main class `com.produtoapi.MeuProjetoSpringbootApplication` from your IDE.

**Routes / Endpoints and tests**

The application exposes endpoints under `/produtos`.

- **GET /produtos** — list all products. Example:

	`curl -v http://localhost:8080/produtos`

- **GET /produtos/{id}** — get a product by id. Example:

	`curl -v http://localhost:8080/produtos/1`

- **POST /produtos** — create a product. Send JSON with the fields from `Produto` (`nome`, `quantidade`, `preco`, `status`). Example:

	`curl -v -H "Content-Type: application/json" -d "{\"nome\":\"Notebook\",\"quantidade\":10,\"preco\":2500.00,\"status\":\"ativo\"}" http://localhost:8080/produtos`

	Response: `200 OK` with the created product including the generated `id`.

- **POST /produtos/salvarLista** — create multiple products at once. Send a JSON array with product objects. Example:

	`curl -v -H "Content-Type: application/json" -d "[{\"nome\":\"Notebook\",\"quantidade\":10,\"preco\":2500.00,\"status\":\"ativo\"},{\"nome\":\"Mouse\",\"quantidade\":50,\"preco\":35.00,\"status\":\"ativo\"}]" http://localhost:8080/produtos/salvarLista`

	Response: `200 OK` with a list of all created products including their generated `id` values.

- **PUT /produtos/{id}** — update a product. Send `Produto` in the request body. Example:

	`curl -v -X PUT -H "Content-Type: application/json" -d "{\"nome\":\"Notebook Dell\",\"quantidade\":15,\"preco\":2700.00,\"status\":\"ativo\"}" http://localhost:8080/produtos/1`

	Response: `200 OK` with the updated product.

- **DELETE /produtos/{id}** — delete a product. Example:

	`curl -v -X DELETE http://localhost:8080/produtos/1`

	Response: `200 OK` on success.

**Test checklist**

- [ ] `GET /produtos` returns `200` and a list of all products.
- [ ] `GET /produtos/{id}` returns `200` when the id exists.
- [ ] `POST /produtos` creates a product and returns `200` with the new product data.
- [ ] `POST /produtos/salvarLista` creates multiple products and returns `200` with all new products data.
- [ ] `PUT /produtos/{id}` updates a product and returns `200`.
- [ ] `DELETE /produtos/{id}` returns `200`.
- [ ] Products persist in the SQLite database (`meu_banco_de_dados.db`).

**Technologies Used**

- **Java 22**
- **Spring Boot 3.5.14**
- **Spring Data JPA**
- **SQLite Database**
- **Hibernate ORM**
- **Maven**
