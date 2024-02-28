package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class FicherosEj15 {

    public static void main(String[] args) throws IOException {

        try {
            File original = new File("original.txt");
            BufferedReader br = new BufferedReader(new FileReader(original));
            LineNumberReader lr = new LineNumberReader(br);
            BufferedWriter bw = new BufferedWriter(new FileWriter("copia.txt"));

            String linea = lr.readLine();
            while (linea != null) {
                System.out.println("Línea número: " + lr.getLineNumber() + " " + linea);
                bw.write(linea + "\n");
                linea = lr.readLine();
            }
            bw.close();
            lr.close();

            BufferedReader br2 = new BufferedReader(new FileReader("copia.txt"));

            String lineaCopia;
            System.out.println("------------------------");
            System.out.println("El texto del fichero copia es: ");
            while ((lineaCopia = br2.readLine()) != null) {
                System.out.print(lineaCopia + "\n");
            }
            br.close();

        } catch (IOException e) {
            System.out.println("ERROR");
            System.out.println(e.getMessage());
        }

    }
}
