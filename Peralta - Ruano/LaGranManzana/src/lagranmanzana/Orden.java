/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lagranmanzana;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion16
 */
public class Orden {
    private List <DetalleOrden> items;
    private int id;
    private Date creacion;
    private Date envio;
    
    public Orden(int id, Date creacion){
        this.id=id;
        this.creacion=creacion;
        items = new ArrayList<>();
    }
    
    public void agragarItem(DetalleOrden detalle){
        items.add(detalle);
    }
    
    public int getNroItems(){
        int nroItems=items.size();
        return nroItems;
    }
    
    public void setEnvio(Date envio){
        this.envio=envio;
    }
    
    /**
     * Retorna el precio total de la orden
     * @return 
     */
    public float totalOrden(){
        float totalOrden=0;
        for(Iterator <DetalleOrden> iterator = items.iterator(); iterator.hasNext();){
            DetalleOrden pedido = iterator.next();
            totalOrden = totalOrden + pedido.getCantidad() * pedido.getPrecioUnitario();
        }
        return totalOrden;
    }
}
