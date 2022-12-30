package acciones;
import enumeradores.AlmacenAlimentos;
import modelos.Mascota;


public class Alimentarse {
   
    private AlmacenAlimentos comida;

public void ingerirAlimento(AlmacenAlimentos comida, Mascota mascota) {
    if(mascota.isLive()){
      mascota.setNivelEnergia(mascota.getNivelEnergia() + comida.getEnergiaAportada());
         
      contabilizarComida(mascota);
          
      if(mascota.getPopo().tieneQueEvacuar(mascota)){
         mascota.setNivelEnergia(mascota.getNivelEnergia() - 15); 
        } 
         
    }else{
       System.out.println("Lo siento, esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte());
        }
}
    
    public void Alimentarse (AlmacenAlimentos comida, Mascota mascota) {
        if(mascota.isLive()){
          mascota.setNivelHambre(mascota.setNivelHambre + comida.getEnergiaAportada() - mascota.setNivelHambre);
         System.out.println("duke come " + comida + " y su nivel de hambre baja a " + mascota.getNivelhambre());
        }
    }

    private void tieneQueEvacuar(Mascota mascota) {
        
    }

    private void contabilizarComida(Mascota mascota) {
     mascota.setComidasIngeridas(mascota.getComidasIngeridas() + 1);
    }

}  

