# 🐾 API Petshop

API REST desenvolvida com **Spring Boot** para gerenciamento de animais e clientes de um petshop.

---

## 🚀 Como rodar o projeto

### ✅ Pré-requisitos

Antes de começar, você precisa ter instalado:

* Docker
* Docker Compose
* Java 17+ (caso queira rodar sem Docker)

---

## 🐳 Subindo o banco de dados com Docker (OBRIGATÓRIO)

Na raiz do projeto, execute o comando:

```bash
docker-compose up -d
```

Esse comando irá:

* Subir o banco de dados MySQL
* Criar o banco automaticamente
* Deixar o banco disponível para a aplicação

O uso do Docker Compose permite subir todos os serviços necessários com um único comando, facilitando a execução do projeto em qualquer ambiente ([Pacotes Go][1])

---

## ▶️ Rodando a aplicação

Após subir o banco, você pode iniciar a API de duas formas:

### ✔️ Via IDE (recomendado)

* Abra o projeto na sua IDE (IntelliJ / Eclipse / VS Code)
* Execute a classe principal (`SpringBootApplication`)

---

### ✔️ Via terminal

```bash
./mvnw spring-boot:run
```

ou

```bash
mvn spring-boot:run
```

---

## 🌐 Acessando a aplicação

Após iniciar, a API estará disponível em:

```bash
http://localhost:8080
```

---

## 📘 Swagger (Documentação da API)

A documentação interativa da API pode ser acessada em:

```bash
http://localhost:8080/
```

ou (dependendo da configuração):

```bash
http://localhost:8080/swagger-ui.html
```

O Swagger permite visualizar e testar os endpoints diretamente pelo navegador.

---

## 📚 Endpoints principais

### 🐶 Animal (`/petshop`)

* `POST /petshop` → Criar animal
* `GET /petshop` → Listar todos
* `GET /petshop/{id}` → Buscar por ID
* `PUT /petshop/{id}` → Atualizar
* `DELETE /petshop/{id}` → Deletar

---

### 👤 Cliente (`/cliente`)

* `PUT /cliente` → Criar cliente
* `GET /cliente` → Listar todos
* `GET /cliente/{id}` → Buscar por ID
* `PUT /cliente/{id}` → Atualizar
* `DELETE /cliente/{id}` → Deletar

---

## 🗄️ Banco de Dados

* Banco: MySQL
* As tabelas são criadas automaticamente via JPA (`spring.jpa.hibernate.ddl-auto=update`)
* As configurações de conexão estão no `application.properties`

---

## ⚠️ Observações importantes

* O endpoint de criação de cliente utiliza `PUT` ao invés de `POST`
* O `id` do cliente deve ser informado manualmente (não é auto increment)
* Não há validações obrigatórias nos campos
* Não há relacionamento entre Cliente e Animal (modelo simplificado)

---

## 💡 Melhorias futuras

* Adicionar validações (`@NotNull`, `@Size`)
* Implementar relacionamento entre entidades
* Padronizar REST (`POST` para criação)
* Adicionar autenticação (Spring Security)
* Criar testes automatizados

---

## 👨‍💻 Autor

Ricardo Almeida
Projeto desenvolvido para fins de estudo 🚀

[1]: https://pkg.go.dev/github.com/petshop-system/petshop-api?utm_source=chatgpt.com "petshop-api module - github.com/petshop-system/petshop-api - Go Packages"
