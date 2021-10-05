package co.edu.uptc.presentacion.GUI;

import co.edu.uptc.logica.control.Cine;
import co.edu.uptc.utilidades.TextPrompt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameIngreso extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton ingresar, volver;
    private JTextField correoU;
    private JPasswordField contraseñaU;

    public FrameIngreso(){
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

        correoU = new JTextField();
        correoU.setBounds(68, 220, 280, 35);
        correoU.setFont(new Font("arial", Font.ITALIC, 15));
        panel.add(correoU);
        JLabel nombre = new JLabel();
        nombre = new TextPrompt("Correo", correoU);

        JLabel iconoContacto = new JLabel(new ImageIcon("imagenes/IconEmail.png"));
        iconoContacto.setBounds(25, 220, 48, 35);
        panel.add(iconoContacto);

        contraseñaU = new JPasswordField();
        contraseñaU.setBounds(68, 295, 280, 35);
        contraseñaU.setFont(new Font("arial", Font.ITALIC, 15));
        panel.add(contraseñaU);
        JLabel contraseña = new JLabel();
        contraseña = new TextPrompt("Contraseña", contraseñaU);

        JLabel iconoContraseña = new JLabel(new ImageIcon("imagenes/IconPassword.png"));
        iconoContraseña.setBounds(25, 295, 48, 35);
        panel.add(iconoContraseña);

    }

    private void colocarBotones() {
        ingresar = new JButton();
        ingresar.setText("INGRESAR");
        ingresar.setFont(new Font("arial", Font.BOLD, 10));
        ingresar.setBounds(130, 370, 130, 30);
        ingresar.addActionListener(this);
        panel.add(ingresar);

        volver = new JButton();
        volver.setText("VOLVER");
        volver.setFont(new Font("arial", Font.BOLD, 10));
        volver.setBounds(250, 500, 90, 30);
        volver.addActionListener(this);
        panel.add(volver);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource()==ingresar){
            Cine cine = new Cine();
            String correo = correoU.getText();
            String contraseña = contraseñaU.getText();
            if (correo.isEmpty() || contraseña.isEmpty()){
                System.err.println("Por favor llene todos los campos");
            }
            else {
                if(cine.VerificacionEmail(correo)!= null){
                    if (cine.VerificacionContra(contraseña)!=null){
                        System.out.println("\n==== BIENVENIDO ====");
                        System.out.println("Ingresando");
                        FrameMenu frameMenu = new FrameMenu();
                        frameMenu.setVisible(true);
                        dispose();

                    }else {
                        System.err.println("Error: Contraseña Incorrecta");
                    }
                }else {
                    System.err.println("Error: Cuenta no encontrada");
                }
            }
        }
        if (evento.getSource()==volver){
            FrameInicio frameInicio = new FrameInicio();
            frameInicio.setVisible(true);
            dispose();
            System.out.println("Volviendo");
        }
    }
}

