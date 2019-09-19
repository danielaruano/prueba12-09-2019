
import java.util.Scanner;

public class seriedenum {
    public static void main(String[]args){
        Scanner teclado= new Scanner (System.in);
        int suma, n1, n2, cant, b, mayor;
        suma=0;
        b=0;
        mayor=0;
        
        System.out.println("Ingrese cantidad de pares a procesar: ");
        cant=teclado.nextInt();
      
        for (int i=0; i<cant;i++){
        System.out.println("Ingrese el primer valor del par: ");
        n1=teclado.nextInt();
        
        System.out.println("Ingrese el segundo valor del par: ");
        n2=teclado.nextInt();
        
        suma = n1+n2;
        
        if (b==0){
            b=1;
            mayor=suma;
        }
        
        if(suma> mayor){
            mayor=suma;
        }
    }
    }
}
