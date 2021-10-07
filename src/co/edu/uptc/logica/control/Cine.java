package co.edu.uptc.logica.control;

import co.edu.uptc.logica.modelo.*;
import co.edu.uptc.persistencia.*;

import java.util.*;

public class Cine {
    private ArrayList<Persona> ListaPersonas;
    private ArrayList<Pelicula> ListaPelicula;
    private ArrayList<Comida> ListaComidas;
    private int indice;

    public Cine(){
        ListaPersonas = new DAOPersonas().mostrarDatosPersonas();
        ListaPelicula = new DAOPeliculas().mostrarDatosCartelera();
        ListaComidas = new DAOComida().mostrarDatosComidas();
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

    public void AsientosDisponibles(){

    }

    public ArrayList<Persona> getListaPersonas() {
        return ListaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        ListaPersonas = listaPersonas;
    }

    public ArrayList<Pelicula> getListaPelicula() {
        return ListaPelicula;
    }
    public void setListaPelicula(ArrayList<Pelicula> listaPelicula) {
        ListaPelicula = listaPelicula;
    }

    public ArrayList<Comida> getListaComidas() {
        return ListaComidas;
    }

    public void setListaComidas(ArrayList<Comida> listaComidas) {
        ListaComidas = listaComidas;
    }

    public int guardarIndice(String correo){
        indice = 0;
        for (int i = 0; i < ListaPersonas.size(); i++) {
            if (ListaPersonas.get(i).getEmail().equalsIgnoreCase(correo)){
                indice = i;
            }
        }
        return indice;
    }

    public int devolverIndice(){
        int index = indice;
        return index;
    }
}
