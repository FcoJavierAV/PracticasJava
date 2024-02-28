package psp_practfuga;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaHilos {

    public static void main(String[] args) {

        Guardia guardia1 = new Guardia(5, 6); /*Controlamos las posibles excepciones*/
        guardia1.start();
        System.out.println("Final del programa");
        /*Le indicamos al usuario por pantalla que el programa ha finalizado*/
        System.out.println("Final del programa");

    }

}
