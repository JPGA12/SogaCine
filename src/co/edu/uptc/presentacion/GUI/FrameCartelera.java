package co.edu.uptc.presentacion.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameCartelera extends JFrame implements ActionListener{

    private JPanel panel;

    public FrameCartelera(){
        setSize(400, 650);
        setTitle("SogaCine");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiqueta();
    }
    private void colocarPaneles() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.darkGray);
        this.getContentPane().add(panel);
    }
    public void colocarEtiqueta(){
        JLabel iconLogo = new JLabel(new ImageIcon("imagenes/LogoSoga.png"));
        iconLogo.setBounds(20, 40, 350, 100);
        panel.add(iconLogo);

        JButton Boton1 = new JButton();
        Boton1.setBounds(40,170,150,200);
        ImageIcon icon1 = new ImageIcon("imagenes/1.png");
        Boton1.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(Boton1.getWidth(), Boton1.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(Boton1);

        JButton boton2 = new JButton();
        boton2.setBounds(200,170,150,200);
        ImageIcon icon2 = new ImageIcon("imagenes/2.jpg");
        boton2.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(boton2);

        JButton boton3 = new JButton();
        boton3.setBounds(40,380,150,200);
        ImageIcon icon3 = new ImageIcon("imagenes/3.jpg");
        boton3.setIcon(new ImageIcon(icon3.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(boton3);

        JButton boton4 = new JButton();
        boton4.setBounds(200,380,150,200);
        ImageIcon icon4 = new ImageIcon("imagenes/4.jpg");
        boton4.setIcon(new ImageIcon(icon4.getImage().getScaledInstance(boton4.getWidth(), boton4.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(boton4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
