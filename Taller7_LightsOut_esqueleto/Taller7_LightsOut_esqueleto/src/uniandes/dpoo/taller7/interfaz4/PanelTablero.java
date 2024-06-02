package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelTablero extends JPanel {
    private int tamañoTablero;
    private boolean[][] estadoLuces;
    private int[][] contadorClics;
    private int filaSeleccionada = -1;
    private int columnaSeleccionada = -1;

    public PanelTablero(int tamaño) {
        this.tamañoTablero = tamaño;
        estadoLuces = new boolean[tamañoTablero][tamañoTablero];
        contadorClics = new int[tamañoTablero][tamañoTablero];
        inicializarTablero();
        setBackground(Color.GRAY);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int[] casilla = convertirCoordenadasACasilla(e.getX(), e.getY());
                cambiarEstado(casilla[0], casilla[1]);
                contadorClics[casilla[0]][casilla[1]]++;
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                int[] casilla = convertirCoordenadasACasilla(e.getX(), e.getY());
                filaSeleccionada = casilla[0];
                columnaSeleccionada = casilla[1];
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                filaSeleccionada = -1;
                columnaSeleccionada = -1;
                repaint();
            }
        });
    }

    private void inicializarTablero() {
        for (int i = 0; i < tamañoTablero; i++) {
            for (int j = 0; j < tamañoTablero; j++) {
                estadoLuces[i][j] = Math.random() > 0.5;
                contadorClics[i][j] = 0;
            }
        }
    }

    public void reiniciarTablero() {
        for (int i = 0; i < tamañoTablero; i++) {
            for (int j = 0; j < tamañoTablero; j++) {
                estadoLuces[i][j] = Math.random() > 0.5;
                contadorClics[i][j] = 0;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int anchoCasilla = getWidth() / tamañoTablero;
        int altoCasilla = getHeight() / tamañoTablero;

        for (int i = 0; i < tamañoTablero; i++) {
            for (int j = 0; j < tamañoTablero; j++) {
                if (estadoLuces[i][j]) {
                    g2d.setColor(Color.YELLOW);
                } else {
                    g2d.setColor(Color.GRAY);
                }

                if (i == filaSeleccionada && j == columnaSeleccionada) {
                    g2d.setColor(Color.CYAN);
                }

                GradientPaint gradiente = new GradientPaint(j * anchoCasilla, i * altoCasilla, Color.WHITE,
                        (j + 1) * anchoCasilla, (i + 1) * altoCasilla, g2d.getColor());
                g2d.setPaint(gradiente);
                g2d.fillRoundRect(j * anchoCasilla, i * altoCasilla, anchoCasilla, altoCasilla, 20, 20);
                g2d.setColor(Color.BLACK);
                g2d.drawRoundRect(j * anchoCasilla, i * altoCasilla, anchoCasilla, altoCasilla, 20, 20);

                g2d.setColor(Color.BLACK);
                g2d.drawString(String.valueOf(contadorClics[i][j]), j * anchoCasilla + anchoCasilla / 2,
                        i * altoCasilla + altoCasilla / 2);
            }
        }
    }

    private int[] convertirCoordenadasACasilla(int x, int y) {
        int anchoCasilla = getWidth() / tamañoTablero;
        int altoCasilla = getHeight() / tamañoTablero;
        int fila = y / altoCasilla;
        int columna = x / anchoCasilla;
        return new int[]{fila, columna};
    }

    private void cambiarEstado(int fila, int columna) {
        if (fila >= 0 && fila < tamañoTablero && columna >= 0 && columna < tamañoTablero) {
            estadoLuces[fila][columna] = !estadoLuces[fila][columna];
            if (fila > 0) estadoLuces[fila - 1][columna] = !estadoLuces[fila - 1][columna];
            if (fila < tamañoTablero - 1) estadoLuces[fila + 1][columna] = !estadoLuces[fila + 1][columna];
            if (columna > 0) estadoLuces[fila][columna - 1] = !estadoLuces[fila][columna - 1];
            if (columna < tamañoTablero - 1) estadoLuces[fila][columna + 1] = !estadoLuces[fila][columna + 1];
        }
    }
}



