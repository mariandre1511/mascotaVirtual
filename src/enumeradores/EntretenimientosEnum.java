package enumeradores;

public enum EntretenimientosEnum {
    
    PERINOLA (15), POKER (10), BAILAR (20), LEER (25), PASEAR (30);
    
    private int desaburrimiento;
    
    EntretenimientosEnum (int desaburrimiento){
        this.desaburrimiento = desaburrimiento;
    }
    
    public int getDesaburrimiento(){
        return this.desaburrimiento;
    }
}
