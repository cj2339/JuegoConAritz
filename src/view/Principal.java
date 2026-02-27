package view;

import javax.swing.*;
import java.awt.*;

public class Principal extends JDialog {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private JRadioButton r1, r2, r3;
    private JTextField txtEstadio;
    private JCheckBox cb1, cb2, cb3;

    public Principal(JFrame parent, String nombre) {
        super(parent, "Test de Fútbol", true);
        this.nombre = nombre;

        setSize(400, 350);
        setLocationRelativeTo(parent);
        setLayout(new GridLayout(6, 1));

        add(new JLabel("1. ¿Quién tiene más Balones de Oro?", SwingConstants.CENTER));
        r1 = new JRadioButton("Cristiano Ronaldo");
        r2 = new JRadioButton("Lionel Messi");
        r3 = new JRadioButton("Zidane");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(r1);
        grupo.add(r2);
        grupo.add(r3);

        JPanel p1 = new JPanel();
        p1.add(r1); p1.add(r2); p1.add(r3);
        add(p1);

        add(new JLabel("2. Completa: El estadio del Athletic Club es ______.", SwingConstants.CENTER));
        txtEstadio = new JTextField(10);
        JPanel p2 = new JPanel();
        p2.add(txtEstadio);
        add(p2);

        add(new JLabel("3. ¿Cuáles de estos son equipos históricos?", SwingConstants.CENTER));
        cb1 = new JCheckBox("Real Madrid");
        cb2 = new JCheckBox("Manchester City");
        cb3 = new JCheckBox("FC Barcelona");

        JPanel p3 = new JPanel();
        p3.add(cb1); p3.add(cb2); p3.add(cb3);
        add(p3);

        JButton btnComprobar = new JButton("Comprobar");
        add(btnComprobar);

        btnComprobar.addActionListener(e -> comprobar());

        setVisible(true);
    }

    private void comprobar() {
        int aciertos = 0;

        if (r2.isSelected()) aciertos++;
        if (txtEstadio.getText().equalsIgnoreCase("San Mamés")) aciertos++;
        if (cb1.isSelected() && cb3.isSelected() && !cb2.isSelected()) aciertos++;

        new VentanaResultado(this, nombre, aciertos);
        dispose();
    }
}