package view;

import javax.swing.*;
import java.awt.event.*;

public class VentanaPregunta3 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JCheckBox cb1, cb2, cb3;
    private JButton btnFinalizar;
    private String nombre;
    private int aciertosPrevios;

    public VentanaPregunta3(String nombre, int aciertosPrevios) {
        this.nombre = nombre;
        this.aciertosPrevios = aciertosPrevios;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 250);

        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblPregunta = new JLabel("3. ¿Cuáles son equipos históricos?");
        lblPregunta.setBounds(100, 20, 300, 20);
        contentPane.add(lblPregunta);

        cb1 = new JCheckBox("Real Madrid");
        cb1.setBounds(50, 70, 150, 20);
        contentPane.add(cb1);

        cb2 = new JCheckBox("Manchester City");
        cb2.setBounds(50, 100, 150, 20);
        contentPane.add(cb2);

        cb3 = new JCheckBox("FC Barcelona");
        cb3.setBounds(50, 130, 150, 20);
        contentPane.add(cb3);

        btnFinalizar = new JButton("Finalizar");
        btnFinalizar.setBounds(300, 150, 100, 25);
        btnFinalizar.addActionListener(this);
        contentPane.add(btnFinalizar);
    }

    public void actionPerformed(ActionEvent e) {
        int aciertos = aciertosPrevios;

        if (cb1.isSelected() && cb3.isSelected() && !cb2.isSelected()) {
            aciertos++;
        }

        VentanaResultado vr = new VentanaResultado(nombre, aciertos);
        vr.setVisible(true);
        dispose();
    }
}