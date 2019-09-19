
package menu;

import java.util.Scanner;

import java.util.Scanner;
public class Ejercicio38 {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int legajo;
    String alumno;
    double promedio, nota;
    double suma =0;

    
    System.out.println("Ingrese numero de legajo: ");
          legajo= teclado.nextInt();
    
    do{
          System.out.print("Ingrese nombre del alumno: ");
          alumno= teclado.nextLine();
          
          for(int i=0; i<4; i++){
              System.out.print("Ingrese la nota: ");
              nota= teclado.nextFloat();
              
              if(nota >= 0 && nota <=10){
                 suma= suma+nota;
              }
              else{
                  System.out.print("Los valores ingresados no son correctos.");
                  i=i-1;
              }
          }
          
          promedio = (suma/4);
       }
     
    
    
    }
}



