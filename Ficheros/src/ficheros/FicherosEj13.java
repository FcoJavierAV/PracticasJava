package ficheros;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FicherosEj13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String frase;
        String palabra;

        System.out.println("Introduce una frase:");
        frase = scan.nextLine();

        int contador = 0;
        System.out.println("Palabra que desea buscar:");
        palabra = scan.nextLine();

        StringTokenizer pedazo = new StringTokenizer(frase);

        while (pedazo.hasMoreTokens()) {
            if (pedazo.nextElement().equals(palabra)) {
                contador++;
            }
        }
        if (contador == 1) {
            System.out.println("la palabra " + palabra + " aparece " + contador + " vez");
        } else {
            System.out.println("la palabra " + palabra + " aparece " + contador + " veces");
        }

    }

}
