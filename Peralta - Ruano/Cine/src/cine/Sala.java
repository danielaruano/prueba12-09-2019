package cine;

public class Sala {

private int capacidad;
private int numero;

public Sala(){
}
public Sala(int capacidad, int numero){
    this.capacidad=capacidad;
    this.numero=numero;
}

public int getCapacidad(){
    return capacidad;
}

public void setCapacidad(int capacidad){
    this.capacidad=capacidad;
}


public int getNumero(){
    return numero;
}

public void setNumero(int numero){
    this.numero=numero;
}
}