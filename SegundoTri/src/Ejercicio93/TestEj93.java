
package Ejercicio93;

public class TestEj93 {

    
    public static void main(String[] args) {
        
        Arma espada = new Arma("Espada", 20, 40);
        Arma escudo = new Arma("Escudo", 60, 7);
        
        Guerrero conan = new Guerrero("El barbaro", 100, 40, 20, espada);
        Guerrero link = new Guerrero("El Hyliano", 100, 25, 70, escudo);
        
        
        
    }
    
}
