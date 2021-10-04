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
        iconLogo.setBounds(20, 20, 350, 100);
        panel.add(iconLogo);

        JLabel titulo = new JLabel();
        titulo.setBounds(20, 90, 350, 100);
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CARTELERA");
        titulo.setFont(new Font("Tahoma", Font.BOLD, 30));
        titulo.setForeground(Color.WHITE);
        panel.add(titulo);

        JButton Boton1 = new JButton();
        Boton1.setBounds(40,170,150,200);
        ImageIcon icon1 = new ImageIcon("imagenes/1.png");
        Boton1.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(Boton1.getWidth(), Boton1.getHeight(),Image.SCALE_SMOOTH)));
        Boton1.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2, true));
        panel.add(Boton1);

        JButton Boton2 = new JButton();
        Boton2.setBounds(200,170,150,200);
        ImageIcon icon2 = new ImageIcon("imagenes/2.jpg");
        Boton2.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(Boton2.getWidth(), Boton2.getHeight(),Image.SCALE_SMOOTH)));
        Boton2.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2, true));
        panel.add(Boton2);

        JButton Boton3 = new JButton();
        Boton3.setBounds(40,380,150,200);
        ImageIcon icon3 = new ImageIcon("imagenes/3.jpg");
        Boton3.setIcon(new ImageIcon(icon3.getImage().getScaledInstance(Boton3.getWidth(), Boton3.getHeight(),Image.SCALE_SMOOTH)));
        Boton3.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2, true));
        panel.add(Boton3);

        JButton Boton4 = new JButton();
        Boton4.setBounds(200,380,150,200);
        ImageIcon icon4 = new ImageIcon("imagenes/4.jpg");
        Boton4.setIcon(new ImageIcon(icon4.getImage().getScaledInstance(Boton4.getWidth(), Boton4.getHeight(),Image.SCALE_SMOOTH)));
        Boton4.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2, true));
        panel.add(Boton4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
