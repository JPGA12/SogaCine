package co.edu.uptc.presentacion.GUI;

import co.edu.uptc.logica.control.Cine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameReciboCombos extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton ingresar, volver;
    Cine cine = new Cine();

    public FrameReciboCombos() {
        setSize(400, 650);
        setTitle("SogaCine");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void recibo(int indice) {
        colocarPaneles();
        colocarEtiqueta();
        EtiquetaComprador(indice);
    }

    private void colocarPaneles() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.darkGray);
        this.getContentPane().add(panel);
    }

    private void colocarEtiqueta() {
        JLabel iconLogo = new JLabel(new ImageIcon("imagenes/LogoSoga.png"));
        iconLogo.setBounds(20, 20, 350, 100);
        panel.add(iconLogo);

        JLabel titulo = new JLabel();
        titulo.setBounds(20, 130, 350, 35);
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("-----------RECIBO-----------");
        titulo.setFont(new Font("Tahoma", Font.BOLD, 25));
        titulo.setForeground(Color.WHITE);
        panel.add(titulo);


    }
    private void EtiquetaComprador(int indice){

        JLabel nombre = new JLabel();
        nombre.setBounds(20, 170, 350, 35);
        nombre.setText("Nombre del combo:");
        nombre.setFont(new Font("Tahoma", Font.BOLD, 20));
        nombre.setForeground(Color.WHITE);
        panel.add(nombre);
        JLabel nombreU = new JLabel();
        nombreU.setBounds(20, 200, 350, 35);

        nombreU.setText(cine.getListaPersonas().get(indice).getNombre());
        nombreU.setFont(new Font("Tahoma", Font.BOLD, 20));
        nombreU.setForeground(Color.WHITE);
        panel.add(nombreU);

        JLabel telefono = new JLabel();
        telefono.setBounds(20, 230, 350, 35);
        telefono.setText("Numero del comprador:");
        telefono.setFont(new Font("Tahoma", Font.BOLD, 20));
        telefono.setForeground(Color.WHITE);
        panel.add(telefono);
        JLabel telefonoU = new JLabel();
        telefonoU.setBounds(20, 260, 350, 35);
        telefonoU.setText(cine.getListaPersonas().get(indice).getTelefono());
        telefonoU.setFont(new Font("Tahoma", Font.BOLD, 20));
        telefonoU.setForeground(Color.WHITE);
        panel.add(telefonoU);

        JLabel sillas = new JLabel();
        sillas.setBounds(20, 290, 350, 35);
        sillas.setText("Sillas compradas:");
        sillas.setFont(new Font("Tahoma", Font.BOLD, 20));
        sillas.setForeground(Color.WHITE);
        panel.add(sillas);
        JLabel sillasU = new JLabel();
        sillasU.setBounds(20, 320, 350, 35);
        sillasU.setText("sillas");
//        sillasU.setText();
        sillasU.setFont(new Font("Tahoma", Font.BOLD, 20));
        sillasU.setForeground(Color.WHITE);
        panel.add(sillasU);

        JLabel fecha = new JLabel();
        fecha.setBounds(20, 350, 350, 35);
        fecha.setText("Fecha de la comra:");
        fecha.setFont(new Font("Tahoma", Font.BOLD, 20));
        fecha.setForeground(Color.WHITE);
        panel.add(fecha);
        JLabel fechaU = new JLabel();
        fechaU.setBounds(20, 380, 350, 35);
        fechaU.setText("DIa");
//        fechaU.setText();
        fechaU.setFont(new Font("Tahoma", Font.BOLD, 20));
        fechaU.setForeground(Color.WHITE);
        panel.add(fechaU);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
