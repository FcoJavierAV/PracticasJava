package ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class FicherosEJ6 {

    public static void main(String[] args) throws IOException {

        File fichero = new File("Ejercicio6.txt");
        FileWriter escritor = new FileWriter(fichero);
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        String menu;

        do {

            System.out.println("Seleccione una de las siguientes opciones: Crear, Leer o Salir)");
            menu = scan.nextLine();

            switch (menu.toLowerCase()) {

                case "crear":

                    System.out.println("Introduce Nombre:");
                    escritor.write(sc.nextLine() + " ");

                    System.out.println("Introduce Aficion:");
                    escritor.write(sc.nextLine() + " ");

                    System.out.println("Introduce Edad");
                    escritor.write(sc.next() + "\n");

                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Fichero escrito correctamente");
                    System.out.println("--------------------------------------------------------------");
                    escritor.close();

                    break;

                case "leer":

                    Reader lector = new FileReader(fichero);
                    BufferedReader br = new BufferedReader(lector);

                    String linea;
                    while ((linea = br.readLine()) != null) {
                        System.out.println(linea);
                    }

                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Lectura de fichero finalizada");
                    System.out.println("--------------------------------------------------------------");
                    lector.close();
                    br.close();

                    break;

                case "salir":
                    System.exit(0);
                    break;

                default:
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Opción incorrecta.");
                    System.out.println("--------------------------------------------------------------");
            }
        } while (!menu.equals("salir"));

        escritor.close();

    }

}
