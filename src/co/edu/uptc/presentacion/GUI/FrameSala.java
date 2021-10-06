package co.edu.uptc.presentacion.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FrameSala extends JFrame implements ActionListener {
        private JPanel panel;
        private JButton silla, agregar, volver;
        private JLabel incorrecto;
        private ArrayList<JButton> sillas;

    public FrameSala() {
        setSize(400, 650);
        setTitle("SogaCine");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {
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
        sillas = new ArrayList<JButton>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                silla = new JButton();
                silla.setBackground(Color.green);
                silla.setBounds(60 + (55 * j), 200 + (55 * i), 50, 50);
                silla.addActionListener(this);
                sillas.add(silla);

            }
        }
        for (int i = 0; i < sillas.size(); i++) {
            panel.add(sillas.get(i));
        }

        /*for (int i = 0; i < 5; i++) {
            silla = new JButton();
            silla.setBackground(Color.GREEN);
            silla.setBounds(45*i,40,30,30);
            silla.addActionListener(this);
            sillas.add(silla);
        }
        for (int i = 0; i < sillas.size(); i++) {
            panel.add(sillas.get(i));
        }*/


        volver = new JButton();
        volver.setText("VOLVER");
        volver.setFont(new Font("arial", Font.BOLD, 10));
        volver.setBounds(220, 500, 90, 30);
        volver.addActionListener(this);
        panel.add(volver);


        agregar = new JButton();
        agregar.setText("AÑADIR");
        agregar.setFont(new Font("arial", Font.BOLD, 10));
        agregar.setBounds(80, 500, 90, 30);
        agregar.addActionListener(this);
        panel.add(agregar);

    }


    @Override
    public void actionPerformed(ActionEvent evento) {

        for (int i = 0; i < sillas.size(); i++) {

            if (evento.getSource() == sillas.get(i)) {
             /*   if (sillas.get(i).getBackground()==Color.red){
                    sillas.get(i).setBackground(Color.green);*/
                sillas.get(i).setBackground(Color.red);
            }
        }

        if (evento.getSource() == volver) {
            System.out.println("Volver");
        }
        if (evento.getSource() == agregar) {
            for (int i = 0; i < sillas.size(); i++) {
                if (sillas.get(i).getBackground() == Color.red) {
                    System.out.println("Sillas ocupadas: "+(i+1));
                }
            }
        }
    }

}


