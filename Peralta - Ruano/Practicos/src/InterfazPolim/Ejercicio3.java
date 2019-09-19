/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazPolim;

/**
 *
 * @author capacitacion16
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Gato gato= new Gato("Lolo");
        Pez pez = new Pez("Pipo");
        gato.comer();
        gato.jugar();
        pez.comer();
        pez.jugar();
             System.out.println();
        System.out.println();
        System.out.println("EJEMPLO CON POLIMORFISMO.");
        System.out.println("-------------------------");
        IAnimal nino = new Gato("Nino");
        nino.comer();
        nino.jugar();
        nino = new Pez("Tito");
        nino.comer();
        nino.jugar();
    }

}
