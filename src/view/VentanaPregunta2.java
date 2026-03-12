package view;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;

public class VentanaPregunta2 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtEstadio;
    private JButton btnSiguiente;
    private String nombre;
    private int aciertosPrevios;
    private JLabel lblPregunta;
    

    public VentanaPregunta2(String nombre, int aciertosPrevios) {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("53283.png"));
        this.nombre = nombre;
        this.aciertosPrevios = aciertosPrevios;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 250);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 128, 0));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        lblPregunta = new JLabel("2. El estadio del Athletic Club es:");
        lblPregunta.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblPregunta.setBackground(new Color(255, 255, 255));
        lblPregunta.setBounds(93, 40, 300, 20);
        contentPane.add(lblPregunta);

        txtEstadio = new JTextField();
        txtEstadio.setBounds(150, 90, 150, 20);
        contentPane.add(txtEstadio);

        btnSiguiente = new JButton("Siguiente");
        btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnSiguiente.setBounds(300, 150, 100, 25);
        btnSiguiente.addActionListener(this);
        contentPane.add(btnSiguiente);
    }

    public void actionPerformed(ActionEvent e) {
        int aciertos = aciertosPrevios;
        VentanaPregunta3 v3;
        if (txtEstadio.getText().equalsIgnoreCase("San Mamés")) {
            aciertos++;
        }

        v3 = new VentanaPregunta3(nombre, aciertos);
        v3.setVisible(true);
        dispose();
    }
}