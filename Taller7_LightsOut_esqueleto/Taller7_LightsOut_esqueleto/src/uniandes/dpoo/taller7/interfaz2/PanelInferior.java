package uniandes.dpoo.taller7.interfaz2;

import javax.swing.*;
import java.awt.*;

public class PanelInferior extends JPanel {
    private JLabel lblPuntaje;
    private JTextField txtPuntaje;

    public PanelInferior() {
        setLayout(new FlowLayout());

        lblPuntaje = new JLabel("Puntaje:");
        txtPuntaje = new JTextField(10);
        txtPuntaje.setEditable(false);

        add(lblPuntaje);
        add(txtPuntaje);
    }
}

