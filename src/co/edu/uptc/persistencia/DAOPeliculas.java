package co.edu.uptc.persistencia;

import co.edu.uptc.logica.modelo.Estrenos;
import co.edu.uptc.logica.modelo.Pelicula;
import co.edu.uptc.logica.modelo.Persona;
import co.edu.uptc.utilidades.Archivo;

import java.util.ArrayList;

public class DAOPeliculas {

    public ArrayList<Pelicula> mostrarDatosCartelera() {
        // Obtener conetenido de mi archivo plano
        ArrayList<String> datos = new Archivo().ContenidoArchivo("Recursos/Cartelera.txt");
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

    public ArrayList<Estrenos> mostrarDatosEstrenos() {
        // Obtener conetenido de mi archivo plano
        ArrayList<String> datos = new Archivo().ContenidoArchivo("Recursos/Estrenos.txt");
        ArrayList<Estrenos> listadoPeliculas= new ArrayList<Estrenos>();

        for (int i = 0; i < datos.size(); i++) {
            Estrenos p = new Estrenos();

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
}
