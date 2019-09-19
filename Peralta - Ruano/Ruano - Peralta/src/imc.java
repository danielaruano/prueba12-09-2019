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

public class imc {
    public static void main(String[]args){
        double peso, altura, imc;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la altura:");
        altura= teclado.nextFloat();
        System.out.println("Ingrese su peso");
        peso=teclado.nextFloat();
        imc= peso/Math.pow(altura, 2);
            System.out.printf("su indice de masa corporal es: %.2f",imc);
        if (imc<=18.5){
                System.out.println("tienes un imc bajo");
                }
        else if(imc<=24.90){
                System.out.println("tienes un imc normal");
        }else{
            System.out.println("tienes un imc alto");
        }
    }
}
