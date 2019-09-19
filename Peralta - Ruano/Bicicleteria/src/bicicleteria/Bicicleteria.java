
package bicicleteria;

import java.util.ArrayList;
import java.util.List;

public class Bicicleteria {
    private List<Bicicleta> bicicletas;
    private float ganancias;
    private Integer cantidadDeVentas;
    
    public Bicicleteria(){
        bicicletas= new ArrayList<>();
    }
    public Bicicleteria(List<Bicicleta> bicicletas, float ganancias, Integer cantidadDeVentas){
        this.bicicletas=bicicletas;
        this.ganancias=ganancias;
        this.cantidadDeVentas=cantidadDeVentas;
    }
    
   public void addBicicleta(Bicicleta bicicleta){
       this.bicicletas.add(bicicleta);
   } 
   
   public List<Bicicleta> getBicicletas(){
       return bicicletas;
   }
   public void setBicicletas(List<Bicicleta> bicicletas){
       this.bicicletas=bicicletas;
   }
   
    public Float getGanancias(){
       return ganancias;
   }
   public void setGanancias(Float ganancias){
       this.ganancias=ganancias;
   }
   
    public Integer getCantidadDeVentas(){
       return cantidadDeVentas;
   }
   public void setCantidadDeVentas(Integer cantidadDeVentas){
       this.cantidadDeVentas=cantidadDeVentas;
   }
   
   public void venderBicicleta(Bicicleta bicicleta){
       this.bicicletas.remove(bicicleta);
   }
   
   public Bicicleta buscarBicicleta(String nroDeSerie){
      String ret = null;
       for(int i=0;i<bicicletas.size(); i++){
           ret = bicicletas.get(i).getNroDeSerie();
           
           if(ret.equals(nroDeSerie)){
               return bicicletas.get(i);
           }
           return null;
       
   } 



