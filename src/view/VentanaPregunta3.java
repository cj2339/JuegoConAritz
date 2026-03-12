package view;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;

public class VentanaPregunta3 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JCheckBox cb1, cb2, cb3;
    private JButton btnFinalizar;
    private String nombre;
    private int aciertosPrevios;
    private JLabel lblPregunta;

    public VentanaPregunta3(String nombre, int aciertosPrevios) {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("53283.png"));
        this.nombre = nombre;
        this.aciertosPrevios = aciertosPrevios;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 250);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 128, 0));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        lblPregunta = new JLabel("3. ¿Cuáles son equipos históricos?");
        lblPregunta.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblPregunta.setBounds(86, 20, 300, 20);
        contentPane.add(lblPregunta);

        cb1 = new JCheckBox("Real Madrid");
        cb1.setFont(new Font("Tahoma", Font.BOLD, 10));
        cb1.setBounds(50, 70, 150, 20);
        contentPane.add(cb1);

        cb2 = new JCheckBox("Manchester City");
        cb2.setFont(new Font("Tahoma", Font.BOLD, 10));
        cb2.setBounds(50, 100, 150, 20);
        contentPane.add(cb2);

        cb3 = new JCheckBox("FC Barcelona");
        cb3.setFont(new Font("Tahoma", Font.BOLD, 10));
        cb3.setBounds(50, 130, 150, 20);
        contentPane.add(cb3);

        btnFinalizar = new JButton("Finalizar");
        btnFinalizar.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnFinalizar.setBounds(300, 150, 100, 25);
        btnFinalizar.addActionListener(this);
        contentPane.add(btnFinalizar);
    }

    public void actionPerformed(ActionEvent e) {
        int aciertos = aciertosPrevios;
        VentanaResultado vr;
        	
        if (cb1.isSelected() && cb3.isSelected() && !cb2.isSelected()) {
            aciertos++;
        }

        vr = new VentanaResultado(nombre, aciertos);
        vr.setVisible(true);
        dispose();
    }
}