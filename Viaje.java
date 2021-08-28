/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Viaje extends Persona{
    private int id;
    private String principio;
    private String Final;

    public Viaje(int id, String principio, String Final, String nombre, String apellido, int DPI, int telefono, String correo, String contrasena) {
        super(nombre, apellido, DPI, telefono, correo, contrasena);
        this.id = id;
        this.principio = principio;
        this.Final = Final;
    }

    
    public void datosdes(){
        System.out.println("Indique su ubicacion: "); principio = sc.next();
        System.out.println("Indique su destino: "); Final = sc.next();
    }

    public String getPrincipio() {
        return principio;
    }

    public void setPrincipio(String principio) {
        this.principio = principio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFinal() {
        return Final;
    }

    public void setFinal(String Final) {
        this.Final = Final;
    }
}
