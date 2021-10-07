package co.edu.uptc.presentacion;

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
        nombre.setFont(new Font("Tahoma", Font.BOLD, 20));
        nombre.setText("Nombre y Precio:");
        nombre.setForeground(Color.WHITE);
        panel.add(nombre);
        JLabel nombreU = new JLabel();
        nombreU.setBounds(20, 200, 350, 35);

        nombreU.setText(cine.getListaComidas().get(indice).getNombre()+": "+cine.getListaComidas().get(indice).getPrecio());
        nombreU.setFont(new Font("Tahoma", Font.BOLD, 15));
        nombreU.setForeground(Color.WHITE);
        panel.add(nombreU);

        JLabel  Bebida= new JLabel();
        Bebida.setBounds(20, 230, 350, 35);
        Bebida.setText("Bebida:");
        Bebida.setFont(new Font("Tahoma", Font.BOLD, 20));
        Bebida.setForeground(Color.WHITE);
        panel.add(Bebida);
        JLabel BebidaU = new JLabel();
        BebidaU.setBounds(20, 260, 350, 35);
        BebidaU.setText(cine.getListaComidas().get(indice).getComida());
        BebidaU.setFont(new Font("Tahoma", Font.BOLD, 15));
        BebidaU.setForeground(Color.WHITE);
        panel.add(BebidaU);

        JLabel comida = new JLabel();
        comida.setBounds(20, 290, 350, 35);
        comida.setText("Comida:");
        comida.setFont(new Font("Tahoma", Font.BOLD, 20));
        comida.setForeground(Color.WHITE);
        panel.add(comida);
        JLabel comidaU = new JLabel();
        comidaU.setBounds(20, 320, 350, 35);
        comidaU.setText(cine.getListaComidas().get(indice).getComida());
        comidaU.setFont(new Font("Tahoma", Font.BOLD, 15));
        comidaU.setForeground(Color.WHITE);
        panel.add(comidaU);

        JLabel snack = new JLabel();
        snack.setBounds(20, 350, 350, 35);
        snack.setText("Snacks:");
        snack.setFont(new Font("Tahoma", Font.BOLD, 20));
        snack.setForeground(Color.WHITE);
        panel.add(snack);
        JLabel snackU = new JLabel();
        snackU.setBounds(20, 380, 350, 35);
        snackU.setText(cine.getListaComidas().get(indice).getAperitivo());
        snackU.setFont(new Font("Tahoma", Font.BOLD, 15));
        snackU.setForeground(Color.WHITE);
        panel.add(snackU);

        JLabel codigo = new JLabel(new ImageIcon("imagenes/Barras.jpg"));
        codigo.setBounds(20, 425, 350, 125);
        panel.add(codigo);

        volver = new JButton();
        volver.setText("VOLVER");
        volver.setFont(new Font("arial", Font.BOLD, 10));
        volver.setBounds(220, 555, 90, 30);
        volver.addActionListener(this);
        panel.add(volver);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==volver){
            FrameCombos fc =new FrameCombos();
            fc.setVisible(true);
            dispose();
        }
    }

}
