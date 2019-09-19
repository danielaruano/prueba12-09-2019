/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazPolim;

import InterfazPolim.IAnimal;

/**
 *
 * @author capacitacion16
 */

    public class Pez implements IAnimal{
	private String nombre;
        public Pez(String nomb){
        this.nombre= nomb;
    }


       @Override
	public void comer (){
		System. out .println( "El pez " + nombre + " come plancton." );
	}

       @Override
	public void jugar (){
		System. out .println( "El pez " + nombre + " juega" );
	}

}
