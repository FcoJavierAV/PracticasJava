package Ejercicios_Arrays;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        int num = 0;
        int mayor = 5;
        int menor = 106;
        int posicionMayor = 0;
        int posicionMenor = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        num = teclado.nextInt();

        if (num > 0) {
            int lista[] = new int[num];
            System.out.println("El array generado es: ");
            for (int i = 0; i < lista.length; i++) {

                int ale = (int) (Math.round(Math.random() * (105 - 5) + 5));
                lista[i] = ale;
                System.out.print("" + lista[i] + " ");

                if (lista[i] > mayor) {
                    mayor = lista[i];
                }
                if (lista[i] < menor) {
                    menor = lista[i];
                }

            }
            for (int j = 0; j < lista.length; j++) {

                if (lista[j] == mayor) {
                    posicionMayor++;
                }
                if (lista[j] == menor) {
                   posicionMenor++;
                }
                
            }

            System.out.println("");

        } else {
            System.out.println("Error El numero deber ser mayor a 0");
        }
        System.out.println("El valor máximo es el " + mayor + " y aparece " + posicionMayor + " veces");
        System.out.println("El valor mínimo es el " + menor + " y aparece " + posicionMenor + " veces");
    }

}
