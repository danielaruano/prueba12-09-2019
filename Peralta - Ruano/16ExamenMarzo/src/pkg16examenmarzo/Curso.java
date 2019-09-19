/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16examenmarzo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion16
 */
public class Curso {
    private String nombre;
    private int maximoAlumnos;
    private List <Alumno> alumnos;
    private List <Float> notas;
    
    public Curso(String nombre, int maximoAlumnos){
        this.nombre= nombre;
        this.maximoAlumnos= maximoAlumnos;
        alumnos= new ArrayList<>();
        notas = new ArrayList<>();
    }
    
    public String getNombre(){
        return nombre;
    }
    
   public boolean ingresantesAnterioresA(int añoIngreso){
       for(Iterator <Alumno> it= alumnos.iterator(); it.hasNext();){
           Alumno a1= it.next();
           if(a1.getAñoDelIngreso() < añoIngreso){
               return true;
           } 
       }
       return false;
   }
   
   public boolean agregarAlumno(Alumno nuevoAlumno){
       if(alumnos.size() < maximoAlumnos){
           alumnos.add(nuevoAlumno);
           nuevoAlumno.addCurso(this);
           return true;
       }
       return false;
   }
    
   
}
