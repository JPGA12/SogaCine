package co.edu.uptc.logica.modelo;

public class Comida {

    private String nombre, precio, bebida, comida, aperitivo;

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getAperitivo() {
        return aperitivo;
    }

    public void setAperitivo(String aperitivo) {
        this.aperitivo = aperitivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
