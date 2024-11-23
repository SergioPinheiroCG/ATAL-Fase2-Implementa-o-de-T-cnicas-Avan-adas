package br.edu.unifacisa.bibliotecaFase2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

/**
 * Classe que representa a interface gráfica da aplicação da biblioteca.
 * Esta classe permite a interação do usuário com o sistema de gerenciamento de livros.
 * Contém botões para adicionar livros, listar livros, ordenar e exibir livros por título ou autor.
 */
public class BibliotecaGUI extends JFrame {
    // A árvore binária de busca onde os livros são armazenados.
    private ArvoreBinariaDeBusca arvoreLivros;

    /**
     * Construtor da classe BibliotecaGUI.
     * Inicializa a árvore de livros e configura a interface gráfica da aplicação.
     */
    public BibliotecaGUI() {
        // Inicializa a árvore de livros.
        arvoreLivros = new ArvoreBinariaDeBusca();

        // Configuração da janela principal
        setTitle("Biblioteca");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel de botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 1));

        // Criação dos botões
        JButton btnAdicionarLivro = new JButton("Adicionar Livro");
        JButton btnListarLivros = new JButton("Listar Livros");
        JButton btnOrdenarPorTitulo = new JButton("Ordenar por Título");
        JButton btnRecomendarPorAutor = new JButton("Recomendar por Autor");
        JButton btnExibirPorTitulo = new JButton("Exibir Livros (Título)");
        JButton btnExibirPorAutor = new JButton("Exibir Livros (Autor)");
        JButton btnSair = new JButton("Sair");

        // Adiciona os botões ao painel
        buttonPanel.add(btnAdicionarLivro);
        buttonPanel.add(btnListarLivros);
        buttonPanel.add(btnOrdenarPorTitulo);
        buttonPanel.add(btnRecomendarPorAutor);
        buttonPanel.add(btnExibirPorTitulo);
        buttonPanel.add(btnExibirPorAutor);
        buttonPanel.add(btnSair);

        // Adiciona o painel de botões à janela principal
        add(buttonPanel, BorderLayout.CENTER);

        // Ações dos botões
        btnAdicionarLivro.addActionListener(this::adicionarLivro);
        btnListarLivros.addActionListener(this::listarLivros);
        btnOrdenarPorTitulo.addActionListener(this::ordenarPorTitulo);
        btnRecomendarPorAutor.addActionListener(this::recomendarPorAutor);
        btnExibirPorTitulo.addActionListener(this::exibirPorTitulo);
        btnExibirPorAutor.addActionListener(this::exibirPorAutor);
        btnSair.addActionListener(e -> System.exit(0));
    }

    /**
     * Método chamado quando o botão "Adicionar Livro" é pressionado.
     * Solicita ao usuário as informações do livro (título, autor, ano de publicação)
     * e adiciona o livro na árvore binária de busca.
     */
    private void adicionarLivro(ActionEvent e) {
        // Solicita informações do livro
        String titulo = JOptionPane.showInputDialog(this, "Digite o título do livro:");
        String autor = JOptionPane.showInputDialog(this, "Digite o autor do livro:");
        String anoStr = JOptionPane.showInputDialog(this, "Digite o ano de publicação:");

        try {
            // Converte o ano para número e cria o objeto Livro
            int ano = Integer.parseInt(anoStr);
            Livro livro = new Livro(titulo, autor, ano);
            arvoreLivros.adicionarPorTitulo(livro);
            JOptionPane.showMessageDialog(this, "Livro adicionado com sucesso!");
        } catch (NumberFormatException ex) {
            // Caso o ano não seja um número válido, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(this, "Ano inválido. Por favor, insira um número.");
        }
    }

    /**
     * Método chamado quando o botão "Listar Livros" é pressionado.
     * Exibe todos os livros armazenados na árvore binária de busca, ordenados por título.
     */
    private void listarLivros(ActionEvent e) {
        StringBuilder sb = new StringBuilder();
        arvoreLivros.exibirLivrosOrdenadosPorTitulo(sb);
        mostrarMensagem("Lista de Livros", sb.toString());
    }

    /**
     * Método chamado quando o botão "Ordenar por Título" é pressionado.
     * Exibe uma mensagem informando que os livros são automaticamente exibidos ordenados por título.
     */
    private void ordenarPorTitulo(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Os livros são exibidos automaticamente ordenados por título.");
    }

    /**
     * Método chamado quando o botão "Recomendar por Autor" é pressionado.
     * Solicita ao usuário o nome de um autor e exibe os livros desse autor, se houver.
     */
    private void recomendarPorAutor(ActionEvent e) {
        // Solicita o nome do autor
        String autorBusca = JOptionPane.showInputDialog(this, "Digite o nome do autor:");
        List<Livro> livrosAutor = arvoreLivros.buscarPorAutor(autorBusca);

        if (livrosAutor.isEmpty()) {
            // Caso nenhum livro seja encontrado, exibe uma mensagem
            JOptionPane.showMessageDialog(this, "Nenhum livro encontrado para o autor: " + autorBusca);
        } else {
            // Exibe a lista de livros encontrados
            StringBuilder sb = new StringBuilder("Livros encontrados:\n");
            for (Livro l : livrosAutor) {
                sb.append(l).append("\n");
            }
            mostrarMensagem("Recomendação por Autor", sb.toString());
        }
    }

    /**
     * Método chamado quando o botão "Exibir Livros (Título)" é pressionado.
     * Exibe todos os livros ordenados por título.
     */
    private void exibirPorTitulo(ActionEvent e) {
        StringBuilder sb = new StringBuilder();
        arvoreLivros.exibirLivrosOrdenadosPorTitulo(sb);
        mostrarMensagem("Livros Ordenados por Título", sb.toString());
    }

    /**
     * Método chamado quando o botão "Exibir Livros (Autor)" é pressionado.
     * Exibe todos os livros organizados por autor.
     */
    private void exibirPorAutor(ActionEvent e) {
        StringBuilder sb = new StringBuilder();
        arvoreLivros.exibirLivrosPorAutor(sb);
        mostrarMensagem("Livros Ordenados por Autor", sb.toString());
    }

    /**
     * Método que exibe uma mensagem em uma janela de diálogo.
     * 
     * @param titulo O título da janela de mensagem.
     * @param mensagem O conteúdo da mensagem a ser exibida.
     */
    private void mostrarMensagem(String titulo, String mensagem) {
        JTextArea textArea = new JTextArea(mensagem);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JOptionPane.showMessageDialog(this, scrollPane, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método principal para inicializar a interface gráfica da biblioteca.
     * 
     * @param args Argumentos da linha de comando (não utilizados neste caso).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BibliotecaGUI frame = new BibliotecaGUI();
            frame.setVisible(true);
        });
    }
}
