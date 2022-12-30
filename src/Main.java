
import enumeradores.AlmacenAlimentos;
import enumeradores.EntretenimientosEnum;
import java.time.LocalTime;
import modelos.DukeMascota;
import modelos.Mascota;
import static persistencia.IMascotaPersistence.bdMascotas;
import persistencia.persistenceCollections.MascotaPersistenceUseList;

public class Main {

          public static void main(String[] arg) {
     
    DukeMascota duke = new DukeMascota("Duke-Merlina","semper");
    DukeMascota duke2 = new DukeMascota("Duke-Cordobes", "semper");
    DukeMascota duke3 = new DukeMascota("Duke-Porteño", "semper");
    DukeMascota duke4 = new DukeMascota("Duke-Litoral", "semper");
    persistence.guardar(duke);
    persistence.guardar(duke2);
    persistence.guardar(duke3);
    persistence.guardar(duke4);
    
    System.out.println("Antes de dormir " + duke.getNivelEnergia());
    duke.dormir(LocalTime.of(0, 25));
    System.out.println("Despues de dormir " + duke.getNivelEnergia());
    
    }

    private static class persistence {

        private static void guardar(DukeMascota duke4) {
           
        }

        public persistence() {
        }
    }


    
}

