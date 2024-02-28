package ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class FicherosEj11 {

    public static void main(String[] args) {

    }

    public static void ArrayDeStrings(String Personas[], int Alturas[], String nombre) {
        FileWriter fichero = null;
        
        try {
            fichero = new FileWriter(nombre);
            for (int i = 0; i < Personas.length; i++) {
                fichero.write(Personas[i]);                
            }
                
            for (int i = 0; i < Alturas.length; i++) {
                fichero.write(Alturas[i]);                
            }
            
            System.out.println("Palabras insertadas correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fichero.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
