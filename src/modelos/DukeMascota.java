package modelos;

import enumeradores.EntretenimientosEnum;


public class DukeMascota extends Mascota {
 
    public DukeMascota( String nombre, String propietario) {
    
        super(nombre, propietario);
    }  
    
    public String toString(){
        return "La Mascota de nombre : " + nombre + '\n'
              + "nacio el dia " + fechaNacimiento.getDayOfWeek() +", "
                                + fechaNacimiento.getDayOfMonth() + " de "
                                + fechaNacimiento.getMonth() + " del año "
                                + fechaNacimiento.getYear() + '\n'
              + "a la hora : " + fechaNacimiento.getHour() +":"
                               + fechaNacimiento.getMinute() + '\n'
              + "actualmente se encuentra " +((isLive)? "vivo\n" : "muerto\n")
              + "su nivel de energia se encuentra en : " + nivelEnergia + "%\n"
              + "el nivel de hambre en : " + nivelHambre + '\n'
              + "nivel de cansancio : " + nivelCansancio + '\n'
              + "nivel de felicidad : " + nivelFelicidad + '\n'
              + "nivel de aburrimiento : " + nivelAburrimiento + '\n'
              + "y su actual propìetario es : " + propietario + '\n';  
    }
    
    private static int count;

    public void desaburrimiento(EntretenimientosEnum entretenimientosEnum) {
       
    }

   
    
}
