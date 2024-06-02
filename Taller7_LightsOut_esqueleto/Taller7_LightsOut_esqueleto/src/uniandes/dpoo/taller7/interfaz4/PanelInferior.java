package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;

public class PanelInferior extends JPanel {
    private JLabel lblPuntaje;
    private JTextField txtPuntaje;
    private JLabel lblJugador;

    public PanelInferior() {
        setLayout(new FlowLayout());
        setBackground(Color.LIGHT_GRAY);

        lblPuntaje = new JLabel("Puntaje:");
        lblPuntaje.setFont(new Font("Arial", Font.BOLD, 14));

        txtPuntaje = new JTextField(10);
        txtPuntaje.setEditable(false);
        txtPuntaje.setBackground(Color.WHITE);
        txtPuntaje.setFont(new Font("Arial", Font.PLAIN, 14));

        lblJugador = new JLabel("Jugador: ");
        lblJugador.setFont(new Font("Arial", Font.BOLD, 14));

        add(lblPuntaje);
        add(txtPuntaje);
        add(lblJugador);
    }

    public void setNombreJugador(String nombre) {
        lblJugador.setText("Jugador: " + nombre);
    }
}


