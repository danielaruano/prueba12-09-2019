/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interface.IOnOff;

/**
 *
 * @author capacitacion16
 */
public class Televisor implements IOnOff {
    private String modelo;

    public Televisor(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void encender() {
        System.out.println ("El televisor se enciende");
       
    }

    @Override
    public void apagar() {
        System.out.println ("El televisor se apaga");
        
    }
    
}
