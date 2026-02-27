package view;

import javax.swing.*;
import java.awt.event.*;

public class VentanaPregunta1 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JRadioButton r1, r2, r3;
    private JButton btnSiguiente;
    private ButtonGroup grupo;
    private String nombre;
    private VentanaPregunta2 v2;
    private JLabel lblPregunta;

    public VentanaPregunta1(String nombre) {
        this.nombre = nombre;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 250);

        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        lblPregunta = new JLabel("1. ¿Quién tiene más Balones de Oro?");
        lblPregunta.setBounds(100, 20, 300, 20);
        contentPane.add(lblPregunta);

        r1 = new JRadioButton("Cristiano Ronaldo");
        r1.setBounds(50, 70, 150, 20);
        contentPane.add(r1);

        r2 = new JRadioButton("Lionel Messi");
        r2.setBounds(50, 100, 150, 20);
        contentPane.add(r2);

        r3 = new JRadioButton("Zidane");
        r3.setBounds(50, 130, 150, 20);
        contentPane.add(r3);

        grupo = new ButtonGroup();
        grupo.add(r1);
        grupo.add(r2);
        grupo.add(r3);

        btnSiguiente = new JButton("Siguiente");
        btnSiguiente.setBounds(300, 150, 100, 25);
        btnSiguiente.addActionListener(this);
        contentPane.add(btnSiguiente);
    }

    public void actionPerformed(ActionEvent e) {
        int aciertos = 0;

        if (r2.isSelected()) {
            aciertos = 1;
        }

        v2 = new VentanaPregunta2(nombre, aciertos);
        v2.setVisible(true);
        dispose();
    }
}