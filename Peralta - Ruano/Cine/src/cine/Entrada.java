
package cine;


public class Entrada {
    private String fechaHoraFuncion;
    private String horaVenta;
    private float precioContado;
    private int ticketNro;
    
    public Entrada(){
    }
    
    public Entrada(String fechaHoraFuncion, String horaVenta, Float precioContado, int ticketNro){
    this.fechaHoraFuncion = fechaHoraFuncion;
    this.horaVenta = horaVenta;
    this.precioContado=precioContado;
    this.ticketNro=ticketNro;
}
    
    public String getFechaHoraFuncion(){
        return fechaHoraFuncion;
    }
    public void setFechaHoraFucion(String fechaHoraFuncion){
        this.fechaHoraFuncion=fechaHoraFuncion;
    }
    
    public String getHoraVeta(){
        return horaVenta;
    }
    public void setHoraVenta(String horaVenta){
        this.horaVenta=horaVenta;
    }
    
    
    
}
