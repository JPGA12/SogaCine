package co.edu.uptc.presentacion;

public class Inicializadores {
    FrameRegistrar frameRegistrar;
    public Inicializadores(){
        frameRegistrar = new FrameRegistrar();
    }
    public void registro(){
        frameRegistrar.setVisible(true);
    }
}
