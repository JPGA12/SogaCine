package co.edu.uptc.presentacion.GUI;

import co.edu.uptc.logica.control.Cine;
import co.edu.uptc.utilidades.TextPrompt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameIngreso extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel mensaje;
    private JTextField cajaDeTexto;
    private JButton ingresar, volver;
    private JTextField correoU;
    private JPasswordField contraseñaU;
    private JLabel ingreso;
    private JLabel incorrecto;


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


    private void  colocarLabelIngreso(){
        ingreso = new JLabel();
        ingreso.setText("INGRESANDO");
        ingreso.setBounds(145, 350, 130, 30);
        ingreso.setFont(new Font("arial", Font.BOLD, 15));
        ingreso.setForeground(Color.GREEN);
        panel.add(ingreso);
    }


    private void colocarLabelIncorrecto(){
        incorrecto = new JLabel();
        incorrecto.setText("DATOS INCORRECTOS");
        incorrecto.setForeground(Color.RED);
        incorrecto.setBounds(110, 350, 180, 30);
        incorrecto.setFont(new Font("arial", Font.BOLD, 15));
        panel.add(incorrecto);
    }


    private void colocarBotones() {
        ingresar = new JButton();
        ingresar.setText("INGRESAR");
        ingresar.setFont(new Font("arial", Font.BOLD, 10));
        ingresar.setBounds(130, 370, 130, 30);
        panel.add(ingresar);

        volver = new JButton();
        volver.setText("VOLVER");
        volver.setFont(new Font("arial", Font.BOLD, 10));
        volver.setBounds(250, 500, 90, 30);
        panel.add(volver);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
    if (evento.getSource()==ingresar){
        Cine cine = new Cine();
        System.out.println("Ingresando");
        verificarCorreo();
        verificarContraseña();


    }
    }
    private void verificarCorreo(){
        String correo = correoU.getText();


        if (correo.isEmpty()){
            System.err.println("Por favor escribe el correo: ");
            colocarLabelIncorrecto();
        }
        else {
            Cine cine  = new Cine();
            cine.VerificacionEmail(correo);
        }

        }
        private void verificarContraseña(){
        String contraseña = contraseñaU.getText();

        if(contraseña.isEmpty()){
            System.out.println("Por favor escribe la contraseña");
            colocarLabelIncorrecto();
        }
        else {
            Cine cine = new Cine();
            cine.VerificacionContra(contraseña);
        }
        }
    }

