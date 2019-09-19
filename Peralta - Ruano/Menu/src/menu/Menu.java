
package menu;

import java.util.Scanner;
public class Menu {

    
    public static void main(String[] args) {
        int opcion;
        
       Scanner teclado = new Scanner(System.in);
       
       System.out.print("Ingrese la opcion a utiliar: ");
       opcion= teclado.nextInt();
       
       switch(opcion){
           case 1:
               UsuarioPassword.main();
               break;
       }
    }
    
}
