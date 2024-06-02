package uniandes.dpoo.taller7.interfaz2;

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

        lblJugador = new JLabel("Jugador:");
        cmbTamaño = new JComboBox<>(new String[] {"5x5", "7x7", "10x10"});
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
}

