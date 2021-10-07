package co.edu.uptc.logica.control;

import co.edu.uptc.logica.modelo.*;
import co.edu.uptc.persistencia.*;

import javax.print.DocFlavor;
import java.util.*;

public class Cine {
    private ArrayList<Persona> ListaPersonas;
    private ArrayList<Pelicula> ListaPelicula;
    private ArrayList<Comida> ListaComidas;
    private ArrayList<Estrenos> ListaEstrenos;
    private int indice, v;
    private String horarioF;
    private String sillas[] =new String[25];

    public Cine(){
        ListaPersonas = new DAOPersonas().mostrarDatosPersonas();
        ListaPelicula = new DAOPeliculas().mostrarDatosCartelera();
        ListaComidas = new DAOComida().mostrarDatosComidas();
        ListaEstrenos=new DAOPeliculas().mostrarDatosEstrenos();
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

    public ArrayList<Estrenos> getListaEstrenos() {
        return ListaEstrenos;
    }

    public void ratata(int i){
       v=i;
    }

    public int Row (){
        return v;
    }
//    public String asientos(int i){
//        sillas[0]="A1";
//        sillas[1]="A2";
//        sillas[2]="A3";
//        sillas[3]="A4";
//        sillas[4]="A5";
//        sillas[5]="B1";
//        sillas[6]="B2";
//        sillas[7]="B3";
//        sillas[8]="B4";
//        sillas[9]="B5";
//        sillas[10]="C1";
//        sillas[11]="C2";
//        sillas[12]="C3";
//        sillas[13]="C4";
//        sillas[14]="C5";
//        sillas[15]="D1";
//        sillas[16]="D2";
//        sillas[17]="D3";
//        sillas[18]="D4";
//        sillas[19]="D5";
//        sillas[20]="E1";
//        sillas[21]="E2";
//        sillas[22]="E3";
//        sillas[23]="E4";
//        sillas[24]="E5";
//
//        return sillas[i];
//    }

//    public void aaa(){
//        for (int i = 0; i < sillas.length ;i++) {
//            if (sillas[i]==1){
//                sillas[i]=1;
//            }else {
//                sillas[i]=0;
//            }
//
//        }
//    }

//    public void InicializarSillas(int indice, int a){
//        sillas[indice]=a;
//    }
//
//    public int SillaDisponible(int i){
//        return sillas[i];
//    }
}
