/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Piloto extends Persona {
    private String tipoLicencia;

    public Piloto(String tipoLicencia, String nombre, String apellido, long DPI, int telefono, String correo, String contrasena) {
        super(nombre, apellido, DPI, telefono, correo, contrasena);
        this.tipoLicencia = tipoLicencia;
    }



    public void datospiloto(){
         System.out.println("Ingrese su nombre: "); nombre = sc.next();
        System.out.println("Ingrese su apellido: "); apellido = sc.next();
        System.out.println("Ingrese su número de DPI: "); DPI = sc.nextLong();
        System.out.println("Ingrese su número de telefono: "); telefono = sc.nextInt();
        System.out.println("Ingrese su tipo de licencia: "); tipoLicencia = sc.next();
        System.out.println("Ingrese su correo para registro: "); correo = sc.next();
        System.out.println("Ingrese su contrasena: "); contrasena = sc.next();
    }
    public void piloto1(){
        System.out.println("Jose Lopez \nTipo de licencia A");
    }
    public void piloto2(){
        System.out.println("Cesar Cruz \nTipo de licencia B");
    }
    public void piloto3(){
        System.out.println("Pedro Perez \nTipo de licencia B");
    }
    public void piloto4(){
        System.out.println("Luis Soto \nTipo de licencia A");
    }
    public void piloto5(){
        System.out.println("Josué Sagastume \nTipo de licencia A");
    }
    public void piloto6(){
        System.out.println("Carlos Pinto \nTipo de licencia A");
    }
    public void piloto7(){
        System.out.println("Daniel Orellana \nTipo de licencia A");
    }
    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
    
    
}  

