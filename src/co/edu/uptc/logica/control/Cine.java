package co.edu.uptc.logica.control;

import co.edu.uptc.logica.modelo.Pelicula;
import co.edu.uptc.logica.modelo.Persona;
import co.edu.uptc.persistencia.DAOPeliculas;
import co.edu.uptc.persistencia.DAOPersonas;

import java.util.*;

public class Cine {
    private ArrayList<Persona> ListaPersonas;
    private ArrayList<Pelicula> ListaPelicula;

    public Cine(){
        ListaPersonas = new DAOPersonas().mostrarDatosPersonas();
        ListaPelicula = new DAOPeliculas().mostrarDatosCartelera();

    }
    public void CrearPersona(String Apellido, String Nombre, String Telefono, String Email, String Contraseña) {

        Persona p = new Persona();
        p.setNombre(Nombre);
        p.setApellido(Apellido);
        p.setTelefono(Telefono);
        p.setEmail(Email);
        p.setContraseña(Contraseña);

        new DAOPersonas().guardarPersona(p);

        ListaPersonas = new DAOPersonas().mostrarDatosPersonas();
    }

    public Persona VerificacionEmail(String Email){
        for (Persona p : getListaPersonas()){
            if (Email.equalsIgnoreCase(p.getEmail())){
                return p;
            }
        }
        return null;
    }

    public Persona VerificacionContra(String Contraseña){
        for (Persona p : getListaPersonas()){
            if (Contraseña.equalsIgnoreCase(p.getContraseña())){
                return p;
            }
        }
        return null;
    }

    public ArrayList<Persona> getListaPersonas() {
        return ListaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        ListaPersonas = listaPersonas;
    }


}
