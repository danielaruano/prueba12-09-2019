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
public class Ejercicio4 {
    
    public static void main(String arg[]){
        
       Ejercicio4 objeto = new Ejercicio4();
       
       System.out.println(objeto.ifElseMisterioso(4, 5));
      
      
      
    }
    
    
   
    public String ifElseMisterioso( int x , int y ) {
    int z = 4;
    if ( z <= x ) {
        z = x + 1;
    } 
    else {
        z = z + 9;
    }
    if ( z <= y ) {
        y ++;
    }
    return z + " " + y ;
    
   
    
    }
}