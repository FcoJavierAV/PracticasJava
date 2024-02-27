
package Ejercicios2;

import java.util.Scanner;

public class Aguilar_Villalba_FcoJavier_Ej3 {

    public static void main(String[] args) {
        
        int num = 0;
        int suma = 0;
        int tmp = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dame un numero entero: ");
        num = teclado.nextInt();

        if (num != 0) {

            for (int i = 1; i < 10; i++) {

                tmp = (int) ((Math.pow(num, i) / i));

                suma = tmp + suma;
            }

        } else {
            System.out.println("El numero tiene que ser distinto de 0 y entero");
        }
        System.out.println("La suma del polinomio es: " + suma);
    }

}  
