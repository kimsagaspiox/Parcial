/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Tarjeta extends Pago{
    private int numero;
    private int vencimiento;
    private int transferencia;
    private int cvv;

    public Tarjeta(int numero, int vencimiento, int transferencia, int cvv, int total, String nombre) {
        super(total, nombre);
        this.numero = numero;
        this.vencimiento = vencimiento;
        this.transferencia = transferencia;
        this.cvv = cvv;
    }



    public void datostar(){
        System.out.println("Ingrese el número de la tarjeta: "); numero = sc.nextInt();
        System.out.println("Ingrese el número la fecha de vencimiento: "); vencimiento = sc.nextInt();
        System.out.println("Ingrese el cvv:  "); cvv = sc.nextInt();
        System.out.println("Ingrese monto a pagar: "); total = sc.nextInt();
        System.out.println("Ingrese el nombre el titular: "); nombre = sc.next();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(int vencimiento) {
        this.vencimiento = vencimiento;
    }

    public int getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(int transferencia) {
        this.transferencia = transferencia;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public Tarjeta(int total, String nombre) {
        super(total, nombre);
    }
    
}
