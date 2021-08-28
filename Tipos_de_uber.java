/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Tipos_de_uber {
   private String beneficios;
    private String servicio;

    public Tipos_de_uber( ) {
    }

    public void Servicio (){
        
        System.out.println("Seleccione el servicio que desea utilizar: \nUber X (1) \nUber black (2) \nUber Suv (3) \nUber pool (4)");   
    }
    public void X(){
        System.out.println("Has seleccionado Uber X");
    }
    public void black(){
        System.out.println("Has seleccionado Uber black");
    }
    public void Van(){
        System.out.println("Has seleccionado Uber Van");
    }
    public void pool(){
        System.out.println("Has seleccionado Uber Pool");
    }
    
    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    } 
}
