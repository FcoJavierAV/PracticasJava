package ficheros;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FicherosEj7 {

    public static void main(String[] args) {

        FileInputStream fin = null;
        OutputStream fout = null;

        try {

            fout = new FileOutputStream("fichero.dat");

            for (int i = 0; i < 100; i++) {
                fout.write(i);
            }

            fin = new FileInputStream("fichero.dat");

            int valor;

            while ((valor = fin.read()) != -1) {
                System.out.println(valor);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}
