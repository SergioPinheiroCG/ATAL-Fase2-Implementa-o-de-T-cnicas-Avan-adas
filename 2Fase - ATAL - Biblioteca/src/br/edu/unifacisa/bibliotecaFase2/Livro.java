package br.edu.unifacisa.bibliotecaFase2;

/**
 * Representa um livro da biblioteca.
 * Contém informações sobre o título, autor e ano de publicação do livro.
 * Implementa a interface Comparable para permitir a comparação de livros por autor.
 */
public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int ano;

    /**
     * Constrói um novo livro com título, autor e ano de publicação.
     * 
     * @param titulo Título do livro.
     * @param autor Autor do livro.
     * @param ano Ano de publicação do livro.
     */
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    /**
     * Retorna o título do livro.
     * 
     * @return Título do livro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Retorna o autor do livro.
     * 
     * @return Autor do livro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Retorna o ano de publicação do livro.
     * 
     * @return Ano de publicação.
     */
    public int getAno() {
        return ano;
    }

    /**
     * Representação em formato de String do livro.
     * 
     * @return String formatada com título, autor e ano do livro.
     */
    @Override
    public String toString() {
        return titulo + " (" + autor + ", " + ano + ")";
    }

    /**
     * Compara dois livros com base no autor.
     * 
     * @param outroLivro Outro livro para comparação.
     * @return Valor negativo, zero ou positivo, dependendo da comparação entre os autores.
     */
    @Override
    public int compareTo(Livro outroLivro) {
        return this.autor.compareTo(outroLivro.getAutor());
    }
}
