
package futbol5;

import java.util.Date;

public class Reserva {
    private Date fechaReserva;
    private Equipo equipo1, equipo2;
    
    public Reserva(){
        
    }
    
    public Reserva(Date dReserva, Equipo dEquipo1, Equipo dEquipo2){
        this.fechaReserva=dReserva;
        this.equipo1=dEquipo1;
        this.equipo2=dEquipo2;
    }
    
    public Date getFechaReserva(){
        return fechaReserva;
    }
    public void setFechaReserva(Date dReserva){
        this.fechaReserva=dReserva;
    }
    
    public Equipo getEquipo1(){
        return equipo1;
    }
    public void setEquipo1(Equipo dEquipo1){
        this.equipo1=dEquipo1;
    }
    
    public Equipo getEquipo2(){
        return equipo2;
    }
    public void setEquipo2(Equipo dEquipo2){
        this.equipo2=dEquipo2;
    }
    
    
}
