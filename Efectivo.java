/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Efectivo extends Pago{
    public Efectivo(int total, String nombre) {
        super(total, nombre);
    }

    public void datosef(){
        System.out.println("Ingrese el total de pago: "); total = sc.nextInt();
    }
}
