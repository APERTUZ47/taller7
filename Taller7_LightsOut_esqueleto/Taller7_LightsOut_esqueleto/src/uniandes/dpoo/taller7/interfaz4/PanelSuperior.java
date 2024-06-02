package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;

public class PanelSuperior extends JPanel {
    private JLabel lblJugador;
    private JComboBox<String> cmbTamaño;
    private JRadioButton rdbFacil;
    private JRadioButton rdbDificil;
    private ButtonGroup grupoDificultad;

    public PanelSuperior() {
        setLayout(new FlowLayout());
        setBackground(Color.LIGHT_GRAY);

        lblJugador = new JLabel("Jugador:");
        lblJugador.setFont(new Font("Arial", Font.BOLD, 14));

        cmbTamaño = new JComboBox<>(new String[] {"5x5", "7x7", "10x10"});
        cmbTamaño.setBackground(Color.WHITE);

        rdbFacil = new JRadioButton("Fácil");
        rdbDificil = new JRadioButton("Difícil");
        grupoDificultad = new ButtonGroup();
        grupoDificultad.add(rdbFacil);
        grupoDificultad.add(rdbDificil);

        add(lblJugador);
        add(cmbTamaño);
        add(rdbFacil);
        add(rdbDificil);
    }

    public int getTamañoTablero() {
        String tamaño = (String) cmbTamaño.getSelectedItem();
        switch (tamaño) {
            case "7x7": return 7;
            case "10x10": return 10;
            default: return 5;
        }
    }
}

