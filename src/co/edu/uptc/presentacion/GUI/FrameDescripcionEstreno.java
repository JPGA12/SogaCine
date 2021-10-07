package co.edu.uptc.presentacion.GUI;

import co.edu.uptc.logica.control.Cine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FrameDescripcionEstreno extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton comprar, volver;
    private JLabel Titulo, Genero, Director, Año, Duracion;
    private ArrayList<JButton> sillas;
    private int indice;
    Cine cine = new Cine();

    public FrameDescripcionEstreno() {
        setSize(400, 650);
        setTitle("SogaCine");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void pelicula(int i) {
        colocarPaneles();
        colocarEtiqueta();
        EtiquetaPelicula1(i);
    }

    private void colocarPaneles() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.darkGray);
        this.getContentPane().add(panel);
    }

    private void colocarEtiqueta() {

        JLabel iconLogo = new JLabel(new ImageIcon("imagenes/LogoSoga.png"));
        iconLogo.setBounds(20, 10, 350, 100);
        panel.add(iconLogo);

    }

    private void EtiquetaPelicula1(int i) {

        JLabel iconLogo = new JLabel(new ImageIcon("imagenes/LogoSoga.png"));
        iconLogo.setBounds(20, 10, 350, 100);
        panel.add(iconLogo);

        JLabel iconoPelicula = new JLabel();
        iconoPelicula.setBounds(10, 150, 180, 250);
        ImageIcon peli1 = new ImageIcon("imagenes/proximos" +(i+1)+ ".jpg");
        iconoPelicula.setIcon(new ImageIcon(peli1.getImage().getScaledInstance(iconoPelicula.getWidth(), iconoPelicula.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(iconoPelicula);

        Titulo = new JLabel();
        Titulo.setBounds(200, 150, 100, 20);
        Titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        Titulo.setText("Titulo: ");
        Titulo.setForeground(Color.white);
        panel.add(Titulo);

        JLabel titulo = new JLabel();
        titulo.setBounds(200, 175, 100, 20);
        titulo.setFont(new Font("Tahoma", Font.BOLD, 15));
        titulo.setText(cine.getListaEstrenos().get(i).getTitulo());
        titulo.setForeground(Color.white);
        panel.add(titulo);

        Genero = new JLabel();
        Genero.setBounds(200, 200, 100, 20);
        Genero.setFont(new Font("Tahoma", Font.BOLD, 18));
        Genero.setText("Genero: ");
        Genero.setForeground(Color.white);
        panel.add(Genero);

        JLabel genero = new JLabel();
        genero.setBounds(200, 225, 200, 20);
        genero.setFont(new Font("Tahoma", Font.BOLD, 15));
        genero.setText(cine.getListaEstrenos().get(i).getGenero());
        genero.setForeground(Color.white);
        panel.add(genero);

        Director = new JLabel();
        Director.setBounds(200, 250, 100, 20);
        Director.setFont(new Font("Tahoma", Font.BOLD, 18));
        Director.setText("Director: ");
        Director.setForeground(Color.white);
        panel.add(Director);

        JLabel direcotr = new JLabel();
        direcotr.setBounds(200, 275, 200, 20);
        direcotr.setFont(new Font("Tahoma", Font.BOLD, 15));
        direcotr.setText(cine.getListaEstrenos().get(i).getDirector());
        direcotr.setForeground(Color.white);
        panel.add(direcotr);

        Año = new JLabel();
        Año.setBounds(200, 300, 199, 20);
        Año.setFont(new Font("Tahoma", Font.BOLD, 17));
        Año.setText("Se estrenara el: ");
        Año.setForeground(Color.white);
        panel.add(Año);

        JLabel año = new JLabel();
        año.setBounds(200, 325, 200, 20);
        año.setFont(new Font("Tahoma", Font.BOLD, 15));
        año.setText(cine.getListaEstrenos().get(i).getAño());
        año.setForeground(Color.white);
        panel.add(año);

        Duracion = new JLabel();
        Duracion.setBounds(200, 350, 100, 20);
        Duracion.setFont(new Font("Tahoma", Font.BOLD, 18));
        Duracion.setText("Duracion: ");
        Duracion.setForeground(Color.white);
        panel.add(Duracion);

        JLabel duracion = new JLabel();
        duracion.setBounds(200, 375, 200, 20);
        duracion.setFont(new Font("Tahoma", Font.BOLD, 15));
        duracion.setText(cine.getListaEstrenos().get(i).getDuracion());
        duracion.setForeground(Color.white);
        panel.add(duracion);

        volver = new JButton();
        volver.setText("VOLVER");
        volver.setFont(new Font("arial", Font.BOLD, 10));
        volver.setBounds(20, 500, 350, 30);
        volver.addActionListener(this);
        panel.add(volver);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==volver){
            FrameEstrenos frameEstrenos = new FrameEstrenos();
            frameEstrenos.setVisible(true);
            dispose();
        }

    }
}

