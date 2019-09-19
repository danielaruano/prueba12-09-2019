/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicos;

/**
 *
 * @author capacitacion16
 */
public class Raro {
    public static void main (String[] args){
		Raro raro= new Raro();
		raro.primero();
		raro.tercero();
		raro.segundo();
		raro.tercero();
	}
    
    public void primero (){
		System.out.println( "Dentro del método primero." );
	}
	public void segundo (){
		System.out.println( "Dentro del método segundo." );
		primero();
	}
	public void tercero () {
		System.out.println( "Dentro del método tercero." );
		primero();
		segundo();
	}

}
