package menu;

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
public class UsuarioPassword {
    public static void main(String[]args){
            Scanner teclado=new Scanner (System.in);
            String usuarioDB="daniela";
            String paswordDB="123456";
            
            System.out.println("Ingrese su usuario: ");
            String usuario=teclado.next();
            
            System.out.println("Ingrese su pasword: ");
            String pasword=teclado.next();
            
            if(usuario.equals(usuarioDB) && pasword.equals(paswordDB)){
                    System.out.println("Ingresaste correctamente!");
            } else{ 
                    System.out.println("usuario y pasword incorrectas");
            }
    }

    static void main() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
