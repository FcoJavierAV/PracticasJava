

package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class FicherosEj3 {

    
    public static void main(String[] args) throws IOException{
              
        int contador = 0;
        String s;
        String [] buffer;
        File fichero = new File("fichero3.txt");
        FileReader lector = new FileReader(fichero);
        BufferedReader br = new BufferedReader(lector);
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee una palabra:");
        String palabra = sc.nextLine();
        
        while((s = br.readLine()) != null){
            buffer = s.split(" ");
            for (String chr : buffer){
                if(chr.equals(palabra)){
                    contador++;
                }
            }
        }
        if(contador == 1){
            System.out.println("La palabra " + palabra + " aparece un total de " + contador + " vez");
        }
        else{
        System.out.println("La palabra " + palabra + " aparece un total de " + contador + " veces");
        } 
              
    }

}
