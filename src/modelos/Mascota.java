package modelos;

import acciones.Alimentarse;
import acciones.Divertirse;
import acciones.Dormir;
import acciones.HacerPopo;
import enumeradores.AlmacenAlimentos;
import java.time.LocalDateTime;
import enumeradores.EntretenimientosEnum;
import java.time.LocalTime;

public class Mascota {

    public static LocalDateTime ultimoDescanso;
    protected Dormir descansar;
    protected int id;
    protected String nombre;
    protected LocalDateTime fechaNacimiento;
    protected LocalDateTime fechaMuerte;
    protected boolean isLive;
    protected int nivelEnergia;
    protected int nivelHambre;
    protected int nivelCansancio;
    protected int nivelFelicidad;
    protected int nivelAburrimiento;
    protected String propietario;
    protected Alimentarse alimentarse;
    protected Divertirse divertirse;
    private Mascota Mascota;
    protected LocalDateTime setFechaNacimiento;
    public int setNivelHambre;
    protected LocalDateTime LocalDateTime;
    protected int comidasIngeridas;
    private int contabilizarComida;
    protected HacerPopo popo;
    private boolean tieneQueEvacuar;
   
   
    
    

public Mascota(String nombre, String propietario) {
    setId (id);
    setNombre (nombre);
    setPropietario (propietario);
    setIsLive (true);
    setNivelEnergia (20);
    setNivelHambre = (int)(Math.random()*100);
    setNivelCansancio ((int)(Math.random()*100));
    setNivelFelicidad ((int)(Math.random()*100));
    setNivelAburrimiento ((int)(Math.random()*100));
    this.fechaNacimiento = LocalDateTime.now();
    this.alimentarse = new Alimentarse();
    this.divertirse = new Divertirse();
    this.descansar = new Dormir();
    this.popo = new HacerPopo();

}

public void comer(AlmacenAlimentos alimento){
  alimentarse.ingerirAlimento(alimento, this);
}

public void dormir(LocalTime tiempo){
 descansar.hacerDormir(tiempo, this);
}

public void jugar(EntretenimientosEnum entretenimiento){
divertirse.entretenerseCon(entretenimiento, this);
}

public void irAlBaño(){
    popo.evacuar(this);
}

public boolean isLive() {
    return isLive;
}

public int getId () {
    return this.id;
}

public String getNombre () {
    return nombre;
}

   
public LocalDateTime getFechaNacimiento () {
    return fechaNacimiento;
}

public LocalDateTime getFechaMuerte () {
    return fechaMuerte;
               
}

public int getNivelEnergia () {
    return nivelEnergia;
}

public int getNivelHambre () {
    return nivelHambre;
}

public int getNivelCansancio () {
    return nivelCansancio;
}

public int getNivelFelicidad () {
    return nivelFelicidad;
}

public int getNivelAburrimiento () {
    return nivelAburrimiento;
}

public String getPropietario () {
    return propietario;
}

public int getNivelhambre() {
    return nivelHambre;
}    
    
public int getComidasIngeridas() {
    return comidasIngeridas;
}

public HacerPopo getPopo() {
    return popo;
}

private void setNombre (String nombre) {
    this.nombre = nombre;
}

private void setFechaNacimiento (LocalDataTime fechaNacimiento) {
        LocalDataTime setFechaNacimiento = fechaNacimiento;
}

private void setFechaMuerte (LocalDataTime fechaMuerte) {
       LocalDataTime setFechaMuerte = fechaMuerte;
}

public void setLive (boolean live) {
    isLive = live;
}

public void setNivelEnergia (int nivelEnergia, int energiaAportada) {
    this.nivelEnergia = nivelEnergia;
    Math.min(energiaAportada, 100);
}

public  Mascota (int nivelHambre) {
    this.nivelHambre = nivelHambre;
}

private void setNivelCansancio (int nivelCansancio) {
    this.nivelCansancio = nivelCansancio;
}

private void setNivelFelicidad (int nivelFelicidad) {
    this.nivelFelicidad = nivelFelicidad;
}

public void setNivelAburrimiento (int nivelAburrimiento) {
    this.nivelAburrimiento = Math.max(nivelAburrimiento, 0);
    
}

private void setPropietario (String propietario) {
    this.propietario = propietario;
}

public void setNivelEnergia(int nivelEnergia) {
       this.nivelEnergia = Math.min(Math.max(nivelEnergia, 0), 100);
}
    
public void setIsLive(boolean b) {
        
}

public void setId(int id) {
    this.id = id;
}

public void setNivelHambre(int nivelHambre) {
    this.nivelHambre = nivelHambre;
}
    
public void setComidasIngeridas(int comidasIngeridas) {
    this.comidasIngeridas = comidasIngeridas;
}

public  Mascota() {
    this.nivelHambre = nivelHambre; 
}

private static class LocalDataTime {

    public LocalDataTime() {
    }
}

private static class fechaNacimiento {

    public fechaNacimiento() {
    }
}

}




