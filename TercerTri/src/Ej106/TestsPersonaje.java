

package Ej106;


public class TestsPersonaje {

   
    public static void main(String[] args) {
        
        Habilidad pepe = new Habilidad("Ulti",'a');
        Habilidad otro = new Habilidad("Gancho",'r');
        Minion Manolo = new Minion("Garrid",0 , 0 ,10, 30, 40, pepe, "Mago");
        Campeon Mol = new Campeon("Jynx",4 , 0 ,30, 10, 60, otro, 50, "Carry", 4);
        

        System.out.println(Manolo);
        System.out.println(Mol);
        
        Mol.atacar(Manolo);
        Mol.subirNivel(pepe);
        
        System.out.println(Mol);
        
        Mol.desplazarse(-7, 7);
        
        System.out.println(Mol);
         
    }

}
