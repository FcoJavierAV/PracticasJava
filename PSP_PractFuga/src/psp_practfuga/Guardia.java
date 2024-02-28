package psp_practfuga;

import psp_practfuga.tablero;

public class Guardia extends Thread {

    private static Posiciones posicion;
    tablero tablero = null;

    public Guardia(int posX, int posY) {
        this.posicion = new Posiciones(posX, posY);
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    @Override
    public void run() {

        try {
            tablero.moverGuardia();
            tablero.cargarGuardia();
            System.out.println("Guardia se esta moviendo");
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
