/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16examenmarzo;

/**
 *
 * @author capacitacion16
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso111 = new Curso("111", 40);
        Alumno alumno = new Alumno("Joffrey", "Batatheon", 25346123, 2018);
        alumno.addCurso(curso111);
        
        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " " + alumno.getAñoDelIngreso() + " "+ alumno.getDni());
    }
        
     
    }
    

