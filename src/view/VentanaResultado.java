package view;

import javax.swing.*;
import java.awt.event.*;

public class VentanaResultado extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton btnRepetir, btnSalir;

    public VentanaResultado(String nombre, int aciertos) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 250);

        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblSaludo = new JLabel("¡Buen partido, " + nombre + "!");
        lblSaludo.setBounds(130, 40, 250, 20);
        contentPane.add(lblSaludo);

        JLabel lblAciertos = new JLabel("Has acertado " + aciertos + " de 3 preguntas.");
        lblAciertos.setBounds(130, 80, 250, 20);
        contentPane.add(lblAciertos);

        btnRepetir = new JButton("Repetir");
        btnRepetir.setBounds(100, 150, 100, 25);
        btnRepetir.addActionListener(this);
        contentPane.add(btnRepetir);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(250, 150, 100, 25);
        btnSalir.addActionListener(this);
        contentPane.add(btnSalir);
    }

    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();

        if (o == btnSalir) {
            System.exit(0);
        }

        if (o == btnRepetir) {
            VentanaInicio v = new VentanaInicio();
            v.setVisible(true);
            dispose();
        }
    }
}