
package Herencia.Ej104;

public class Asignatura {

    protected int numHoras;
    private int codAsig;
    
    public Asignatura (int numHoras, int codAsig){
        
        this.codAsig = (int) (Math.round(Math.random() * (200 - 100 + 1) + 100 ));
        this.numHoras = (int) (Math.round(Math.random() * ( 8 - 3 + 1) + 3 ));
        
    }
    
    @Override
    public String toString(){
        
        return "a"; 
        
    }

    public int getNumHoras() {
        return numHoras;
    }

    public int getCodAsig() {
        return codAsig;
    }
    
}
