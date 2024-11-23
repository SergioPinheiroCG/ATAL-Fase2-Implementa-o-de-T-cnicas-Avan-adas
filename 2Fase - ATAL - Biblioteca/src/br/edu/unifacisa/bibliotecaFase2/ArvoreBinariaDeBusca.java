package br.edu.unifacisa.bibliotecaFase2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe que representa uma árvore binária de busca (ABB) para gerenciar livros.
 * Os livros podem ser adicionados e exibidos de acordo com diferentes critérios,
 * como título ou autor. Além disso, permite a busca de livros por autor.
 */
public class ArvoreBinariaDeBusca {
    private TreeNode raiz;

    /**
     * Adiciona um livro na árvore de acordo com o título. Se o livro já existir,
     * não será inserido novamente.
     * 
     * @param livro O livro a ser adicionado à árvore.
     */
    public void adicionarPorTitulo(Livro livro) {
        raiz = inserirPorTitulo(raiz, livro);
    }

    /**
     * Método recursivo para inserir um livro na árvore binária de busca por título.
     * Se o título do livro for menor que o do nó atual, o livro será inserido à esquerda;
     * caso contrário, será inserido à direita.
     * 
     * @param node O nó atual da árvore.
     * @param livro O livro a ser inserido.
     * @return O nó atualizado.
     */
    private TreeNode inserirPorTitulo(TreeNode node, Livro livro) {
        if (node == null) {
            return new TreeNode(livro);
        }

        // Verifica duplicação por título
        if (livro.getTitulo().equals(node.getLivro().getTitulo()) && 
            livro.getAutor().equals(node.getLivro().getAutor()) && 
            livro.getAno() == node.getLivro().getAno()) {
            System.out.println("Livro já existe na árvore (por título)!");
            return node;  // Retorna o nó atual sem inserir o livro
        }

        if (livro.getTitulo().compareTo(node.getLivro().getTitulo()) < 0) {
            node.setEsquerda(inserirPorTitulo(node.getEsquerda(), livro));
        } else {
            node.setDireita(inserirPorTitulo(node.getDireita(), livro));
        }
        return node;
    }

    /**
     * Adiciona um livro na árvore de acordo com o autor. Se o livro já existir,
     * não será inserido novamente.
     * 
     * @param livro O livro a ser adicionado à árvore.
     */
    public void adicionarPorAutor(Livro livro) {
        raiz = inserirPorAutor(raiz, livro);
    }

    /**
     * Método recursivo para inserir um livro na árvore binária de busca por autor.
     * Se o autor do livro for menor que o do nó atual, o livro será inserido à esquerda;
     * caso contrário, será inserido à direita.
     * 
     * @param node O nó atual da árvore.
     * @param livro O livro a ser inserido.
     * @return O nó atualizado.
     */
    private TreeNode inserirPorAutor(TreeNode node, Livro livro) {
        if (node == null) {
            return new TreeNode(livro);
        }

        // Verifica duplicação por autor
        if (livro.getAutor().equals(node.getLivro().getAutor()) && 
            livro.getTitulo().equals(node.getLivro().getTitulo()) && 
            livro.getAno() == node.getLivro().getAno()) {
            System.out.println("Livro já existe na árvore (por autor)!");
            return node;  // Retorna o nó atual sem inserir o livro
        }

        if (livro.getAutor().compareTo(node.getLivro().getAutor()) < 0) {
            node.setEsquerda(inserirPorAutor(node.getEsquerda(), livro));
        } else {
            node.setDireita(inserirPorAutor(node.getDireita(), livro));
        }
        return node;
    }

    /**
     * Exibe os livros ordenados por título em ordem crescente.
     * 
     * @param sb O StringBuilder que armazenará os títulos dos livros.
     */
    public void exibirLivrosOrdenadosPorTitulo(StringBuilder sb) {
        exibirLivrosOrdenadosPorTitulo(raiz, sb);
    }

    /**
     * Método recursivo para exibir livros ordenados por título. A ordem é definida
     * pela comparação do título dos livros.
     * 
     * @param node O nó atual da árvore.
     * @param sb O StringBuilder que armazenará os títulos dos livros.
     */
    private void exibirLivrosOrdenadosPorTitulo(TreeNode node, StringBuilder sb) {
        if (node != null) {
            exibirLivrosOrdenadosPorTitulo(node.getEsquerda(), sb);  // Recursão para a esquerda
            sb.append(node.getLivro().getTitulo()).append("\n");  // Adiciona título ao StringBuilder
            exibirLivrosOrdenadosPorTitulo(node.getDireita(), sb);  // Recursão para a direita
        }
    }
    
    /**
     * Exibe os livros ordenados por autor.
     * 
     * @param sb O StringBuilder que armazenará os livros ordenados por autor.
     */
    public void exibirLivrosPorAutor(StringBuilder sb) {
        List<Livro> livros = new ArrayList<>();
        
        // Coleta todos os livros da árvore
        coletarLivrosEmOrdem(raiz, livros);
        
        // Ordena os livros pela ordem do autor
        Collections.sort(livros, (livro1, livro2) -> livro1.getAutor().compareTo(livro2.getAutor()));

        // Exibe os livros ordenados por autor
        for (Livro livro : livros) {
            sb.append(livro.getAutor()).append(": ").append(livro.getTitulo()).append("\n");
        }
    }

    /**
     * Método recursivo para coletar todos os livros da árvore binária de busca em ordem.
     * 
     * @param node O nó atual da árvore.
     * @param livros A lista onde os livros serão armazenados.
     */
    private void coletarLivrosEmOrdem(TreeNode node, List<Livro> livros) {
        if (node == null) {
            return;
        }

        // Primeiro, percorre a subárvore esquerda
        coletarLivrosEmOrdem(node.getEsquerda(), livros);

        // Adiciona o livro do nó atual na lista
        livros.add(node.getLivro());

        // Depois, percorre a subárvore direita
        coletarLivrosEmOrdem(node.getDireita(), livros);
    }

    /**
     * Busca livros por autor. Retorna uma lista de livros do autor especificado.
     * 
     * @param autor O nome do autor a ser buscado.
     * @return Uma lista de livros do autor especificado.
     */
    public List<Livro> buscarPorAutor(String autor) {
        List<Livro> livrosAutor = new ArrayList<>();
        buscarPorAutorRecursivo(raiz, autor, livrosAutor);
        return livrosAutor;
    }

    /**
     * Método recursivo para buscar livros de um autor específico.
     * 
     * @param node O nó atual da árvore.
     * @param autor O autor a ser buscado.
     * @param livrosAutor A lista onde os livros encontrados serão armazenados.
     */
    private void buscarPorAutorRecursivo(TreeNode node, String autor, List<Livro> livrosAutor) {
        if (node == null) {
            return;
        }

        // Verifica se o livro do nó tem o autor desejado
        if (node.getLivro().getAutor().equalsIgnoreCase(autor)) {
            livrosAutor.add(node.getLivro());
        }

        // Continua a busca nas subárvores
        buscarPorAutorRecursivo(node.getEsquerda(), autor, livrosAutor);
        buscarPorAutorRecursivo(node.getDireita(), autor, livrosAutor);
    }
}

