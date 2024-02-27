package Ejercicio93;

public class Guerrero {
    
    private String nombre;
    private int salud;
    private int atck;
    private int shld;
    private final int SaludMAX;
    boolean vivo; //T está vivo F está muerto
    
    
    public Guerrero(String nombre, int salud, int atck, int shld, Arma tipo){
    
        this.nombre = nombre;
        this.salud = salud;
        this.atck = atck;
        this.shld = shld;
        this.vivo = true;
        this.SaludMAX = 100;
        //tipo = this.Arma.class;
    
}
    public int Atacar(int atck){
        
        /*if(){
            
            
            
        }*/
        this.atck = atck;
        
        return this.atck;
    }
    
    public String toString(){
    
    String res="";
        
    return res;
}
    
    
}
