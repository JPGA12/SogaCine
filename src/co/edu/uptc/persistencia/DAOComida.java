package co.edu.uptc.persistencia;

import co.edu.uptc.logica.modelo.Comida;
import co.edu.uptc.utilidades.Archivo;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

public class DAOComida {

    public ArrayList<Comida> mostrarDatosComidas() {
        // Obtener conetenido de mi archivo plano
        ArrayList<String> datos = new Archivo().ContenidoArchivo("Recursos/Comidas.txt");
        ArrayList<Comida> listadoComidas= new ArrayList<Comida>();

        for (int i = 0; i < datos.size(); i++) {
            Comida c = new Comida();

            // Separo cada linea de datos en atributos
            String Linea[] = datos.get(i).split(",");

            c.setNombre(Linea[0]);
            c.setPrecio(Linea[1]);
            c.setBebida(Linea[2]);
            c.setComida(Linea[3]);
            c.setAperitivo(Linea[4].replace(";",""));

            listadoComidas.add(c);
        }

        return listadoComidas;
    }
}
