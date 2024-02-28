package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FicherosEj4 {

    public static void main(String[] args) throws FileNotFoundException,  IOException {

        File fichero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta del fichero:");
        String ruta = sc.nextLine();
        fichero = new File(ruta);

        for (File file : fichero.listFiles()) {          
                System.out.println(file.getName());         
        }
    }

}


