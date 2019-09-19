
package bicicleteria;


public class Bicicleta {
    private String nroDeSerie, modelo;
    private int año;
    private float precio;
    
    public Bicicleta(){
        
    }
    public Bicicleta(String nroDeSerie, String modelo, int año, float precio){
        this.nroDeSerie=nroDeSerie;
        this.modelo=modelo;
        this.año=año;
        this.precio=precio;
    }
    
    public String getNroDeSerie(){
        return nroDeSerie;
    } 
    public void setNroDeSerie(String nroDeSerie){
        this.nroDeSerie=nroDeSerie;
    }
    
    public String getModelo(){
        return modelo;
    } 
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public int getAño(){
        return año;
    } 
    public void setAño(int año){
        this.año=año;
    }
    
    public float getPrecio(){
        return precio;
    } 
    public void setPrecio(float precio){
        this.precio=precio;
    }
            
   }