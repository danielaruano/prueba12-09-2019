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
public class Ejercicio6 {
    public static void main(String arg[]){
           
    int [] array = { 2 , 18 , 6 ,- 4 , 5 , 1};
    
    for(int i=0; i < array.length; i++){
        array [ i ] = array [ i ] + ( array [ i ] / array [ 0 ]);
      }    
    
    System.out.println("NUEVOS VALORES DEL VECTOR");
    System.out.println("-------------------------");
    
    System.out.print("array = { ");
    
    for(int i=0; i<array.length; i++){
        System.out.print(array[i] + ", ");
    }
    System.out.print("}");

    }

}
