/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lagranmanzana;

/**
 *
 * @author capacitacion16
 */
public class LaGranManzana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notebook lg = new Notebook("LG", "modelo", "procesador", 20 );
        DetalleOrden pedido1 = new DetalleOrden(lg, 500, 2);   
        //Orden primera = new Orden();
    }    
}
