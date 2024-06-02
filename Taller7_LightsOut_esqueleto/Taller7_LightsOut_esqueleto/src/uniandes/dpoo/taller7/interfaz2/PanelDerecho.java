package uniandes.dpoo.taller7.interfaz2;

import javax.swing.*;
import java.awt.*;

public class PanelDerecho extends JPanel {
    private JButton btnNuevo;
    private JButton btnReiniciar;
    private JButton btnTop10;
    private JButton btnCambiarJugador;

    public PanelDerecho() {
        setLayout(new GridLayout(4, 1));

        btnNuevo = new JButton("Nuevo");
        btnReiniciar = new JButton("Reiniciar");
        btnTop10 = new JButton("Top-10");
        btnCambiarJugador = new JButton("Cambiar Jugador");

        add(btnNuevo);
        add(btnReiniciar);
        add(btnTop10);
        add(btnCambiarJugador);
    }
}
