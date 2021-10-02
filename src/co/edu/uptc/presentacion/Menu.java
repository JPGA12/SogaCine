package co.edu.uptc.presentacion;

import java.util.Scanner;
import co.edu.uptc.logica.control.Registro;

public class Menu {

    private Registro r;

    public Menu() {
        r = new Registro();
    }

    Scanner sc = new Scanner(System.in);
    private int op=0;

    public void Inicio() {
        System.out.println("SogaCine");

        while (op!= 2){
            System.out.println("| 1 | Registrarse");
            System.out.println("| 2 | Iniciar sesión");
            op= sc.nextInt();
            switch (op){
                case 1:
                    CrearCuenta();
                    break;
                case 2:
                    Login();
                    break;
                default:
                    break;
            }
        }

        while (op != 4) {

            System.out.println("\n| 1 | Ver Cartelera");
            System.out.println("| 2 | Proximos estrenos");
            System.out.println("| 3 | Combos de comida");
            System.out.println("| 4 | Salir");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    cartelera();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("ï¿½ï¿½ï¿½ ERROR: DATO INVALIDO !!!");
                    break;
            }
        }

    }
    private void cartelera() {
        int dia=0;
        String asiento="";
        String pelicula="";
        System.out.println("\n| 1 | Jhon Wick");
        System.out.println("| 2 | Spiderman: andwonalw home");
        System.out.println("| 3 | El conjurito");
        System.out.println("| 4 | PPP");
        System.out.println("Para comprar las entradas elija la pelicula");
        int op= sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("\nJhon Wick");
                pelicula="Jhon Wick";
                System.out.println("Escriba el asiento que quiere");
                asiento=sc.next();
                dias();
                dia=sc.nextInt();
                break;
            case 2:
                System.out.println("\nSpiderman: andwonalw home");
                pelicula="Spiderman: andwonalw home";
                System.out.println("Escriba el asiento que quiere");
                asiento=sc.next();
                dias();
                dia=sc.nextInt();
                break;
            case 3:
                System.out.println("\nEl conjurito");
                pelicula="El conjurito";
                System.out.println("Escriba el asiento que quiere");
                asiento=sc.next();
                dias();
                dia=sc.nextInt();
                break;
            case 4:
                System.out.println("\nPPP");
                pelicula="PPP";
                System.out.println("Escriba el asiento que quiere");
                asiento=sc.next();
                dias();
                dia=sc.nextInt();
                break;
            default:
                System.out.println("ï¿½ï¿½ï¿½ ERROR: DATO INVALIDO !!!");
                break;
        }
        Recibo(asiento,precios(dia), pelicula, dia);
    }
    private void dias(){
        System.out.println("Elija el dia de la funcion" +
                "\n1) Martes" +
                "\n2) Martes" +
                "\n3) Miercoles" +
                "\n4) Jueves" +
                "\n5) Viernes" +
                "\n6) Sabado" +
                "\n7) Domingo");
    }
    private void Recibo(String asiento, int precio, String pelicula, int dia){
        System.out.println("------------------------------------" +
                "\n|        SOGACINE        " +
                "\n| Pelicula: " +pelicula+ ""+
                "\n| Asiento: "+asiento+"  Precio: "+precio+"" +
                "\n| Dia: "+dia+ ""+
                "\n------------------------------------");
    }
    private int precios(int dia){
        int precio=10000;
        if (dia==3 || dia ==6){
            precio=6000;
        }
        return precio;
    }
    private void CrearCuenta(){
        System.out.println("Por favor digite su Nombre");
        String Nombre=sc.next();
        System.out.println("Por favor digite su Apellido");
        String Apellido=sc.next();
        System.out.println("Por favor digite su Telefono");
        String Telefono=sc.next();
        System.out.println("Ingrese su Correo");
        String Email=sc.next();
        System.out.println("Ingrese la Contraseña");
        String Contraseña=sc.next();

        r.CrearPersona(Apellido,Nombre,Telefono,Email,Contraseña);
        System.out.println("Su cuenta se creo correctamente");
    }
    /*public void MostrarCuenta(){
        for (int i=0;i<r.getListaPersonas().size();i++){
            System.out.println("\n"+r.getListaPersonas().get(i).getNombre());
            System.out.println(r.getListaPersonas().get(i).getNumero());
            System.out.println(r.getListaPersonas().get(i).getEmail());
            System.out.println(r.getListaPersonas().get(i).getContraseña());
        }
    }*/

    private void Login(){
        System.out.println("Ingrese su Email");
        String Email=sc.next();
        if(r.VerificacionEmail(Email)!= null){
            System.out.println("Ingrese su contraseña");
            String Contraseña= sc.next();
            if (r.VerificacionContra(Contraseña)!=null){
                System.out.println("\n==== BIENVENIDO ====");
            }else {
                System.out.println("Error: Contraseña Incorrecta");
                op=0;
            }
        }else {
            System.out.println("Error: Cuenta no encontrada");
            op=0;
        }
    }
}