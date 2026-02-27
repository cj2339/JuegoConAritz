package view;

import javax.swing.*;
import java.awt.*;

public class VentanaResultado extends JDialog {

    private static final long serialVersionUID = 1L;

    public VentanaResultado(JDialog parent, String nombre, int aciertos) {
        super(parent, "Resultados del Test", true);

        setSize(350, 250);
        setLocationRelativeTo(parent);
        setLayout(new GridLayout(4, 1));

        add(new JLabel("¡Buen partido, " + nombre + "!", SwingConstants.CENTER));
        add(new JLabel("Has acertado " + aciertos + " de 3 preguntas.", SwingConstants.CENTER));

        JLabel imagen = new JLabel("", SwingConstants.CENTER);

        if (aciertos == 3) {
            imagen.setText("🏆 ¡Crack total! Nivel Champions.");
        } else if (aciertos == 2) {
            imagen.setText("⚽ ¡Muy bien! Nivel Europa League.");
        } else {
            imagen.setText("🥲 Toca entrenar un poco más...");
        }

        add(imagen);

        JPanel panelBotones = new JPanel();
        JButton btnRepetir = new JButton("Repetir");
        JButton btnSalir = new JButton("Salir");

        panelBotones.add(btnRepetir);
        panelBotones.add(btnSalir);
        add(panelBotones);

        btnRepetir.addActionListener(e -> {
            new VentanaInicio();
            dispose();
        });

        btnSalir.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}