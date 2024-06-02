package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;

public class PanelDerecho extends JPanel {
    private JButton btnNuevo;
    private JButton btnReiniciar;
    private JButton btnTop10;
    private JButton btnCambiarJugador;
    private VentanaPrincipal ventanaPrincipal;

    public PanelDerecho(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        setLayout(new GridLayout(4, 1));
        setBackground(Color.DARK_GRAY);

        btnNuevo = new JButton("Nuevo");
        btnReiniciar = new JButton("Reiniciar");
        btnTop10 = new JButton("Top-10");
        btnCambiarJugador = new JButton("Cambiar Jugador");

        btnNuevo.setForeground(Color.WHITE);
        btnNuevo.setBackground(Color.BLUE);
        btnReiniciar.setForeground(Color.WHITE);
        btnReiniciar.setBackground(Color.GREEN);
        btnTop10.setForeground(Color.WHITE);
        btnTop10.setBackground(Color.RED);
        btnCambiarJugador.setForeground(Color.WHITE);
        btnCambiarJugador.setBackground(Color.ORANGE);

        btnNuevo.addActionListener(ventanaPrincipal);
        btnReiniciar.addActionListener(ventanaPrincipal);
        btnTop10.addActionListener(ventanaPrincipal);
        btnCambiarJugador.addActionListener(ventanaPrincipal);

        btnNuevo.setActionCommand("Nuevo");
        btnReiniciar.setActionCommand("Reiniciar");
        btnTop10.setActionCommand("Top-10");
        btnCambiarJugador.setActionCommand("Cambiar Jugador");

        add(btnNuevo);
        add(btnReiniciar);
        add(btnTop10);
        add(btnCambiarJugador);
    }
}

