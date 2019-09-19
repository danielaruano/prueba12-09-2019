import java.util.Scanner;
public class Vector{
    public static void main(String[]args){
        Scanner teclado= new Scanner (System.in);
        int[]notas=new int[5];
        int i;
        float promedio=0;
        
        /*notas[0]=2;
        notas[1]=8;
        notas[2]=7;
        notas[3]=10;
        notas[4]=3;*/
        
        for(i=0;i<notas.length;i++){
        System.out.print("Ingrese nota "+(i+1)+": ");
        notas[i]=teclado.nextInt();
        promedio=notas[i]+promedio;
        }
        promedio=promedio/(notas.length);
        //usando for
        System.out.println("El array tiene "+notas.length+" elementos");
        System.out.println("Las notas son:");
        for(i=0;i<notas.length;i++){
            System.out.print(notas[i]+" ");
        }
        System.out.println();
        System.out.println("promedio final: "+promedio);
        System.out.println();
        if(promedio>=7){
            System.out.println("Aprobado");
        }else{
            System.out.println("Desaprobado");   
            }
    }
}