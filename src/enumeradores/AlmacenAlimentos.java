package enumeradores;
import modelos.Mascota;

public enum AlmacenAlimentos {
    
    SOPA(15), ASADO(25), CHORIPAN(10), ENSALADA(20), POROTO(5);

   
  public int energiaAportada;
  

  AlmacenAlimentos(int energia){
    this.energiaAportada = energia;
}

    public int getEnergiaAportada() {
        return energiaAportada; 
    }

    
    
}
