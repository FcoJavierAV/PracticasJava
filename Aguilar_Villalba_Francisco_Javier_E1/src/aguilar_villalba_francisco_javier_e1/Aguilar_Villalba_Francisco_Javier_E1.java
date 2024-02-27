package aguilar_villalba_francisco_javier_e1;

import java.util.Scanner; /*Importamos la utilidad Scanner para que funcione y se ejecute de manera adecuada*/

/**
 *
 * @author Francisco Javier Aguilar Villalba 1B DAM
 */
public class Aguilar_Villalba_Francisco_Javier_E1 {

    public static void main(String[] args) {

        int edad = 0;
        /*Añadimos la variable edad y la inicializamos a 0*/
        int num = 0;
        /*Añadimos la variable num y la inicializamos a 0*/
        int resultado = 0;
        /*Añadimos la variable resultado y la inicializamos a 0*/
        int dinero = 0;
        /*Añadimos la variable edad y la inicializamos a 0*/
        double precio = 0;
        /*Añadimos la variable precio, la inicializamos a 0 y
        tiene que ser double ya que en la oferta hay posibilidad de tener números con decimales*/
        Scanner scan = new Scanner(System.in);
        /*Añadimos un scanner para recoger lo que el usuario meta por teclado*/

        do {
            /*Realizamos un bucle do while al no saber cuantas veces se va a ejecutar nuestro código,
            pero al menos sabemos con toda seguridad que se tiene que ejecutar al menos 1 vez*/

 /*Añdimos todo el menú que siempre tiene que mostrarse al usuario si o si*/
            System.out.println("Bolera 1ºB DAM");
            System.out.println("===============");
            System.out.println("1-Vender ticket");
            System.out.println("2-Resumen");
            System.out.println("3-Salir");

            System.out.print("opción? ");
            /*Pedimos una de las opciones que le hemos propuesto*/
            num = scan.nextInt();
            /*Rrecogemos esa opcion*/

            switch (num) {
                /*Realizamos un switch para comtemplar todas las opciones que meta el usuario, en este caso son números**/

                case 1:
                    /*En el caso 1 le damos la información de que su ticket se está creando  y le dará un precio según su edad*/
                    System.out.println("Generando ticket...");
                    System.out.print("Edad? ");
                    /*Pedimos la edad**/
                    edad = scan.nextInt();
                    /*Acotamos el rango de edades que nos piden con if else if y le indicamos cuanto sale su entrada ya que si no es una edad es otra**/
                    /*A cada edad le asigamos un valor de lo que tiene que pagar*/
                    if (edad < 5) {
                        precio = 1; 
                        System.out.println("---------------------------");
                        System.out.println("TICKET DE ENTRADA");
                        System.out.println("Edad: " + edad);
                        System.out.println("Total a pagar: " + precio + "€");
                        System.out.println("---------------------------");

                    } else if (edad > 5 && edad <= 14) {
                        precio = 8.25;
                        System.out.println("---------------------------");
                        System.out.println("TICKET DE ENTRADA");
                        System.out.println("Edad: " + edad);
                        System.out.println("Total a pagar: " + precio + "€");
                        System.out.println("---------------------------");

                    } else if (edad > 14 && edad < 55) {
                        precio = 11;
                        System.out.println("---------------------------");
                        System.out.println("TICKET DE ENTRADA");
                        System.out.println("Edad: " + edad);
                        System.out.println("Total a pagar: " + precio + "€");
                        System.out.println("---------------------------");

                    } else if (edad >= 55 && edad <= 70) {
                        precio = 8.25;
                        System.out.println("---------------------------");
                        System.out.println("TICKET DE ENTRADA");
                        System.out.println("Edad: " + edad);
                        System.out.println("Total a pagar: " + precio + "€");
                        System.out.println("---------------------------");

                    } else if (edad > 70) {
                        precio = 0;
                        System.out.println("---------------------------");
                        System.out.println("TICKET DE ENTRADA");
                        System.out.println("Edad: " + edad);
                        System.out.println("Total a pagar: " + precio + "€");
                        System.out.println("---------------------------");
                    }
                    resultado++;
                    /**
                     * Sumamos cada ticket que generamos añadiendo la variable
                     * resultado*
                     */
                    dinero += precio;
                    /**
                     * Sumamos y controlamos el dinero de la caja añadiendo la
                     * variable dinero y sumandole cada vez que se genere un ticket nuevo*
                     */

                    break;

                case 2:
                    /*Caso de conteo de ventas y sacamos por pantalla lo que recogen las variables dinero y resultado*/
                    System.out.println("RESUMEN DE VENTAS");
                    System.out.println("---------------------------");
                    System.out.println(resultado + " Tickets vendidos");
                    System.out.println(dinero + "€ recaudados en caja");
                    System.out.println("---------------------------");

                    break;

                case 3:

                    System.out.println("Saliendo...");
                    /**
                     * Salimos del programa y termina*
                     */

                    break;

                default:
                    /*Añadimos un default para asegurarnos de que en caso contrario 
                    a que el usuario no introduzca un número del 1 al 3 le vuelva  
                    a pedir otra opción y diga que se ha equivocado*/

                    System.out.println("---------------------------");
                    System.out.println("ERROR: opcion incorrecta.");
                    System.out.println("---------------------------");

                    break;
            }

        } while (num != 3);
        /**
         * El bucle termina cuando el usuario introduce el número 3 y en caso
         * contrario sigue ejecutandose*
         */
    }

}
