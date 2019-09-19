/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicos;

/**
 *
 * @author capacitacion16
 */
public class Ejercicio7 {
    public static void main(String arg[]){
        
        double saldo =0;
        Ejercicio7 cc= new Ejercicio7("Lopez");
        System.out.println("El nombre de cliente es: " + cc.getNombre());
        
        cc.setNombre("Perez");
        System.out.println("El nombre de cliente es: " + cc.getNombre());
        
        saldo = saldo + cc.ingresar(-1);
        
        saldo = saldo + cc.ingresar(25.5);
        System.out.println("El saldo actual de la cuenta es: " + saldo);
        
        saldo = saldo + cc.ingresar(5);
        System.out.println("El saldo actual de la cuenta es: " + saldo);
        
        saldo = saldo + cc.retirar(5);
        System.out.println("El saldo actual de la cuenta es: " + saldo);
        
        saldo = saldo - cc.retirar(80);
        System.out.println("El saldo actual de la cuenta es: " + saldo);
    }
    
    
    
        private String nombre;
        private double cantidad;
        
        public Ejercicio7(){
        }

    public Ejercicio7(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
        
        public Ejercicio7(String cliente){
            this.nombre = cliente;
        }
        
        public String getNombre(){
            return nombre;
        }
        
        public void setNombre(String nomb){
            this.nombre = nomb;
        }
        
        public double getCantidad(){
            return cantidad;
        }
        
        public void setCantidad(double cant){
            this.cantidad = cant;
        }
        
        @Override
        public String toString(){
            return nombre;
        }
        
        public double ingresar(double cantidad){
            double cuenta = 0;
            if(cantidad >=0){
                cuenta = cuenta + cantidad;
                }
            else{
                System.out.println("La cantidad ingresada no es correcta");
            }
            return cuenta;
        }
        
        public double retirar(double cantidad){
            double cuenta;
            cuenta = cuenta - cantidad;
            if(cuenta < 0){
                cuenta =0;
                }
            return cuenta;
        }
        
        
}

