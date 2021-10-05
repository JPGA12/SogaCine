package co.edu.uptc.presentacion.GUI;

import co.edu.uptc.presentacion.Menu;
import co.edu.uptc.utilidades.TextPrompt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameMenu extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton cartelera,combos,estrenos,volver;
    private JLabel ingreso;
    private JLabel incorrecto;

    public FrameMenu(){
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
        cartelera = new JButton();
        cartelera.setText("CARTELERA");
        cartelera.setFont(new Font("arial", Font.BOLD, 25));
        cartelera.setBounds(90, 200, 200, 60);
        cartelera.addActionListener(this);
        panel.add(cartelera);

        combos = new JButton();
        combos.setText("COMBOS");
        combos.setFont(new Font("arial", Font.BOLD, 25));
        combos.setBounds(90, 270, 200, 60);
        combos.addActionListener(this);
        panel.add(combos);

        estrenos = new JButton();
        estrenos.setText("PRÓXIMOS ESTRENOS");
        estrenos.setFont(new Font("arial", Font.BOLD, 14));
        estrenos.setBounds(90, 340, 200, 60);
        estrenos.addActionListener(this);
        panel.add(estrenos);


        volver = new JButton();
        volver.setText("VOLVER");
        volver.setFont(new Font("arial", Font.BOLD, 10));
        volver.setBounds(250, 500, 90, 30);
        volver.addActionListener(this);
        panel.add(volver);

    }
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource()==cartelera){
            dispose();
            FrameCartelera frameCartelera = new FrameCartelera();
            frameCartelera.setVisible(true);

        }
        if (evento.getSource()==combos){
            System.out.println("Frame combos");
        }
        if (evento.getSource()==estrenos){
            FrameEstrenos frameEstrenos = new FrameEstrenos();
            frameEstrenos.setVisible(true);
            dispose();
        }

    }
}
