package co.edu.uptc.presentacion;

import co.edu.uptc.presentacion.GUI.FrameIngreso;
import co.edu.uptc.presentacion.GUI.FrameRegistrar;

public class RunSogaCine {

    static FrameRegistrar frameRegistrar = new FrameRegistrar();
    static FrameIngreso frameIngreso = new FrameIngreso();
    public static void main(String[] args) {
//        new Menu().Inicio();
        System.out.println("Bienvenido");
        System.out.println("Ejecutando");
//        frameRegistrar.setVisible(true);
        frameIngreso.setVisible(true);
    }


}
