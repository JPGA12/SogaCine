package co.edu.uptc.persistencia;

import java.util.ArrayList;

import co.edu.uptc.logica.modelo.Persona;
import co.edu.uptc.utilidades.Archivo;

public class DAOPersonas {

    private String RUTA = "Recursos/Personas.txt";

    // Set
    public void guardarPersona(Persona p) {

        new Archivo().AgregarContenido(RUTA, p.getNombre() + "," + p.getNumero() + "," + p.getEmail() + "," + p.getContraseña());

    }

    // Get
    public ArrayList<Persona> mostrarDatosPersonas() {
        // Obtener conetenido de mi archivo plano
        ArrayList<String> datos = new Archivo().ContenidoArchivo(RUTA);

        ArrayList<Persona> listadoPersonas = new ArrayList<Persona>();

        for (int i = 0; i < datos.size(); i++) {
            Persona p = new Persona();

            // Separo cada linea de datos en atributos
            String Linea[] = datos.get(i).split(",");

            p.setNombre(Linea[0]);
            p.setNumero(Linea[1]);
            p.setEmail(Linea[2]);
            p.setContraseña(Linea[3].replace(";",""));

            listadoPersonas.add(p);

        }

        return listadoPersonas;

    }

    // Metodo para obtener la informacion

}