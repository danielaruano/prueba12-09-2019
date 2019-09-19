
package cine;


public class PaisDeOrigen {
    private Integer id;
    private String nombre;
    private String idioma;
    
public PaisDeOrigen(){
}    

public PaisDeOrigen(String nombre, String idioma){
this.idioma=idioma;
this.nombre=nombre;
}

public String getIdioma(){
return idioma;
}

public void setIdioma(String idioma){
this.idioma=idioma;
}

public String getNombre(){
return nombre;
}

public void setNombre(String nombre){
this.nombre=nombre;
}

public Integer getId(){
return id;
}

public void setId(Integer id){
this.id=id;
}

@Override
public String toString(){
return this.nombre;
}
}
