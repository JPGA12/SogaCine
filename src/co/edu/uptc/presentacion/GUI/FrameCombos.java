package co.edu.uptc.presentacion.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameCombos extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton Boton1, Boton2, Boton3, volver;

    public FrameCombos(){
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
        Boton1.setBounds(45,155,300,110);
        ImageIcon icon1 = new ImageIcon("");
        Boton1.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(Boton1.getWidth(), Boton1.getHeight(),Image.SCALE_SMOOTH)));
        Boton1.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2, true));
        Boton1.addActionListener(this);
        panel.add(Boton1);

        Boton2 = new JButton();
        Boton2.setBounds(45,275,300,110);
        ImageIcon icon2 = new ImageIcon("");
        Boton2.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(Boton2.getWidth(), Boton2.getHeight(),Image.SCALE_SMOOTH)));
        Boton2.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2, true));
        Boton2.addActionListener(this);
        panel.add(Boton2);

        Boton3 = new JButton();
        Boton3.setBounds(45,395,300,110);
        ImageIcon icon3 = new ImageIcon("");
        Boton3.setIcon(new ImageIcon(icon3.getImage().getScaledInstance(Boton3.getWidth(), Boton3.getHeight(),Image.SCALE_SMOOTH)));
        Boton3.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2, true));
        Boton3.addActionListener(this);
        panel.add(Boton3);

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
        }
        if (e.getSource()==Boton2){
            System.out.println("Boton2");
        }
        if (e.getSource()==Boton3){
            System.out.println("Boton3");
        }
        if (e.getSource()==volver){
            FrameMenu frameMenu = new FrameMenu();
            frameMenu.setVisible(true);
            dispose();
        }
    }
}
