/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capacitacion16
 */
import java.util.Scanner;

public class antiguedad {
    public static void main(String[]args){
    Scanner teclado= new Scanner (System.in);
    int años;
    float sueldo;
    float tsueldo;
    float ppaño=0;
    
    System.out.print("ingrese sueldo neto");
    sueldo=teclado.nextFloat();
    System.out.println("Ingrese antiguedad");
    años=teclado.nextInt();
    switch(años){
        case 1:
               ppaño=1;
               break;
        case 2:
               ppaño=2;
               break;
        case 3:
               ppaño=3;
               break;
        case 4:
               ppaño=4;
               break;
        case 5:
               ppaño=5;
               break;
        case 6:
               ppaño=6;
               break;
        case 7:
               ppaño=7;
               break;
        case 8:
               ppaño=8;
               break;
        case 9:
               ppaño=9;
               break;
        case 10:
               ppaño=10;
               break;
        case 11:
               ppaño=11;
               break;
        case 12:
               ppaño=12;
               break;
                       
    }
    tsueldo=sueldo+((sueldo*ppaño)/100);
    System.out.println("su sueldo es: "+tsueldo);
    }    
}
