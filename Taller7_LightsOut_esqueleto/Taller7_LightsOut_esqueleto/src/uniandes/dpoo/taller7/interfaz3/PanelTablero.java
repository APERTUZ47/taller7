package uniandes.dpoo.taller7.interfaz3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PanelTablero extends JPanel {
    private int tamañoTablero;

    public PanelTablero(int tamaño) {
        this.tamañoTablero = tamaño;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        // Código para dibujar el tablero...
    }
}
