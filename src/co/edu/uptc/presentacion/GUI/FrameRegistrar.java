package co.edu.uptc.presentacion.GUI;

import co.edu.uptc.logica.control.Cine;
import co.edu.uptc.utilidades.TextPrompt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameRegistrar extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextField nombreU, apellidoU,correoU,telefonoU;
    private JPasswordField contraseñaU;
    private JButton registrar;

    private Cine cine;


    public FrameRegistrar() {
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

    public void colocarEtiqueta() {

        JLabel iconLogo = new JLabel(new ImageIcon("imagenes/LogoSoga.png"));
        iconLogo.setBounds(20, 40, 350, 100);
        panel.add(iconLogo);

        //Datos de ususario
        nombreU = new JTextField();
        nombreU.setBounds(70, 200, 280, 40);
        nombreU.setFont(new Font("arial", Font.ITALIC, 15));
        panel.add(nombreU);
        JLabel nombre = new JLabel();
        nombre = new TextPrompt("Nombre", nombreU);

        JLabel iconoContacto = new JLabel(new ImageIcon("imagenes/IconPersona.png"));
        iconoContacto.setBounds(30, 200, 40, 40);
        panel.add(iconoContacto);

        apellidoU = new JTextField();
        apellidoU.setBounds(70, 250, 280, 40);
        apellidoU.setFont(new Font("arial", Font.ITALIC, 15));
        panel.add(apellidoU);
        JLabel apellido = new JLabel();
        nombre = new TextPrompt("Apellido", apellidoU);

        JLabel iconoContactoA = new JLabel(new ImageIcon("imagenes/IconPersona.png"));
        iconoContactoA.setBounds(30, 250, 40, 40);
        panel.add(iconoContactoA);

        correoU = new JTextField();
        correoU.setBounds(70, 300, 280, 40);
        correoU.setFont(new Font("arial", Font.ITALIC, 15));
        panel.add(correoU);
        JLabel correo = new JLabel();
        correo = new TextPrompt("Email", correoU);

        JLabel iconoEmail = new JLabel(new ImageIcon("imagenes/IconEmail.png"));
        iconoEmail.setBounds(30, 300, 40, 40);
        panel.add(iconoEmail);

        contraseñaU = new JPasswordField();
        contraseñaU.setBounds(70, 350, 280, 40);
        contraseñaU.setFont(new Font("arial", Font.ITALIC, 15));
        panel.add(contraseñaU);
        JLabel contraseña = new JLabel();
        contraseña = new TextPrompt("Contraseña", contraseñaU);

        JLabel ContraseñaIcon = new JLabel(new ImageIcon("imagenes/IconPassword.png"));
        ContraseñaIcon.setBounds(30, 350, 40, 40);
        panel.add(ContraseñaIcon);

        telefonoU = new JTextField();
        telefonoU.setBounds(70, 400, 280, 40);
        telefonoU.setFont(new Font("arial", Font.ITALIC, 15));
        panel.add(telefonoU);
        JLabel telefono = new JLabel();
        telefono = new TextPrompt("Telefono", telefonoU);

        JLabel telefonoIcon = new JLabel(new ImageIcon("imagenes/PhoneIcon.png"));
        telefonoIcon.setBounds(30, 400, 40, 40);
        panel.add(telefonoIcon);

        //Botones de Usuario

        registrar = new JButton();
        registrar.setText("REGISTRAR");
        registrar.setFont(new Font("arial", Font.BOLD, 10));
        registrar.setBounds(125, 480, 150, 45);
        registrar.addActionListener(this);
        panel.add(registrar);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() ==registrar){
            System.out.println("HOLA");
        agregarUsuario();
        }
    }

    private void agregarUsuario() {
        String nombre = nombreU.getText();
        String apellido = apellidoU.getText();
        String correo = correoU.getText();
        String contraseña = contraseñaU.getText();
        String telefono = telefonoU.getText();

        if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || contraseña.isEmpty() || contraseña.isEmpty() || telefono.isEmpty()) {
            System.err.println("Por favor llene todos los campos");
        } else {
            cine = new Cine();
            cine.CrearPersona(apellido, nombre, telefono, correo, contraseña);
            nombreU.setText("");
            apellidoU.setText("");
            correoU.setText("");
            contraseñaU.setText("");
            telefonoU.setText("");
            System.out.println("Se registró correctamente");
        }
    }
}
