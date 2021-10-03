package co.edu.uptc.presentacion;

import co.edu.uptc.presentacion.GUI.FrameCartelera;
import co.edu.uptc.presentacion.GUI.FrameMenu;
import co.edu.uptc.presentacion.GUI.FrameRegistrar;

public class RunSogaCine {

    static FrameRegistrar frameRegistrar = new FrameRegistrar();
    static FrameCartelera frameCartelera = new FrameCartelera();
    static FrameMenu frameMenu = new FrameMenu();
    public static void main(String[] args) {
//        new Menu().Inicio();
        System.out.println("Bienvenido");
        System.out.println("Ejecutando");
        frameRegistrar.setVisible(true);
//        frameCartelera.setVisible(true);
//        frameMenu.setVisible(true);
    }

//    public void frameRegistro(){
//    frameRegistrar.setVisible(true);
//    }

}
