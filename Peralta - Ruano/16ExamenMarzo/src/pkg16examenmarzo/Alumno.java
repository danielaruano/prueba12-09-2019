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
public class Alumno extends Persona{
    private int añoDelIngreso;
    List <Curso> cursadas;
    
    public Alumno(String nombre, String apellido, int dni, int añoDeIngreso){
        super(nombre, apellido, dni);
        this.añoDelIngreso= añoDeIngreso;
        cursadas = new ArrayList();
    }
    
    public int getAñoDelIngreso(){
        return añoDelIngreso;
    }
    
    public void addCurso(Curso curso){
        cursadas.add(curso);
    }
    
    
}
