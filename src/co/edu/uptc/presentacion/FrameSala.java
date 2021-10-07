package co.edu.uptc.presentacion;

import co.edu.uptc.logica.control.Cine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FrameSala extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton silla, agregar, volver;
    private JLabel sala,seleccion;
    private ArrayList<JButton> sillas;
    private JComboBox Horario;
    private ImageIcon iconV = new ImageIcon("imagenes/SillaV.png");
    private ImageIcon iconR = new ImageIcon("imagenes/SillaR.png");
    Cine cine = new Cine();
    final String[] horario = new String[1];
    private String horarioU;
    int s[][] = new int[5][5];

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
    private void error(){
        seleccion= new JLabel();
        seleccion.setBounds(300, 504, 20, 30);
        seleccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccion.setText("*");
        seleccion.setFont(new Font("Tahoma", Font.BOLD, 30));
        seleccion.setForeground(Color.red);
        panel.add(seleccion);
        System.out.println("Holi");

    }

    private void colocarBotones() {
        sillas = new ArrayList<JButton>();

        //cine.aaa();


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                silla = new JButton();
                silla.setBounds(60 + (55 * j), 200 + (55 * i), 50, 50);
                silla.setIcon(new ImageIcon(iconV.getImage().getScaledInstance(silla.getWidth(), silla.getHeight(), Image.SCALE_SMOOTH)));
                silla.setBackground(Color.darkGray);
                silla.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2, true));
                silla.addActionListener(this);
                sillas.add(silla);
                s[i][j]=sillas.size();
            }
        }

        for (int i = 0; i < sillas.size(); i++) {
            panel.add(sillas.get(i));
        }

        JLabel sala = new JLabel(new ImageIcon("imagenes/Cine.png"));
        sala.setBounds(-5, 100, 400, 400);
        panel.add(sala);

        Horario =new JComboBox();
        Horario.setBounds(90, 500, 200, 30);
        Horario.addItem("Función");
        Horario.addItem("3:30 PM");
        Horario.addItem("5 PM");
        Horario.addItem("7 PM");

        panel.add(Horario);
        Horario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    horario[0]=Horario.getSelectedItem().toString();
            }
        });

        volver = new JButton();
        volver.setText("VOLVER");
        volver.setFont(new Font("arial", Font.BOLD, 10));
        volver.setBounds(220, 550, 90, 30);
        volver.addActionListener(this);
        panel.add(volver);

        agregar = new JButton();
        agregar.setText("AÑADIR");
        agregar.setFont(new Font("arial", Font.BOLD, 10));
        agregar.setBounds(80, 550, 90, 30);
        agregar.addActionListener(this);
        panel.add(agregar);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {

            for (int i = 0; i < sillas.size(); i++) {
                if (evento.getSource() == sillas.get(i)) {
                    sillas.get(i).setIcon(new ImageIcon(iconR.getImage().getScaledInstance(silla.getWidth(), silla.getHeight(), Image.SCALE_SMOOTH)));
                    sillas.get(i).setText("X");
                }
            }

        if (evento.getSource() == volver) {
            FrameCartelera frameCartelera = new FrameCartelera();
            frameCartelera.setVisible(true);
            dispose();
        }
        if (evento.getSource() == agregar) {
            horarioU = horario[0];
            FrameReciboBoletas frb = new FrameReciboBoletas();
            if (horarioU==null){
                setVisible(false);
                error();
                setVisible(true);
            }
            else {
                frb.setFuncion(horarioU);
                frb.recibo(cine.devolverIndice());
                frb.setVisible(true);
                dispose();

            }
        }
    }

    public ArrayList<JButton> getSillas() {
        return sillas;
    }



}


