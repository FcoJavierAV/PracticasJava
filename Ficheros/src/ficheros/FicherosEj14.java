package ficheros;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Scanner;

public class FicherosEj14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.println("Introduce una frase que contenga numeros y palabras");
        frase = sc.nextLine();

        StreamTokenizer trozo = new StreamTokenizer(new StringReader(frase));
        int contadorNum = 0;
        int contadorPalabras = 0;
        int contadorOtro = 0;

        try {
            do {
                if (trozo.ttype == StreamTokenizer.TT_WORD) {
                    System.out.println("Palabra: " + trozo.sval);
                    contadorPalabras++;
                } else if (trozo.ttype == StreamTokenizer.TT_NUMBER) {
                    System.out.println("Número: " + trozo.nval);
                    contadorNum++;
                    //Si finaliza el fichero
                } else if (trozo.ttype == StreamTokenizer.TT_EOL) {
                    System.out.println();
                } else{
                    System.out.println("Otro caracter: " + trozo.toString());
                    contadorOtro++;
                }
            } while (trozo.nextToken() != StreamTokenizer.TT_EOF);

            System.out.println("Hay " + contadorPalabras + " palabras " + contadorNum + " numeros y otro caracter " + contadorOtro);

        } catch (IOException e) {
            System.out.println("ERROR");
        }

    }

}
