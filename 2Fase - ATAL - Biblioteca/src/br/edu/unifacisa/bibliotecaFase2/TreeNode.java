package br.edu.unifacisa.bibliotecaFase2;

/**
 * Representa um nó em uma árvore binária de pesquisa.
 * Cada nó contém um livro e referências para filhos à esquerda e à direita.
 */
public class TreeNode {
    private Livro livro;
    private TreeNode esquerda;
    private TreeNode direita;

    /**
     * Constrói um novo nó com o livro fornecido.
     * 
     * @param livro Livro armazenado no nó.
     */
    public TreeNode(Livro livro) {
        this.livro = livro;
        this.esquerda = null;
        this.direita = null;
    }

    /**
     * Retorna o livro armazenado no nó.
     * 
     * @return Livro armazenado no nó.
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * Retorna o filho à esquerda do nó.
     * 
     * @return Filho à esquerda.
     */
    public TreeNode getEsquerda() {
        return esquerda;
    }

    /**
     * Define o filho à esquerda do nó.
     * 
     * @param esquerda Filho à esquerda.
     */
    public void setEsquerda(TreeNode esquerda) {
        this.esquerda = esquerda;
    }

    /**
     * Retorna o filho à direita do nó.
     * 
     * @return Filho à direita.
     */
    public TreeNode getDireita() {
        return direita;
    }

    /**
     * Define o filho à direita do nó.
     * 
     * @param direita Filho à direita.
     */
    public void setDireita(TreeNode direita) {
        this.direita = direita;
    }
}
