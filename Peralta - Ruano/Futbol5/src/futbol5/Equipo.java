
package futbol5;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<String> jugadores;
    private int max_jugadores=0;
    
    public Equipo(){
        
    }
    public Equipo(String nombre, int jugadores){
        this.nombre=nombre;
        this.max_jugadores=jugadores;
       
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public int getMax_jugadores(){
        return max_jugadores;
    }
    public void setMax_jugadores(int max_jugadores){
        this.max_jugadores=max_jugadores;
    }
    
    public List<String> getJugador(){
        return jugadores;
    }
    public void setJugador(List <String> jugadores){
        this.jugadores=jugadores;
    }
    
    public void addJugador(String jugador){
        this.jugadores.add(jugador);
    }
    
   
    
}
