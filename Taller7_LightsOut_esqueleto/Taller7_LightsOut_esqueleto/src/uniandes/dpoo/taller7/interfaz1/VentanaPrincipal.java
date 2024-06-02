package uniandes.dpoo.taller7.interfaz1;
import javax.swing.*;
import java.awt.*;
import com.formdev.flatlaf.FlatLightLaf;
import uniandes.dpoo.taller7.interfaz2.PanelSuperior;
import uniandes.dpoo.taller7.interfaz2.PanelDerecho;
import uniandes.dpoo.taller7.interfaz2.PanelInferior;

public class VentanaPrincipal extends JFrame {
    private PanelSuperior panelSuperior;
    private PanelDerecho panelDerecho;
    private PanelInferior panelInferior;

    public VentanaPrincipal() {
        setTitle("Lights Out");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        panelSuperior = new PanelSuperior();
        panelDerecho = new PanelDerecho();
        panelInferior = new PanelInferior();

        add(panelSuperior, BorderLayout.NORTH);
        add(panelDerecho, BorderLayout.EAST);
        add(panelInferior, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        FlatLightLaf.install();
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}
