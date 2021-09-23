package co.edu.uptc.presentacion;

import java.util.Scanner;
import co.edu.uptc.logica.control.Registro;

import javax.print.Doc;

public class Menu {

    private Registro r;

    public Menu() {
        r = new Registro();
    }

    Scanner sc = new Scanner(System.in);

    public void Inicio() {
        System.out.println("Hola World");
        int op=0;

        while (op!= 2){
            System.out.println("| 1 | Registrarse");
            System.out.println("| 2 | Iniciar sesión");
            op= sc.nextInt();
            switch (op){
                case 1:
                    CrearCuenta();
                    break;
                case 2:
                    System.out.println("Ingrese su Email");
                    String Email=sc.next();
                    if(r.VerificacionEmail(Email)!=null){
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
                    //login();
                    //MostrarCuenta();
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
        System.out.println("\n| 1 | Jhon Wick");
        System.out.println("| 2 | Spiderman: andwonalw home");
        System.out.println("| 3 | El conjurito");
        System.out.println("| 4 | PPP");
    }
    private void CrearCuenta(){
        System.out.println("Por favor digite su Nombre");
        String Nombre=sc.next();
        System.out.println("Por favor digite su Numero");
        String Numero=sc.next();
        System.out.println("Ingrese su Correo");
        String Email=sc.next();
        System.out.println("Ingrese la Contraseña");
        String Contraseña=sc.next();

        r.CrearPersona(Nombre,Numero,Email,Contraseña);
        System.out.println("Su cuenta se creo correctamente");
    }
    public void MostrarCuenta(){
        for (int i=0;i<r.getListaPersonas().size();i++){
            System.out.println("\n"+r.getListaPersonas().get(i).getNombre());
            System.out.println(r.getListaPersonas().get(i).getNumero());
            System.out.println(r.getListaPersonas().get(i).getEmail());
            System.out.println(r.getListaPersonas().get(i).getContraseña());
        }
    }

    /*private void login(){
        System.out.println("Ingrese su Email");
        String Email=sc.next();
        if(r.VerificacionEmail(Email)!=null){
            System.out.println("Ingrese su contraseña");
            String Contraseña= sc.next();
            if (r.VerificacionContra(Contraseña)!=null){
                System.out.println("\n==== BIENVENIDO ====");
            }else {
                System.out.println("Error: Contraseña Incorrecta");

            }
        }
    }*/
}