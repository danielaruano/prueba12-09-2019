
import java.util.Scanner;

public class projMat{
public static void main(String[]args){
Scanner teclado= new Scanner (System.in);
int[][]matris=new int [5][5];
int val1;
int val2;
int[]vector=new int[25];
int k;
    k = 0;

for(int i=0;i<25;i++){
     System.out.println("Ingrese primer numero: ");
     val1=teclado.nextInt();
     System.out.println("Ingrese segundo numero: ");
     val2=teclado.nextInt();
     vector[i]=val1+val2;
    }
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
        matris[i][j]=vector[k];
        k++;
        System.out.print(matris[i][j]+" ");
            }
System.out.println();
}
}
}