
package cine;
import java.util.Calendar;
import java.util.Date;

public class HorarioFuncion {
    
    private int diaDeSemana;
    private int duracionIntervalo;
    private int duracionPublicidad;
    private boolean esTrasnoche;
    private Date horaPrimeraFuncion;
    private Date horaUltimaFuncion;
public HorarioFuncion(){
}

public HorarioFuncion(int diaDeSemana, int duracionIntervalo, 
        int duracionPublicidad, boolean esTrasnoche, 
        Date horaPrimeraFuncion, Date horaUltimaFuncion){
    this.diaDeSemana=diaDeSemana;
    this.duracionIntervalo=duracionIntervalo;
    this.duracionPublicidad=duracionPublicidad;
    this.esTrasnoche=esTrasnoche;
    this.horaPrimeraFuncion=horaPrimeraFuncion;
    this.horaUltimaFuncion=horaUltimaFuncion;
    
}
private String obtenerDescripcionDia(){
    String dia;
    switch(this.diaDeSemana){
        case Calendar.MONDAY:
            dia="Lunes";
            break;
        case Calendar.TUESDAY:
            dia="Martes";
            break;
        case Calendar.WEDNESDAY:
            dia="Miercoles";
            break;
        case Calendar.THURSDAY:
            dia="Jueves";
            break;
        case Calendar.FRIDAY:
            dia="Viernes";
            break;
        case Calendar.SATURDAY:
            dia="Sabado";
            break;
        case Calendar.SUNDAY:
            dia="Domingo";
            break;
        default:
            dia="no es un dia";
    }  
return dia;
}

public int getDiaDeSemana(){
    return diaDeSemana;
}
public void setDiaDeSemana(int diaDeSemana){
    this.diaDeSemana=diaDeSemana;
}

public int getDuracionIntervalo(){
    return duracionIntervalo;
}
public void setDuracionIntervalo(int duracionIntervalo){
    this.duracionIntervalo=duracionIntervalo;
}

public int getDuracionPublicidad(){
    return duracionPublicidad;
}
public void setDuracionPublicidad(int duracionPublicidad){
    this.duracionPublicidad=duracionPublicidad;
}

public Boolean isEsTrasnoche(){
    return esTrasnoche;
}
public void setEsTrasnoche(boolean esTrasnoche){
    this.esTrasnoche=esTrasnoche;
}

public Date getHoraPrimeraFuncion(){
    return horaPrimeraFuncion;
}
public void setHoraPrimeraFuncion(Date horaPrimeraFuncion){
    this.horaPrimeraFuncion=horaPrimeraFuncion;
}

public Date getHoraUltimaFuncion(){
    return horaUltimaFuncion;
}
public void setHoraUltimaFuncion(Date horaUltimaFuncion){
    this.horaUltimaFuncion=horaUltimaFuncion;
}

@Override
public String toString(){
    StringBuilder sb=new StringBuilder();
    sb.append("Los horaros para el dia: ").append(obtenerDescripcionDia()).append("son: ");
    sb.append("Duracion del Intervalo: " ).append(duracionIntervalo).append("\n");
    sb.append("Duracion de la Publicidad: ").append(duracionPublicidad).append("\n");
    sb.append("Acepta Trasnoche: ").append(esTrasnoche).append("\n");
    sb.append("Horario primera funcion: ").append(horaPrimeraFuncion).append("\n");
    sb.append("Horario ultima funcion: ").append(horaUltimaFuncion).append("\n");
    return sb.toString();
}

}

