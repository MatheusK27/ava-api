# ✈️ AVA API — Sistema de Gerenciamento de Companhia Aérea


\


## 📌 Sobre o projeto

A **AVA API** é uma API REST desenvolvida em Java com Spring Boot, voltada ao gerenciamento de operações de uma companhia aérea fictícia, a **AVA Linhas Aéreas**.

O projeto tem como objetivo simular regras de negócio de um sistema de aviação, permitindo o gerenciamento de aeronaves, voos, usuários e, futuramente, reservas de passagens.

A aplicação está em desenvolvimento e busca aplicar boas práticas de engenharia de software, organização em camadas e persistência de dados.

## 🚀 Tecnologias utilizadas

- **Java** — Linguagem principal da aplicação.
- **Spring Boot** — Desenvolvimento da API REST.
- **Spring Data JPA** — Persistência e gerenciamento de entidades.
- **SQL** — Banco de dados relacional.
- **Flyway** — Versionamento e migração do banco de dados.
- **Maven** — Gerenciamento de dependências.
- **Git e GitHub** — Versionamento do código-fonte.

## ⚙️ Funcionalidades

O projeto está sendo desenvolvido para contemplar:

- [ ] Cadastro e gerenciamento de usuários.
- [ ] Cadastro e gerenciamento de aeronaves.
- [ ] Cadastro e consulta de voos.
- [ ] Definição de classes e quantidade de assentos.
- [ ] Gerenciamento de reservas de passagens.
- [ ] Validação de regras de negócio.
- [ ] Tratamento padronizado de exceções.
- [ ] Documentação dos endpoints da API.

**Observação:** as funcionalidades estão sujeitas a alterações conforme a evolução do projeto. Algumas já possuem implementação parcial.

## 🏗️ Arquitetura do projeto

A API segue uma organização em camadas, buscando separar as responsabilidades da aplicação.

```text
src/main/
├── java/
│   └── AVA/Linhas/Aereas/
│       ├── Controller/
│       ├── Entidades/
│       ├── Repositorio/
│       ├── Servico/
│       ├── DTOEntrada/
│       ├── DTOSaida/
│       └── Enum/
└── resources/
    └── db/
        └── migration/
```

### Responsabilidades das camadas

| Camada      | Responsabilidade                              |
| ----------- | --------------------------------------------- |
| Controller  | Receber e responder requisições HTTP          |
| Serviço     | Implementar regras de negócio                 |
| Repositório | Realizar operações de persistência            |
| Entidades   | Representar os dados do domínio               |
| DTOs        | Transferir dados entre API e cliente          |
| Enum        | Representar valores e categorias predefinidos |
| Migration   | Controlar alterações na estrutura do banco    |

## 🛠️ Como executar o projeto

### Pré-requisitos

- JDK compatível com a versão Java utilizada.
- Maven ou Maven Wrapper.
- Banco de dados configurado.
- IDE de sua preferência, como IntelliJ IDEA.

### Clonar o repositório

```bash
git clone https://github.com/MatheusK27/ava-api.git
```

### Acessar o projeto

```bash
cd ava-api
```

### Executar a aplicação

Após configurar as propriedades do banco de dados, execute a classe principal do Spring Boot pela IDE ou utilize o Maven Wrapper, caso esteja disponível:

```bash
./mvnw spring-boot:run
```

No Windows PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

A execução depende da configuração correta do ambiente e dos serviços utilizados pela aplicação.

## 📈 Próximas etapas

- Evoluir as funcionalidades de gerenciamento de voos.
- Implementar o fluxo de reservas.
- Aprimorar as validações e regras de negócio.
- Implementar testes automatizados.
- Documentar os endpoints.
- Preparar a aplicação para implantação em ambiente de produção.

## 👨‍💻 Autor

**Matheus Klein Muniz**

Desenvolvedor Backend Java

[GitHub](https://github.com/MatheusK27) | [LinkedIn](https://www.linkedin.com/in/matheus-klein-muniz-04394a277/)

---

⭐ Projeto desenvolvido para fins de aprendizado, prática de desenvolvimento backend e composição de portfólio profissional.

**Status:** Em desenvolvimento 🚧
