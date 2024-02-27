/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg52;

/**
 *
 * @author Javi-PC
 */
public class Ejercicio52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[] = new int[6];
        int array[] = new int[6];
        int n = 0;
        int n2 = 0;
        
        boolean encontrado = false;

        for (int i = 0; i < lista.length; i++) {
            n = 11;
            lista[i] = n;
            n2 = 1;
            array[i] = n2;

            if (lista[i] == array[i]) {
                encontrado = true;
                i = 200;
                System.out.println("Los dos arrays son iguales");
            } else {
                i = 200;
                System.out.println("Los dos arrays no son iguales");
            }
        }

    }
}
