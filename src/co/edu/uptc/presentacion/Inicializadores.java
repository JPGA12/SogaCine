package co.edu.uptc.presentacion;

import co.edu.uptc.presentacion.GUI.FrameRegistrar;

public class Inicializadores {
    FrameRegistrar frameRegistrar;
    public Inicializadores(){
        frameRegistrar = new FrameRegistrar();
    }
    public void registro(){
        frameRegistrar.setVisible(true);
    }
}
