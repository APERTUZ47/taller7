package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDerecho extends JPanel implements ActionListener {
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

        btnNuevo.addActionListener(this);
        btnReiniciar.addActionListener(this);
        btnTop10.addActionListener(this);
        btnCambiarJugador.addActionListener(this);

        add(btnNuevo);
        add(btnReiniciar);
        add(btnTop10);
        add(btnCambiarJugador);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNuevo) {
            ventanaPrincipal.nuevoJuego();
        } else if (e.getSource() == btnReiniciar) {
            ventanaPrincipal.reiniciarJuego();
        } else if (e.getSource() == btnTop10) {
            ventanaPrincipal.mostrarTop10();
        } else if (e.getSource() == btnCambiarJugador) {
            ventanaPrincipal.cambiarJugador();
        }
    }
}

