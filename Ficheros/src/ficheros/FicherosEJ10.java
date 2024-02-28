package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FicherosEJ10 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File fichero1 = new File("fichero1.txt");
        File fichero2 = new File("fichero2.txt");
        File mezcla = new File("mezcla.txt");

        if (args.length != 3) {
            System.exit(0); 
        }
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(fichero1));
            BufferedReader br2 = new BufferedReader(new FileReader(fichero2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(mezcla));

            String linea1 = "";
            String linea2 = "";

            while ((linea1 != null) || (linea2 != null)) {
                linea1 = br1.readLine();
                linea2 = br2.readLine();

                if (linea1 != null) {
                    bw.write(linea1 + "\n");
                }

                if (linea2 != null) {
                    bw.write(linea2 + "\n");
                }
            }

            br1.close();
            br2.close();
            bw.close();

        } catch (IOException e) {
            System.out.println("ERROR");
            System.err.println(e.getMessage());
        }
    }

}
