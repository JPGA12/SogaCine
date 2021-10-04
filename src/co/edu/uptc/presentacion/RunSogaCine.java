package co.edu.uptc.presentacion;

import co.edu.uptc.presentacion.GUI.FrameCartelera;
import co.edu.uptc.presentacion.GUI.FrameMenu;
import co.edu.uptc.presentacion.GUI.FrameRegistrar;
import co.edu.uptc.presentacion.GUI.FrameEstrenos;

public class RunSogaCine {

    static FrameRegistrar frameRegistrar = new FrameRegistrar();
    static FrameCartelera frameCartelera = new FrameCartelera();
    static FrameEstrenos frameEstrenos = new FrameEstrenos();

    static FrameMenu frameMenu = new FrameMenu();
    public static void main(String[] args) {
//        new Menu().Inicio();
        System.out.println("Bienvenido");
        System.out.println("Ejecutando");
        //frameRegistrar.setVisible(true);
        frameCartelera.setVisible(true);
//        frameMenu.setVisible(true);
        //frameEstrenos.setVisible(true);
    }

//    public void frameRegistro(){
//    frameRegistrar.setVisible(true);
//    }

}
