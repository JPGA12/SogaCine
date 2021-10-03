package co.edu.uptc.presentacion.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameCartelera extends JFrame {

    private JPanel panel;
    private JLabel mensaje;

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

        JButton Peli1 = new JButton();
        Peli1.setBounds(20,300,150,200);
        //ImageIcon icon = new ImageIcon("Peli1.png");
        //Peli1.setIcon(new ImageIcon(icon.getImage().getScaledInstance(Peli1.getWidth(),Peli1.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(Peli1);
    }
}
