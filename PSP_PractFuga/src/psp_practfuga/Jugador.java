package psp_practfuga;

import java.util.Scanner;

public class Jugador{
    private Posiciones posicion;
    private boolean alicates, pasaporte, uniforme; //F - no lo tiene T - lo tiene
    tablero tablero = null;
    
    public Jugador(int posX, int posY){
        this.posicion = new Posiciones(posX, posY);
        this.alicates = false;
        this.pasaporte = false;
        this.uniforme = false;
    }
    
    public boolean prueba(){
        Scanner s = new Scanner(System.in);
        String eleccion; 
        boolean resultado = false;
        int comparar = (int) (Math.round(Math.random()*3)+1); //1 - Piedra  2 - Papel  3 - Tijeras
        System.out.println("Para poder recoger la herramienta tienes que superar una prueba\nLa prueba es piedra/papel/tijeras, ¿Que eliges?");
        System.out.println("Piedra\nPapel\nTijeras");
        eleccion = s.nextLine().toLowerCase();
        switch (eleccion) {
            case "piedra":
                if(comparar==3){
                    resultado = true;
                }
                break;
            case "papel":
                if(comparar==1){
                    resultado = true;
                }
                break;
            case "tijeras":
                if(comparar==2){
                    resultado = true;
                }
                break;
            default:
                System.out.println("Elige una opcion correcta");;
        }
        return resultado;
    }
    
    
    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }


    public boolean isAlicates() {
        return alicates;
    }

    public void setAlicates(boolean alicates) {
        this.alicates = alicates;
    }

    public boolean isPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(boolean pasaporte) {
        this.pasaporte = pasaporte;
    }

    public boolean isUniforme() {
        return uniforme;
    }

    public void setUniforme(boolean uniforme) {
        this.uniforme = uniforme;
    }
    
    
}
