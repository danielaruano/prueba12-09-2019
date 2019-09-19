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
public class Ejercicio5 {
    public static void main(String arg[]){
        int [] a1 = { 1 , 3 , 5 , 7 , 9 };
        int [] a2 = { 1 , 4 , 9 , 16 , 25 };
        
        Ejercicio5 arreglo= new Ejercicio5();
        
        arreglo.misterio(a1, a2);
        
        for(int i=0; i<a1.length; i++){
            System.out.println(a1[i]);
        
        }
        
        
    }
    
public void misterio( int[]a , int[]b ) {
    for ( int i = 0 ; i < a . length ; i ++) {
        a [ i ] += b [ b . length - 1 - i ];
    }
}

}
