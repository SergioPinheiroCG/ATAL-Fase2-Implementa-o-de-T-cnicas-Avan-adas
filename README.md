## 📊 ATAL-ProjetoListaEncadeada - Biblioteca

Bem-vindo(a)! Este repositório contém as atividades desenvolvidas durante a disciplina **Aplicar Algoritmos de Apoio à Pesquisa Operacional**, ministrada pelo professor **Jonhnanthan Oliveira** no curso de **Sistemas da Informação - Unifacisa**. Este projeto é uma implementação prática de um sistema para administração de uma biblioteca, desenvolvido pelos alunos: Gustavo Tomio Magalhaes Kubo, Thiago de Alencar Limeira e Sérgio Magno Castor Pinheiro.

---

## 🎯 Objetivo do Projeto

Implementar um sistema de armazenamento e organização de livros para uma biblioteca usando estruturas de dados e algoritmos específicos, sem o uso do **Collections Framework**.

### 📌 Critérios de Implementação

1. **Estrutura de Dados**:
   - Lista sequencial ou lista encadeada.
   - Estrutura capaz de armazenar objetos que representam livros com os atributos:
     - **Título**
     - **Autor**
     - **Ano de Publicação**

2. **Algoritmos de Ordenação**:
   - Utilização de **bubble sort** ou **quick sort** para ordenar os livros por título ou autor.

3. **Interface do Usuário**:
   - Baseada em linha de comando (CLI) ou interface gráfica (UI).
   - Funcionalidades:
     - **Adicionar Livro**: Cadastro de novos livros com título, autor e ano de publicação.
     - **Listar Livros**: Exibição de todos os livros cadastrados.
     - **Ordenar Livros**: Ordenação dos livros cadastrados por título ou autor.
     - **Buscar Livro**: Pesquisa de um livro específico.

4. **Documentação**:
   - Explicação sobre a estrutura de dados escolhida e sua implementação.
   - Descrição do algoritmo de ordenação adotado e os critérios para sua escolha.

---

## 📂 Estrutura do Projeto

O projeto é organizado da seguinte maneira:

```plaintext
biblioteca
├── src
│   └── br.edu.unifacisa.biblioteca
│       ├── Livro.java               // Classe que representa um livro
│       ├── Nodo.java                // Estrutura de nó para a lista encadeada
│       ├── ListaEncadeada.java      // Implementação da lista encadeada
│       └── Main.java                // Classe principal para execução e testes
├── README.md                        // Documentação do projeto
└── Documentação                     // Explicação da estrutura e algoritmos
```
🛠️ Tecnologias Utilizadas
```bash
- Eclipse IDE 2024-06: Ambiente de desenvolvimento integrado usado para a criação e execução do projeto.

- Java: Linguagem de programação utilizada para desenvolver todas as classes e algoritmos.

- Linha de Comando (CLI): Interface do sistema, fornecendo opções para adicionar, listar, ordenar e buscar livros.
```

## 🚀 Como Usar
```bash
1. Clonando o Repositório:
git clone https://github.com/usuario/Atal-ProjetoListaEncadeada.git
cd Atal-ProjetoListaEncadeada

2. Compilando e Executando o Projeto:
Para compilar e executar o projeto, certifique-se de ter o Java Development Kit (JDK) instalado.

No terminal, dentro da pasta do projeto, compile os arquivos .java:

javac -d bin src/br/edu/unifacisa/biblioteca/*.java src/br/edu/unifacisa/biblioteca/application/*.java

Após a compilação, execute o projeto chamando a classe principal (Main):
java -cp bin br.edu.unifacisa.biblioteca.application.Main
```

## 📝 **Documentação**
```bash
* Acesse a pasta Documentação para ter acesso aos documentos explicativos:
   - Estrutura de dados escolhida e justificativas.
   - Algoritmo de ordenação utilizado e análise de desempenho.
```

## 📬 Contribuições
Fique à vontade para contribuir!
