package ficheros;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class FicherosEj9 {

    static RandomAccessFile f = null;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)throws FileNotFoundException, IOException {

        try {
            f = new RandomAccessFile("numeros.dat", "rw");
            int num;

            f.seek(0);

            int unByte = f.read();
            System.out.println((char) unByte);

            System.out.print("Introduce un número entero para añadir al final del fichero: ");
            num = sc.nextInt();
            f.seek(f.length());
            f.writeInt(num);

            mostrarFichero();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void mostrarFichero() {
        try {
            int n;
            f.seek(0);
            while (true) {
                n = f.readInt();
                System.out.println(n);
            }
        } catch (IOException e) {

        }
    }

}


