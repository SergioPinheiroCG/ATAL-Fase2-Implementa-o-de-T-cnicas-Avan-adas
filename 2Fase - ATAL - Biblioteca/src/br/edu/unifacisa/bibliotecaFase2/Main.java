package br.edu.unifacisa.bibliotecaFase2;

import javax.swing.SwingUtilities;
/**
 * Classe principal que inicializa a interface gráfica da biblioteca.
 * Utiliza o Swing para exibir a interface do usuário.
 */
public class Main {
    /**
     * Método principal que inicializa e exibe a interface gráfica.
     * 
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BibliotecaGUI bibliotecaGUI = new BibliotecaGUI();
            bibliotecaGUI.setVisible(true);
        });
    }
}
