package co.edu.uptc.presentacion.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FrameSala extends JFrame implements ActionListener {
        private JPanel panel;
        private JButton silla, agregar, volver;
        private JLabel sala;
        private ArrayList<JButton> sillas;
        private ImageIcon iconV = new ImageIcon("imagenes/SillaV.png");
        private ImageIcon iconR = new ImageIcon("imagenes/SillaR.png");

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
        iconLogo.setBounds(20, 5, 350, 100);
        panel.add(iconLogo);

    }

    private void colocarBotones() {
        sillas = new ArrayList<JButton>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                silla = new JButton();
                silla.setBounds(60 + (55 * j), 200 + (55 * i), 50, 50);
                silla.setIcon(new ImageIcon(iconV.getImage().getScaledInstance(silla.getWidth(), silla.getHeight(),Image.SCALE_SMOOTH)));
                silla.setBackground(Color.darkGray);
                silla.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2, true));
                silla.addActionListener(this);
                sillas.add(silla);
            }
        }

        for (int i = 0; i < sillas.size(); i++) {
            panel.add(sillas.get(i));
        }

        JLabel sala = new JLabel(new ImageIcon("imagenes/Cine.png"));
        sala.setBounds(-5, 100, 400, 400);
        panel.add(sala);

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
                sillas.get(i).setIcon(new ImageIcon(iconR.getImage().getScaledInstance(silla.getWidth(), silla.getHeight(),Image.SCALE_SMOOTH)));
                sillas.get(i).setText("X");
            }
        }

        if (evento.getSource() == volver) {
            FrameCartelera frameCartelera = new FrameCartelera();
            frameCartelera.setVisible(true);
            dispose();
        }
        if (evento.getSource() == agregar) {
            for (int j = 0; j < sillas.size(); j++){
                if (sillas.get(j).getText()=="X"){
                    System.out.println(j);
                }
            }
        }
    }

}


