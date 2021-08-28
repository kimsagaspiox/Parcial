
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
public class Persona {
     public static Scanner sc = new Scanner(System.in);
    protected String nombre;
    protected String apellido;
    protected long DPI;
    protected int telefono;
    protected String correo;
    protected String contrasena;
    
     public Persona(String nombre, String apellido, long DPI, int telefono, String correo, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DPI = DPI;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
       
        
   
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Persona.sc = sc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDPI() {
        return DPI;
    }

    public void setDPI(long DPI) {
        this.DPI = DPI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    } 

