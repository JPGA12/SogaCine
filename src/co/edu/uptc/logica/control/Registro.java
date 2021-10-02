package co.edu.uptc.logica.control;

import co.edu.uptc.logica.modelo.Persona;
import co.edu.uptc.persistencia.DAOPersonas;

import java.util.*;

public class Registro {
    private ArrayList<Persona> ListaPersonas;

    public Registro(){
        ListaPersonas = new DAOPersonas().mostrarDatosPersonas();
    }
    public void CrearPersona(String UserName, String Telefono, String Email, String Contraseña) {

        Persona p = new Persona();
        p.setApellido(UserName);
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
