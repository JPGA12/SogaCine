package co.edu.uptc.presentacion;

import java.util.Scanner;
import co.edu.uptc.logica.control.Cine;

public class Menu {

    private Cine c;

    public Menu() {
        c = new Cine();
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
                    break;
                case 2:
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
}