# Produto API - Spring Boot Project

This repository contains a comprehensive REST API application built with Spring Boot for managing products (Produtos) using SQLite database. The API supports full CRUD operations and advanced search/filtering capabilities.

**Features**

- Full CRUD operations (Create, Read, Update, Delete)
- Batch product creation
- Advanced search and filtering by name, price, quantity, and status
- CORS support enabled for cross-origin requests
- Aggregation queries (total price, product count)

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

The application exposes endpoints under `/produtos` with full CORS support.

**CRUD Operations**

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

**Search by Name**

- **GET /produtos/buscarPorNome?valor=Notebook** — search by exact name. Example:

	`curl -v http://localhost:8080/produtos/buscarPorNome?valor=Notebook`

- **GET /produtos/buscarPorNomeContendo?valor=book** — search by name containing text. Example:

	`curl -v http://localhost:8080/produtos/buscarPorNomeContendo?valor=book`

- **GET /produtos/buscarPorNomeComecandoCom?valor=Not** — search by name starting with. Example:

	`curl -v http://localhost:8080/produtos/buscarPorNomeComecandoCom?valor=Not`

- **GET /produtos/buscarPorNomeTerminandoCom?valor=top** — search by name ending with. Example:

	`curl -v http://localhost:8080/produtos/buscarPorNomeTerminandoCom?valor=top`

**Search by Price**

- **GET /produtos/buscarPorPreco?valor=2500.00** — search by exact price. Example:

	`curl -v http://localhost:8080/produtos/buscarPorPreco?valor=2500.00`

- **GET /produtos/buscarPorPrecoMaiorQue?valor=1000.00** — search by price greater than. Example:

	`curl -v http://localhost:8080/produtos/buscarPorPrecoMaiorQue?valor=1000.00`

- **GET /produtos/buscarPorPrecoMenorQue?valor=500.00** — search by price less than. Example:

	`curl -v http://localhost:8080/produtos/buscarPorPrecoMenorQue?valor=500.00`

**Search by Quantity**

- **GET /produtos/buscarPorQuantidade?valor=10** — search by exact quantity. Example:

	`curl -v http://localhost:8080/produtos/buscarPorQuantidade?valor=10`

- **GET /produtos/buscarPorQuantidadeMaiorQue?valor=5** — search by quantity greater than. Example:

	`curl -v http://localhost:8080/produtos/buscarPorQuantidadeMaiorQue?valor=5`

- **GET /produtos/buscarPorQuantidadeMenorQue?valor=20** — search by quantity less than. Example:

	`curl -v http://localhost:8080/produtos/buscarPorQuantidadeMenorQue?valor=20`

**Search by Status**

- **GET /produtos/buscarPorStatus?valor=ativo** — search by status. Example:

	`curl -v http://localhost:8080/produtos/buscarPorStatus?valor=ativo`

- **GET /produtos/buscarPorStatusPadrao** — search by default status (Disponível). Example:

	`curl -v http://localhost:8080/produtos/buscarPorStatusPadrao`

- **GET /produtos/buscarPorStatusNulos** — search for products with null status. Example:

	`curl -v http://localhost:8080/produtos/buscarPorStatusNulos`

**Combined Searches**

- **GET /produtos/buscarPorNomeEStatus?nome=Notebook&status=ativo** — search by name and status. Example:

	`curl -v http://localhost:8080/produtos/buscarPorNomeEStatus?nome=Notebook&status=ativo`

- **GET /produtos/buscarPorPrecoEStatus?preco=2500.00&status=ativo** — search by price and status. Example:

	`curl -v http://localhost:8080/produtos/buscarPorPrecoEStatus?preco=2500.00&status=ativo`

**Aggregation Endpoints**

- **GET /produtos/buscarTotalPreco** — get the total sum of all product prices. Example:

	`curl -v http://localhost:8080/produtos/buscarTotalPreco`

- **GET /produtos/contarTotalDeProdutos** — get the total count of all products. Example:

	`curl -v http://localhost:8080/produtos/contarTotalDeProdutos`

**Test checklist**

**CRUD Operations**
- [ ] `GET /produtos` returns `200` and a list of all products.
- [ ] `GET /produtos/{id}` returns `200` when the id exists.
- [ ] `POST /produtos` creates a product and returns `200` with the new product data.
- [ ] `POST /produtos/salvarLista` creates multiple products and returns `200` with all new products data.
- [ ] `PUT /produtos/{id}` updates a product and returns `200`.
- [ ] `DELETE /produtos/{id}` returns `200`.

**Search by Name**
- [ ] `GET /produtos/buscarPorNome` filters products by exact name.
- [ ] `GET /produtos/buscarPorNomeContendo` filters products by name containing text.
- [ ] `GET /produtos/buscarPorNomeComecandoCom` filters products by name prefix.
- [ ] `GET /produtos/buscarPorNomeTerminandoCom` filters products by name suffix.

**Search by Price**
- [ ] `GET /produtos/buscarPorPreco` filters products by exact price.
- [ ] `GET /produtos/buscarPorPrecoMaiorQue` filters products by price greater than.
- [ ] `GET /produtos/buscarPorPrecoMenorQue` filters products by price less than.

**Search by Quantity**
- [ ] `GET /produtos/buscarPorQuantidade` filters products by exact quantity.
- [ ] `GET /produtos/buscarPorQuantidadeMaiorQue` filters products by quantity greater than.
- [ ] `GET /produtos/buscarPorQuantidadeMenorQue` filters products by quantity less than.

**Search by Status**
- [ ] `GET /produtos/buscarPorStatus` filters products by status.
- [ ] `GET /produtos/buscarPorStatusPadrao` filters products by default status.
- [ ] `GET /produtos/buscarPorStatusNulos` returns products with null status.

**Combined Searches**
- [ ] `GET /produtos/buscarPorNomeEStatus` filters by name and status.
- [ ] `GET /produtos/buscarPorPrecoEStatus` filters by price and status.

**Aggregations**
- [ ] `GET /produtos/buscarTotalPreco` returns the total sum of all product prices.
- [ ] `GET /produtos/contarTotalDeProdutos` returns the total count of products.

**General**
- [ ] Products persist in the SQLite database (`meu_banco_de_dados.db`).
- [ ] CORS is enabled for cross-origin requests.

**Technologies Used**

- **Java 22**
- **Spring Boot 4.0.6**
- **Spring Data JPA**
- **SQLite Database**
- **Hibernate ORM**
- **Maven**
