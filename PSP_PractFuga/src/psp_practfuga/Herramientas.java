package psp_practfuga;

import java.util.ArrayList;

enum Herramienta {
    Alicates, Pasaporte, Uniforme
}

public class Herramientas {

    private Herramienta herramienta;
    private int posXHerramienta1;
    private int posYHerramienta1;
    private int posXHerramienta2;
    private int posYHerramienta2;
    private int posXHerramienta3;
    private int posYHerramienta3;
    private Posiciones posicion1 = new Posiciones(posXHerramienta1, posYHerramienta1);
    private Posiciones posicion2 = new Posiciones(posXHerramienta2, posYHerramienta2);
    private Posiciones posicion3 = new Posiciones(posXHerramienta3, posYHerramienta3);
    private ArrayList<Posiciones> posiciones = new ArrayList<Posiciones>();

    public Herramientas(Herramienta name) {
        this.herramienta = name;
        if (name.equals(name.Pasaporte)) {
            posiciones.add(posicion1);
        } else if (name.equals(name.Alicates)) {
            posiciones.add(posicion1);
            posiciones.add(posicion2);
        } else {
            posiciones.add(posicion1);
            posiciones.add(posicion2);
            posiciones.add(posicion3);
        }
    }

    public Herramienta getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(Herramienta herramienta) {
        this.herramienta = herramienta;
    }

    public int getPosXHerramienta1() {
        return posXHerramienta1;
    }

    public void setPosXHerramienta1(int posXHerramienta1) {
        this.posXHerramienta1 = posXHerramienta1;
    }

    public int getPosYHerramienta1() {
        return posYHerramienta1;
    }

    public void setPosYHerramienta1(int posYHerramienta1) {
        this.posYHerramienta1 = posYHerramienta1;
    }

    public Posiciones getPosicion1() {
        return posicion1;
    }

    public void setPosicion1(Posiciones posicion1) {
        this.posicion1 = posicion1;
    }

    public Posiciones getPosicion2() {
        return posicion2;
    }

    public void setPosicion2(Posiciones posicion2) {
        this.posicion2 = posicion2;
    }

    public Posiciones getPosicion3() {
        return posicion3;
    }

    public void setPosicion3(Posiciones posicion3) {
        this.posicion3 = posicion3;
    }

    public ArrayList<Posiciones> getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(ArrayList<Posiciones> posiciones) {
        this.posiciones = posiciones;
    }

    public int getPosXHerramienta2() {
        return posXHerramienta2;
    }

    public void setPosXHerramienta2(int posXHerramienta2) {
        this.posXHerramienta2 = posXHerramienta2;
    }

    public int getPosYHerramienta2() {
        return posYHerramienta2;
    }

    public void setPosYHerramienta2(int posYHerramienta2) {
        this.posYHerramienta2 = posYHerramienta2;
    }

    public int getPosXHerramienta3() {
        return posXHerramienta3;
    }

    public void setPosXHerramienta3(int posXHerramienta3) {
        this.posXHerramienta3 = posXHerramienta3;
    }

    public int getPosYHerramienta3() {
        return posYHerramienta3;
    }

    public void setPosYHerramienta3(int posYHerramienta3) {
        this.posYHerramienta3 = posYHerramienta3;
    }
    
}
