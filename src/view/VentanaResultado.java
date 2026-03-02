package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaResultado extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnRepetir, btnSalir;
	private JLabel lblSaludo;
	private JLabel lblAciertos;
	private Image imagenFondo = new ImageIcon("C:\\Users\\ASUS\\git\\JuegoConAritz\\fotoFondo.png").getImage();

	public VentanaResultado(String nombre, int aciertos) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ASUS\\git\\JuegoConAritz\\53283.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);

		contentPane = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
			}
		};

		contentPane.setLayout(null);
		setContentPane(contentPane);

		lblSaludo = new JLabel("¡Buen partido, " + nombre + "!");
		lblSaludo.setBounds(148, 40, 250, 20);
		contentPane.add(lblSaludo);

		lblAciertos = new JLabel("Has acertado " + aciertos + " de 3 preguntas.");
		lblAciertos.setBounds(148, 80, 250, 20);
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
		VentanaInicio v;
		if (o == btnSalir) {
			System.exit(0);
		}

		if (o == btnRepetir) {
			v = new VentanaInicio();
			v.setVisible(true);
			dispose();
		}
	}
}