package co.edu.uptc.presentacion;

import co.edu.uptc.presentacion.GUI.*;

public class RunSogaCine {

    static FrameRegistrar frameRegistrar = new FrameRegistrar();
    static FrameCartelera frameCartelera = new FrameCartelera();
    static FrameEstrenos frameEstrenos = new FrameEstrenos();
    static FrameIngreso frameIngreso = new FrameIngreso();
    static FrameInicio frameInicio = new FrameInicio();
    static FrameMenu frameMenu = new FrameMenu();

    public static void main(String[] args) {
//        new Menu().Inicio();
        System.out.println("Bienvenido");
        System.out.println("Ejecutando");
//        frameRegistrar.setVisible(true);
//        frameCartelera.setVisible(true);
//        frameMenu.setVisible(true);
//        frameEstrenos.setVisible(true);
//        frameIngreso.setVisible(true);
        frameInicio.setVisible(true);
    }

}
