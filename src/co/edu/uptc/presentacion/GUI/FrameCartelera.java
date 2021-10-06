package co.edu.uptc.presentacion.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameCartelera extends JFrame implements ActionListener{

    private JPanel panel;
    private JButton Boton1, Boton2, Boton3, Boton4, volver;

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
        iconLogo.setBounds(20, 5, 350, 100);
        panel.add(iconLogo);

        JLabel titulo = new JLabel();
        titulo.setBounds(20, 75, 350, 100);
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CARTELERA");
        titulo.setFont(new Font("Tahoma", Font.BOLD, 30));
        titulo.setForeground(Color.WHITE);
        panel.add(titulo);

        Boton1 = new JButton();
        Boton1.setBounds(40,155,150,200);
        ImageIcon icon1 = new ImageIcon("imagenes/1.jpg");
        Boton1.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(Boton1.getWidth(), Boton1.getHeight(),Image.SCALE_SMOOTH)));
        Boton1.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2, true));
        Boton1.addActionListener(this);
        panel.add(Boton1);

        Boton2 = new JButton();
        Boton2.setBounds(200,155,150,200);
            ImageIcon icon2 = new ImageIcon("imagenes/2.jpg");
        Boton2.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(Boton2.getWidth(), Boton2.getHeight(),Image.SCALE_SMOOTH)));
        Boton2.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2, true));
        Boton2.addActionListener(this);
        panel.add(Boton2);

        Boton3 = new JButton();
        Boton3.setBounds(40,365,150,200);
        ImageIcon icon3 = new ImageIcon("imagenes/3.jpg");
        Boton3.setIcon(new ImageIcon(icon3.getImage().getScaledInstance(Boton3.getWidth(), Boton3.getHeight(),Image.SCALE_SMOOTH)));
        Boton3.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2, true));
        Boton3.addActionListener(this);
        panel.add(Boton3);

        Boton4 = new JButton();
        Boton4.setBounds(200,365,150,200);
        ImageIcon icon4 = new ImageIcon("imagenes/4.jpg");
        Boton4.setIcon(new ImageIcon(icon4.getImage().getScaledInstance(Boton4.getWidth(), Boton4.getHeight(),Image.SCALE_SMOOTH)));
        Boton4.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2, true));
        Boton4.addActionListener(this);
        panel.add(Boton4);

        volver = new JButton();
        volver.setText("VOLVER");
        volver.setFont(new Font("arial", Font.BOLD, 10));
        volver.setBounds(20, 572, 350, 30);
        volver.addActionListener(this);
        panel.add(volver);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Boton1){
            System.out.println("BOTON1");
            FrameDescripcionPelicula frameDescripcionPelicula = new FrameDescripcionPelicula();
            frameDescripcionPelicula.pelicula1(0);
            //frameDescripcionPelicula.mostrarInfoPelicula(1);
            frameDescripcionPelicula.setVisible(true);
            dispose();
        }
        if (e.getSource()==Boton2){
            System.out.println("Boton2");
            FrameDescripcionPelicula frameDescripcionPelicula = new FrameDescripcionPelicula();
            frameDescripcionPelicula.pelicula1(1);
            //frameDescripcionPelicula.mostrarInfoPelicula(2);
            frameDescripcionPelicula.setVisible(true);
            dispose();
        }
        if (e.getSource()==Boton3){
            System.out.println("Boton3");
            FrameDescripcionPelicula frameDescripcionPelicula = new FrameDescripcionPelicula();
            frameDescripcionPelicula.pelicula1(2);
            //frameDescripcionPelicula.mostrarInfoPelicula(3);
            frameDescripcionPelicula.setVisible(true);
            dispose();
        }
        if (e.getSource()==Boton4){
            System.out.println("Boton4");
            System.out.println("Boton3");
            FrameDescripcionPelicula frameDescripcionPelicula = new FrameDescripcionPelicula();
            frameDescripcionPelicula.pelicula1(3);
            //frameDescripcionPelicula.mostrarInfoPelicula(4);
            frameDescripcionPelicula.setVisible(true);
            dispose();
        }
        if (e.getSource()==volver){
            FrameMenu frameMenu = new FrameMenu();
            frameMenu.setVisible(true);
            dispose();
        }
    }
}
