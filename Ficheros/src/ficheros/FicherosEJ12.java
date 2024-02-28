package ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FicherosEJ12 {

    public static void main(String[] args) {

        BufferedInputStream bentrada = null;
        BufferedOutputStream bsalida = null;

        final int SIZE = 1080 * 32;

        try {
            //Buffer que lee una imagen que se encuentra en la raiz del proyecto
            bentrada = new BufferedInputStream(new FileInputStream("unnamed.jpg"));
            bsalida = new BufferedOutputStream(new FileOutputStream("copia.jpg"));

            int cantidadBytes = 0; //Esta variable va a guardar numero de bytes reales que ocupa el fichero
            byte[] buffer = new byte[SIZE];
            //read(buffer que se va a ir leyendo/rellenando, comienzo, final)
            while ((cantidadBytes = bentrada.read(buffer, 0, SIZE)) != -1) {
                bsalida.write(buffer, 0, cantidadBytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (bentrada != null)
				try {
                bentrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (bsalida != null)
			try {
            bsalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
