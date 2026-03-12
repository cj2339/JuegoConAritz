package view;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;

public class VentanaInicio extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JButton btnSiguiente;
	private JButton btnSalir;
	private JLabel lblTitulo;
	private JLabel lblNombre;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio frame = new VentanaInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaInicio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("53283.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 250);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		lblTitulo = new JLabel("Bienvenido al Test de Fútbol");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(120, 20, 250, 20);
		contentPane.add(lblTitulo);

		lblNombre = new JLabel("Introduce tu nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombre.setBounds(27, 77, 190, 20);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(200, 80, 150, 20);
		contentPane.add(txtNombre);

		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSiguiente.setBounds(100, 150, 100, 25);
		btnSiguiente.addActionListener(this);
		contentPane.add(btnSiguiente);

		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSalir.setBounds(250, 150, 100, 25);
		btnSalir.addActionListener(this);
		contentPane.add(btnSalir);
	}


	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		String nombre;
		VentanaPregunta1 v1;

		if (o == btnSalir) {
			System.exit(0);
		}

		if (o == btnSiguiente) {
			nombre = txtNombre.getText();

			if (nombre.equals("")) {
				JOptionPane.showMessageDialog(this, "Debes escribir un nombre.");
			} else {
				v1 = new VentanaPregunta1(nombre);
				v1.setVisible(true);
				dispose();
			}
		}
	}
}