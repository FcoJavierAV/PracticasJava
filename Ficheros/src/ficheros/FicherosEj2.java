package ficheros;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class FicherosEj2 {

    public static void main(String[] args) {

        try {

            Scanner scan = new Scanner(System.in);
            System.out.println("Introduce un nombre de fichero:");
            String teclado = scan.nextLine();
            
            Reader Lector = new FileReader(teclado);
           
            int i;
            
            while((i = Lector.read()) !=-1){
                if((char)i != ' '){
                System.out.print((char)i);
            }
            }
            
            

            Lector.close();

        } catch (IOException e) {

        }

    }

}
