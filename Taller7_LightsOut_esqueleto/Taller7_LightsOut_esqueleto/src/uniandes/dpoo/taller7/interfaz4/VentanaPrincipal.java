package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private PanelSuperior panelSuperior;
    private PanelDerecho panelDerecho;
    private PanelInferior panelInferior;
    private PanelTablero panelTablero;

    public VentanaPrincipal() {
        setTitle("Lights Out");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        panelSuperior = new PanelSuperior();
        panelDerecho = new PanelDerecho(this);
        panelInferior = new PanelInferior();
        panelTablero = new PanelTablero(5);

        add(panelSuperior, BorderLayout.NORTH);
        add(panelDerecho, BorderLayout.EAST);
        add(panelInferior, BorderLayout.SOUTH);
        add(panelTablero, BorderLayout.CENTER);

        getContentPane().setBackground(Color.GRAY);
    }

    public static void main(String[] args) {
        FlatLightLaf.install();
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "Nuevo":
                nuevoJuego();
                break;
            case "Reiniciar":
                reiniciarJuego();
                break;
            case "Top-10":
                mostrarTop10();
                break;
            case "Cambiar Jugador":
                cambiarJugador();
                break;
        }
    }

    public void nuevoJuego() {
        int tamaño = panelSuperior.getTamañoTablero();
        remove(panelTablero);
        panelTablero = new PanelTablero(tamaño);
        add(panelTablero, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void reiniciarJuego() {
        panelTablero.reiniciarTablero();
        repaint();
    }

    public void mostrarTop10() {
        JDialog top10Dialog = new JDialog(this, "Top-10 Puntajes", true);
        top10Dialog.setSize(300, 400);
        top10Dialog.setLocationRelativeTo(this);
        top10Dialog.setVisible(true);
    }

    public void cambiarJugador() {
        String nombre = JOptionPane.showInputDialog(this, "Ingrese su nombre:");
        panelInferior.setNombreJugador(nombre);
    }
}


