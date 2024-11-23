# 📚 Sistema de Biblioteca com Árvore Binária de Busca

Este é um sistema simples de gerenciamento de livros em uma biblioteca, utilizando uma **árvore binária de busca (ABB)** para armazenar e manipular os livros. A aplicação oferece funcionalidades como adicionar livros, listar, ordenar por título ou autor, e recomendar livros baseados no autor.

## 🗂️ Estrutura do Projeto

O projeto está organizado da seguinte forma:

```plaintext
bibliotecaFase2
├── br
│   └── edu
│       └── unifacisa
│           └── bibliotecaFase2
│               ├── ArvoreBinariaDeBusca.java
│               ├── BibliotecaGUI.java
│               ├── Livro.java
│               ├── Main.java
│               ├── TreeNode.java
```


## 📄 Descrição dos Arquivos

- **ArvoreBinariaDeBusca.java**: Contém a lógica da árvore binária de busca para adicionar livros por título ou autor e exibir livros ordenados.
- **BibliotecaGUI.java**: Interface gráfica utilizando **Swing** para interação com o usuário. Permite adicionar livros, listar livros, ordenar e recomendar livros.
- **Livro.java**: Classe que representa um livro, com atributos de título, autor e ano de publicação.
- **Main.java**: Ponto de entrada da aplicação, inicializando a interface gráfica.
- **TreeNode.java**: Nó da árvore binária, contendo um livro e referências para os filhos esquerdo e direito.

## ⚙️ Funcionalidades

- **Adicionar Livro** 📖: Permite adicionar um livro à biblioteca através da interface gráfica.
- **Listar Livros** 📋: Exibe a lista de livros ordenada por título.
- **Ordenar por Título** 🔠: Organiza os livros automaticamente por título ao exibir.
- **Recomendar por Autor** 👤: Exibe os livros de um autor específico.
- **Exibir Livros por Título** 📚: Exibe todos os livros ordenados por título.
- **Exibir Livros por Autor** 🧑‍🏫: Exibe os livros ordenados por autor.

## 📑 Como Usar

### 🔧 Pré-requisitos

- JDK 8 ou superior.
- IDE de sua preferência (ex: Eclipse, IntelliJ, NetBeans).

### 🔄 Passos

1. **Clone o repositório**:
    ```bash
    git clone <url-do-repositorio>
    cd bibliotecaFase2
    ```

2. **Compile e execute o projeto**:

   - Se você estiver utilizando uma **IDE**, basta importar o projeto e executar o arquivo `Main.java`.
   - Caso prefira compilar e rodar via terminal, execute os seguintes comandos:
     ```bash
     javac br/edu/unifacisa/bibliotecaFase2/Main.java
     java br.edu.unifacisa.bibliotecaFase2.Main
     ```

3. **Interaja com a interface gráfica**:

   Ao iniciar o sistema, a interface gráfica será exibida. Você verá uma janela com **botões interativos** para adicionar livros, listar livros, ordenar por título, recomendar por autor, entre outras opções.

   - **Adicionar um livro** 📖: Clique no botão "Adicionar Livro", insira o título, autor e ano de publicação.
   - **Listar livros** 🗂️: Clique no botão "Listar Livros" para ver todos os livros cadastrados.
   - **Ordenar por título ou autor** 🔠: Clique nos botões correspondentes para ordenar a lista de livros.
   - **Recomendar livros por autor** 👨‍🏫: Escolha um autor e veja todos os livros desse autor.

## 🧠 Estrutura de Dados

O sistema utiliza uma **árvore binária de busca (ABB)** para armazenar os livros, com duas formas de ordenação:

- **Por título**: Os livros são inseridos e ordenados com base no título.
- **Por autor**: Os livros podem ser listados e ordenados por autor, após serem armazenados na árvore.

### ➕ Inserção de Livros

A inserção de livros na árvore binária é feita com base no título ou autor. Caso um livro já exista (mesmo título, autor e ano), ele não será adicionado novamente.

### 🔍 Exibição de Livros

- **Ordenação por Título** 🔠: Exibe os livros de forma ordenada por título.
- **Ordenação por Autor** 🧑‍🏫: Exibe os livros de forma ordenada por autor.
- **Busca por Autor** 🕵️: Permite buscar livros de um autor específico.

## 🧑‍💻 Exemplo de Uso

Ao iniciar o sistema, a interface gráfica permite que o usuário insira os dados de um livro e escolha as ações que deseja realizar. Veja abaixo um exemplo de interação:

1. **Adicionar um livro** 📚: Adicione um livro chamado "O Senhor dos Anéis", de J.R.R. Tolkien, publicado em 1954.
   
2. **Escolha uma ação**:
   - Listar os livros ordenados por título 📜.
   - Exibir livros ordenados por autor 🧑‍🏫.
   - Buscar livros por autor 🕵️.
   - Ordenar os livros por título 🔠.

3. **Resultados**: Após realizar as ações, o sistema exibirá os livros organizados de acordo com a opção escolhida.

## 🖼️ Exemplo de Tela

A interface gráfica permite uma interação simples, onde cada ação é executada através de botões na tela. Ao clicar em "Adicionar Livro" ➕, um formulário aparecerá solicitando o título, autor e ano. Após adicionar os livros, você pode ordenar ou exibir livros por título ou autor.

---
