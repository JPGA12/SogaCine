package co.edu.uptc.presentacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameInicio extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton ingreso, registro;

    public FrameInicio(){
        setSize(400, 650);
        setTitle("SogaCine");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void iniciarComponentes() {
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
        ingreso = new JButton();
        ingreso.setText("INGRESAR");
        ingreso.setFont(new Font("arial", Font.BOLD, 25));
        ingreso.setBounds(90, 200, 200, 60);
        ingreso.addActionListener(this);
        panel.add(ingreso);

        registro = new JButton();
        registro.setText("REGISTRAR");
        registro.setFont(new Font("arial", Font.BOLD, 25));
        registro.setBounds(90, 270, 200, 60);
        registro.addActionListener(this);
        panel.add(registro);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==ingreso){
            FrameIngreso frameIngreso = new FrameIngreso();
            frameIngreso.setVisible(true);
            dispose();
            System.out.println("ingresandoooou");
        }
        if (e.getSource()==registro){
            FrameRegistrar frameRegistrar = new FrameRegistrar();
            frameRegistrar.setVisible(true);
            dispose();
            System.out.println("registrando al perro");
        }
    }
}
