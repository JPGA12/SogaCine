package co.edu.uptc.persistencia;

import co.edu.uptc.logica.modelo.Pelicula;
import co.edu.uptc.logica.modelo.Persona;
import co.edu.uptc.utilidades.Archivo;

import java.util.ArrayList;

public class DAOPeliculas {
    private String RUTA = "Recursos/Cartelera.txt";


    public ArrayList<Pelicula> mostrarDatosPelicula() {
        // Obtener conetenido de mi archivo plano
        ArrayList<String> datos = new Archivo().ContenidoArchivo(RUTA);

        ArrayList<Pelicula> listadoPeliculas= new ArrayList<Pelicula>();

        for (int i = 0; i < datos.size(); i++) {
            Pelicula p = new Pelicula();

            // Separo cada linea de datos en atributos
            String Linea[] = datos.get(i).split(",");
            p.setTitulo(Linea[0]);
            p.setDirector(Linea[1]);
            p.setGenero(Linea[2]);
            p.setDuracion(Linea[3]);
            p.setAño(Linea[4].replace(";",""));

            listadoPeliculas.add(p);

        }

        return listadoPeliculas;

    }

    // Metodo para obtener la informacion
}
