
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       Piloto piloto = new Piloto ("***", "***", "***", 0, 0, "***", "***");
        System.out.println("Seleccione lo que necesita: \nUn conductor (1) \n Ingresar como usuario (2)");
        int seleccionar = sc.nextInt();
        switch (seleccionar){
            case 1 : piloto.datospiloto();
            break;
            case 2: registro();
            break;
            default:; 
        }
        }
        public static void registro (){
        int seleccionar;
        cliente Cliente = new cliente (20, "***", "****", 0, 0, "***", "***");
        Piloto piloto = new Piloto ("***", "****", "***", 0, 0, "***", "***");
        Tarjeta tarjeta = new Tarjeta (0, 0, 0,0,0, "****");
        Viaje viaje = new Viaje (0, "***", "***", "***", "***",  0, 0, "***", "***");
        Efectivo efectivo = new Efectivo (0, "***");
        Tipos_de_uber tipos = new Tipos_de_uber ();
        Cliente.datos_clientes();
            System.out.println("\n");
        viaje.datosdes();
        System.out.println("\n");
        tipos.Servicio();
        seleccionar = sc.nextInt();
        switch (seleccionar){
            case 1: tipos.X();
            break;
            case 2: tipos.black();
            break;
            case 3: tipos.Van();
            break;
            case 4: tipos.pool();
            break;
            default:
                break;
        }
        System.out.println("\n");
        System.out.println("Seleccione a uno de nuetros 7 conductores disponibles" );
        seleccionar = sc.nextInt();
        switch (seleccionar) {
            case 1:
                piloto.piloto1();
                break;
            case 2:
                piloto.piloto2();
                break;
            case 3:
                piloto.piloto3();
                break;
            case 4:
                piloto.piloto4();
                break;
            case 5:
                piloto.piloto5();
                break;
            case 6:
                piloto.piloto6();
                break;
            case 7:
                piloto.piloto7();
                break;
            default:
                break;
        }
        System.out.println("\n");
        System.out.println("Seleccione su metodo de pago \nTarjeta de credito(1) \nEfectivo(2)");
        seleccionar = sc.nextInt();
        switch (seleccionar){
            case 1: tarjeta.datostar();
                break;
            case 2: efectivo.datosef();
                break;
            default:
                break;
        }
    }
    
}
