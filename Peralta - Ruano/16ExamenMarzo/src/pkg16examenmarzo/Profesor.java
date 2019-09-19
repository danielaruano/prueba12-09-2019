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
public class Profesor extends Persona{
    private int cantidadHoras;
    private float sueldo;
    private List<Curso> cursosDictados;
    
    public Profesor(String nombre, String apellido, int dni){
        super(nombre, apellido,dni);
        cursosDictados = new ArrayList<>();
    }
    
    public void setCantidadHoras( int horas){
        this.cantidadHoras= horas; 
    }
    
    public int getCantidadHoras(){
        return cantidadHoras;
    }
    
    public void setSueldo(float sueldo){
        this.sueldo= sueldo;
    }
    
    public float getSueldo(){
        return sueldo;
    }
    
    public void addCurso(Curso curso){
        cursosDictados.add(curso);
    }
    
    public List <Curso> cursosConAterioridadA(int añoIngreso){
        List <Curso> cursosConAterioridadA = new ArrayList<>();
        for(Iterator <Curso> it= cursosDictados.iterator(); it.hasNext();){
            Curso c1= it.next();
            if(c1.ingresantesAnterioresA(añoIngreso)){
                cursosConAterioridadA.add(c1);
            }
        }
        return cursosConAterioridadA;
    }
}
