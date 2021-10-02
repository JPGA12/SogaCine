package co.edu.uptc.presentacion;

import co.edu.uptc.utilidades.TextPrompt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameRegistrar extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel mensaje;
    private JTextField cajaDeTexto;
    private JPasswordField passwordField;
    private TextPrompt textPrompt;


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

        //Datos de ususario
        JTextField nombreU = new JTextField();
        nombreU.setBounds(68, 50, 280, 35);
        nombreU.setFont(new Font("arial", Font.ITALIC, 15));
        panel.add(nombreU);
        JLabel nombre = new JLabel();
        nombre = new TextPrompt("Nombre", nombreU);

        JLabel iconoContacto = new JLabel(new ImageIcon("imagenes/contactoIcon.png"));
        iconoContacto.setBounds(22, 53, 48, 30);
        panel.add(iconoContacto);


        JTextField apellidoU = new JTextField();
        apellidoU.setBounds(68, 105, 280, 35);
        apellidoU.setFont(new Font("arial", Font.ITALIC, 15));
        panel.add(apellidoU);
        JLabel apellido = new JLabel();
        nombre = new TextPrompt("Apellido", apellidoU);

        JLabel iconoContactoA = new JLabel(new ImageIcon("imagenes/contactoIcon.png"));
        iconoContactoA.setBounds(22, 108, 48, 30);
        panel.add(iconoContactoA);


        JTextField correoU = new JTextField();
        correoU.setBounds(68, 160, 280, 35);
        correoU.setFont(new Font("arial", Font.ITALIC, 15));
        panel.add(correoU);
        JLabel correo = new JLabel();
        correo = new TextPrompt("Email", correoU);

        JLabel iconoEmail = new JLabel(new ImageIcon("imagenes/correoIcon.png"));
        iconoEmail.setBounds(25, 160, 48, 30);
        panel.add(iconoEmail);


        JPasswordField contraseñaU = new JPasswordField();
        contraseñaU.setBounds(68, 215, 280, 35);
        contraseñaU.setFont(new Font("arial", Font.ITALIC, 15));
        panel.add(contraseñaU);
        JLabel contraseña = new JLabel();
        contraseña = new TextPrompt("Contraseña", contraseñaU);

        JTextField telefonoU = new JTextField();
        telefonoU.setBounds(68, 270, 280, 35);
        telefonoU.setFont(new Font("arial", Font.ITALIC, 15));
        panel.add(telefonoU);
        JLabel telefono = new JLabel();
        telefono = new TextPrompt("Telefono", telefonoU);

        JLabel telefonoIcon = new JLabel(new ImageIcon("imagenes/telefonoIcon.png"));
        telefonoIcon.setBounds(25, 268, 40, 40);
        panel.add(telefonoIcon);

        JLabel fechaDeNacimiento = new JLabel();
        fechaDeNacimiento.setText("FECHA DE NACIMIENTO: ");
        fechaDeNacimiento.setFont(new Font("arial", Font.ITALIC, 15));
        fechaDeNacimiento.setBounds(110, 325, 200, 30);
        panel.add(fechaDeNacimiento);

        JTextField fechaDeNacimientoU = new JTextField();
        fechaDeNacimientoU.setBounds(130, 360, 125, 30);
        fechaDeNacimientoU.setFont(new Font("arial", Font.ITALIC, 15));
        panel.add(fechaDeNacimientoU);
        JLabel dia = new JLabel();
        dia = new TextPrompt("DD/MM/AAAA", fechaDeNacimientoU);

        JComboBox jComboBox = new JComboBox();
        jComboBox.setBounds(68, 415, 200, 30);
        jComboBox.addItem("Hombre");
        jComboBox.addItem("Mujer");
        jComboBox.addItem("Otro");
        panel.add(jComboBox);
        final String[] sexoEnviar = new String[1];

        jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sexoEnviar[0] = jComboBox.getSelectedItem().toString();
            }
        });


        //Botones de Usuario

        JButton boton = new JButton();
        boton.setText("REGISTRAR");
        boton.setFont(new Font("arial", Font.BOLD, 10));
        boton.setBounds(50, 500, 120, 30);
        panel.add(boton);
        ActionListener registrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = nombreU.getText();
                String apellido = apellidoU.getText();
                String correo = correoU.getText();
                String contraseña = contraseñaU.getText();
                String telefono = telefonoU.getText();
                String fechaDeNacimiento = fechaDeNacimientoU.getText();
                String sexo = sexoEnviar[0];

                if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() ||
                        contraseña.isEmpty() || contraseña.isEmpty() || telefono.isEmpty() || fechaDeNacimiento.isEmpty()) {
                    System.err.println("Por favor llene todos los campos");
                } else {
                   /* operacionPersona.guardarpersona(nombre, apellido
                            , correo, contraseña, telefono, fechaDeNacimiento, sexo);
                    System.out.println("\033[32mSe registro correctamente el usuario: "+nombre);*/

                }

            }
        };
        boton.addActionListener(registrar);


        boton = new JButton();
        boton.setText("REGRESAR");
        boton.setFont(new Font("arial", Font.BOLD, 10));
        boton.setBounds(220, 500, 120, 30);
        panel.add(boton);

        ActionListener regreso = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             /*   RunMicarroFacil run = new RunMicarroFacil();
                run.frameInicio();*/
            }
        };


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
