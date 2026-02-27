package view;

import javax.swing.*;
import java.awt.*;

public class VentanaInicio extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField txtNombre;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new VentanaInicio());
    }

    public VentanaInicio() {
        setTitle("Bienvenido al Test de Fútbol");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        JLabel lbl = new JLabel("Introduce tu nombre o nick:", SwingConstants.CENTER);
        add(lbl);

        txtNombre = new JTextField();
        add(txtNombre);

        JPanel panelBotones = new JPanel();
        JButton btnSiguiente = new JButton("Siguiente");
        JButton btnSalir = new JButton("Salir");

        panelBotones.add(btnSiguiente);
        panelBotones.add(btnSalir);
        add(panelBotones);

        btnSalir.addActionListener(e -> System.exit(0));

        btnSiguiente.addActionListener(e -> {
            String nombre = txtNombre.getText().trim();
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes escribir un nombre.");
            } else {
                new Principal(this, nombre);
                setVisible(false);
            }
        });

        setVisible(true);
    }
}