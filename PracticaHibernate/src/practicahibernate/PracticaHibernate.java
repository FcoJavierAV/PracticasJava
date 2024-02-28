

package practicahibernate;

import java.util.Scanner;


public class PracticaHibernate {

    
    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);
        //Declaramos un scanner para leer de teclado
        String menu = "";
        /*Declaramos la variable menu, que nos servirá para controlar
        que opción elije el usuario y la inicializamos*/
        iniciarSesionHibernate();
        do {
            System.out.println("Elija una opcion:\n1.Insertar objeto\n"
                    + "2.Actualizar los objetos.\n"
                    + "3.Consulta de objetos.\n"
                    + "4.Borrar los objetos.\n"
                    + "5.Salir");
            //Mostramos por pantalla las distintas opciones al usuario
            menu = sc.next();
            //Leemos la opcion introducida por el usuario de teclado.
            switch (menu) {
                case "1":
                    insertarObjetos();
                    break;
                case "2":
                    actualizarObjetos();
                    break;
                case "3":
                    buscarObejtos();
                    break;
                case "4":
                    elimianrObjetos();
                    break;
                case "5":
                    System.out.println("Saliendo del sistema...");
                    /*En caso de que el usuario decida dejar de usar la aplicacion
                    seleccionando esta opcion podrá hacerlo*/
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    /*Mediante el default nos encargamos de mostrarle al usuario
                    un mensaje de error para que sea conocedor de que el valor que ha
                    introducido por teclado es incorrecto.*/
                    break;
            }

        } while (!menu.equals("5"));
        /*Si el numero introducido es 5 salimos del bucle
        finalizando así el programa*/
        
    }

    private static void iniciarSesionHibernate() {
        
    }

    private static void insertarObjetos() {
        
    }

    private static void actualizarObjetos() {
        
    }

    private static void buscarObejtos() {
        
    }

    private static void elimianrObjetos() {
        
    }

}
