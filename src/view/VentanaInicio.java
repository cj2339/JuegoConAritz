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

            // Imagen de fondo
            JLabel fondo = new JLabel(new ImageIcon("ruta/miFondo.jpg"));
            setContentPane(fondo);
            fondo.setLayout(new GridLayout(3, 1)); // Mantienes tu layout

            JLabel lbl = new JLabel("Introduce tu nombre o nick:", SwingConstants.CENTER);
            lbl.setForeground(Color.WHITE); // Para que se vea sobre la imagen
            fondo.add(lbl);

            txtNombre = new JTextField();
            fondo.add(txtNombre);

            JPanel panelBotones = new JPanel();
            panelBotones.setOpaque(false); // Para que no tape el fondo
            JButton btnSiguiente = new JButton("Siguiente");
            JButton btnSalir = new JButton("Salir");

            panelBotones.add(btnSiguiente);
            panelBotones.add(btnSalir);
            fondo.add(panelBotones);

            setVisible(true);
        }
    
}