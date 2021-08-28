/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class cliente extends Persona {
    protected int id;

    public cliente(int id, String nombre, String apellido, long DPI, int telefono, String correo, String contrasena) {
        super(nombre, apellido, DPI, telefono, correo, contrasena);
        this.id = id;
    }
    
    public void datos_clientes(){
        System.out.println("Ingrese su nombre: "); nombre = sc.next();
        System.out.println("Ingrese su apellido: "); apellido = sc.next();
        System.out.println("Ingrese su id: "); id = sc.nextInt();
        System.out.println("Ingrese su contraseña: "); contrasena = sc.next();
        System.out.println("Ingrese su número de telefono: "); telefono = sc.nextInt();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
