package co.edu.uptc.presentacion.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FrameDecripcionPelicula extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton silla, agregar, volver;
    private JLabel Titulo, Genero, Director, Año, Duracion;
    private ArrayList<JButton> sillas;

    public FrameDecripcionPelicula() {
        setSize(400, 650);
        setTitle("SogaCine");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

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

    public void pelicula1() {
        colocarPaneles();
        colocarEtiqueta();
        String titulo = "uno";
        String genero;
        String director;
        String año;
        String duracion;


        Titulo = new JLabel("Titulo: "+titulo);
        Titulo.setBounds(20,60,50,20);
        panel.add(Titulo);




    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
