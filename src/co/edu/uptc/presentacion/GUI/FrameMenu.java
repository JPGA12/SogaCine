package co.edu.uptc.presentacion.GUI;

import co.edu.uptc.presentacion.Menu;
import co.edu.uptc.utilidades.TextPrompt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameMenu extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel mensaje;
    private JTextField cajaDeTexto;
    private JButton boton;
    private JLabel ingreso;
    private JLabel incorrecto;

    public FrameMenu(){
        setSize(400, 650);
        setTitle("SogaCine");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void iniciarComponentes() {
        colocarPaneles();
        colocarEtiqueta();
        colocarBotones();

    }
    private void colocarPaneles() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.darkGray);
        this.getContentPane().add(panel);

    }
    private void colocarEtiqueta() {

        JLabel iconLogo = new JLabel(new ImageIcon("imagenes/LogoSoga.png"));
        iconLogo.setBounds(20, 40, 350, 100);
        panel.add(iconLogo);

    }

    private void colocarBotones() {
        boton = new JButton();
        boton.setText("CARTELERA");
        boton.setFont(new Font("arial", Font.BOLD, 25));
        boton.setBounds(90, 200, 200, 60);
        panel.add(boton);

        boton = new JButton();
        boton.setText("COMBOS");
        boton.setFont(new Font("arial", Font.BOLD, 25));
        boton.setBounds(90, 270, 200, 60);
        panel.add(boton);

        boton = new JButton();
        boton.setText("PRÓXIMOS ESTRENOS");
        boton.setFont(new Font("arial", Font.BOLD, 14));
        boton.setBounds(90, 340, 200, 60);
        panel.add(boton);


        boton = new JButton();
        boton.setText("VOLVER");
        boton.setFont(new Font("arial", Font.BOLD, 10));
        boton.setBounds(250, 500, 90, 30);
        panel.add(boton);
        ActionListener inicioSesion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                co.edu.uptc.presentacion.Menu menu = new Menu();
//                menu.frameInicio();
            }
        };
        boton.addActionListener(inicioSesion);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
