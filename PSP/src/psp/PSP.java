package psp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PSP {

    private static String letra;
    private static char Tablero[][];
    private static int playerX;
    private static int playerY;
    private static int unX;
    private static int unY;
    private static int Pasx;
    private static int Pasy;
    private static int unX2;
    private static int unY2;
    private static int unX3;
    private static int unY3;
    private static int x;
    private static int y;
    private static int Ax;
    private static int Ay;

    private static Herramienta alicate;
    private static Herramienta pasaporte;
    private static Herramienta uniforme;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu = 0;
        alicate = new Herramienta('U');

        try {
            do {
                System.out.println("Elija una dificultad:\n"
                        + "1.Fácil\n"
                        + "2.Media\n"
                        + "3.Difícil.\n"
                        + "4.Salir");
                //Mostramos por pantalla las distintas opciones al usuario
                menu = sc.nextInt();
                //Leemos la opcion introducida por el usuario de teclado.
                switch (menu) {
                    case 1:
                        //Creamos el tablero y colocamos las piezas
                        crearTablero();
                        //Seleccionamos el numero de guardias dependiendo de la dificultad 
                        modoFacil();
                        //Iniciamos el movimiento del personaje mediante AWSD
                        flechas();
                        break;
                    case 2:
                        //Creamos el tablero y colocamos las piezas
                        crearTablero();
                        //Seleccionamos el numero de guardias dependiendo de la dificultad 
                        modoMedio();
                        //Iniciamos el movimiento del personaje mediante AWSD
                        flechas();
                        break;
                    case 3:
                        //Creamos el tablero y colocamos las piezas
                        crearTablero();
                        //Seleccionamos el numero de guardias dependiendo de la dificultad 
                        modoDificil();
                        //Iniciamos el movimiento del personaje mediante AWSD
                        flechas();
                        break;
                    case 4:
                        System.out.println("Saliendo del juego");
                        /*En caso de que el usuario decida dejar de usar la aplicacion
                                seleccionando esta opcion podrá hacerlo*/
                        break;
                    default:
                        System.out.println("--------------------");
                        System.out.println("Opción " + menu + " incorrecta");
                        break;
                }
                System.out.println("--------------------");
            } while (menu != 4);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR POSICION FUERA DE RANGO");
        } catch (NullPointerException e) {
            System.out.println("ERROR POSICIÓN NO VALIDA");
        } catch (InputMismatchException e) {
            //Controlamos que el usuario no meta letras en lugar de numeros System
            System.out.println("ERROR NO PUEDE ESCRIBIR LETRAS AQUÍ");
        } catch (Exception e) {
            //Error general
            System.out.println("ERROR GENERAL: " + e.getMessage());
        }

    }

    //Métodos  
    public static void modoFacil() {
        dificultad(1);
        mostrarTablero();
    }

    public static void modoMedio() {
        dificultad(2);
        mostrarTablero();
    }

    public static void modoDificil() {
        dificultad(3);
        mostrarTablero();
    }

    public static void dificultad(int modo) {
        //Selección de dificultad: modo el cual seleccionas cuantos guardias hay 
        switch (modo) {
            case 1:
                colocaGuardia(1);

                break;
            case 2:
                colocaGuardia(1);

                break;
            case 3:
                colocaGuardia(1);

                break;
        }

    }

    public static void mostrarTablero() {
        //Se muestra el tablero de juego
        for (int i = 0; i < Tablero.length; i++) {
            for (int j = 0; j < Tablero[i].length; j++) {
                System.out.print(Tablero[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }

    public static void crearTablero() {
        Tablero = new char[10][10];
        //Creamos el tablero de juego
        for (int i = 0; i < Tablero.length; i++) {
            for (int j = 0; j < Tablero[i].length; j++) {
                Tablero[i][j] = 'X';
            }
        }
        colocarPiezas();
    }

    public static void colocarPiezas() {
        player();
        alicates();
        uniforme();
        pasaporte();
    }

    public static void moverPersonaje(String letra) {
        switch (letra) {
            case "W":
                Tablero[playerX][playerY] = 'X';
                playerX = playerX - 1;
                if (playerX < 0) {
                    playerX = 0;
                } else {
                    Tablero[playerX][playerY] = 'O';
                }

                mostrarTablero();
                break;
            case "D":
                Tablero[playerX][playerY] = 'X';
                playerY = playerY + 1;
                if (playerY > 9) {
                    playerY = 9;
                } else {
                    Tablero[playerX][playerY] = 'O';
                }
                mostrarTablero();
                break;
            case "A":
                Tablero[playerX][playerY] = 'X';
                playerY = playerY - 1;
                if (playerY < 0) {
                    playerY = 0;
                } else {
                    Tablero[playerX][playerY] = 'O';
                }
                mostrarTablero();
                break;
            case "S":
                Tablero[playerX][playerY] = 'X';
                playerX = playerX + 1;
                if (playerX > 9) {
                    playerX = 9;
                } else {
                    Tablero[playerX][playerY] = 'O';
                }
                mostrarTablero();
                break;
        }
    }

    public static void flechas() {
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mueve al personaje con AWSD, para salir presione Q");
        letra = sc.next();
        while (!letra.toUpperCase().equals("Q") && contador != 30) {
            moverPersonaje(letra.toUpperCase());
            contador++;
            if (Tablero[playerX][playerY] == Tablero[Pasx][Pasy] || Tablero[playerX][playerY] == Tablero[unX][unY] || Tablero[playerX][playerY] == Tablero[x][y]) {
                prueba();
            }
            System.out.println("--------------------");
            System.out.println("Número de movimientos: " + contador);
            System.out.println("--------------------");
            letra = sc.next();
        }
    }

    public static void prueba() {
        int respuesta = (int) (Math.floor(Math.random() * 2));
        String[] prueba = new String[]{"piedra", "papel", "tijeras"};
        String res;
        Scanner sc = new Scanner(System.in);

        System.out.println("Jugemos a piedra, papel o tijeras");
        res = sc.next();
        String nuestraEleccion = prueba[respuesta];

        switch (res.toLowerCase()) {
            case "piedra":
                if (nuestraEleccion.equalsIgnoreCase(res)) {
                    System.out.println("Empate");
                    noWin();
                    mostrarTablero();
                } else if (!nuestraEleccion.equalsIgnoreCase(res) && prueba[1].equalsIgnoreCase(nuestraEleccion)) {
                    System.out.println("¡¡Has perdido!!");
                    noWin();
                    mostrarTablero();

                } else if (!nuestraEleccion.equalsIgnoreCase(res) && prueba[2].equalsIgnoreCase(nuestraEleccion)) {
                    System.out.println("¡¡¡Has ganado!!!");
                    mostrarTablero();
                }
                break;
            case "papel":
                if (nuestraEleccion.equalsIgnoreCase(res)) {
                    System.out.println("Empate");
                    noWin();
                    mostrarTablero();
                } else if (!nuestraEleccion.equalsIgnoreCase(res) && prueba[2].equalsIgnoreCase(nuestraEleccion)) {
                    System.out.println("¡¡Has perdido!!");
                    noWin();
                    mostrarTablero();
                } else if (!nuestraEleccion.equalsIgnoreCase(res) && prueba[0].equalsIgnoreCase(nuestraEleccion)) {
                    System.out.println("¡¡¡Has ganado!!!");
                    mostrarTablero();

                }
                break;
            case "tijeras":
                if (nuestraEleccion.equalsIgnoreCase(res)) {
                    System.out.println("Empate");
                    noWin();
                    mostrarTablero();
                } else if (!nuestraEleccion.equalsIgnoreCase(res) && prueba[0].equalsIgnoreCase(nuestraEleccion)) {
                    System.out.println("¡¡Has perdido!!");
                    noWin();
                    mostrarTablero();
                } else if (!nuestraEleccion.equalsIgnoreCase(res) && prueba[1].equalsIgnoreCase(nuestraEleccion)) {
                    System.out.println("¡¡¡Has ganado!!!");
                    mostrarTablero();
                }
                break;
            default:
                System.out.println("Esta opción no es correcta.");
                mostrarTablero();
                break;
        }
    }

    public static boolean huecoDisponible(int posX, int posY) {
        if (Tablero[posX][posY] == 'X') {
            return true;
        }
        return false;
    }

    public static void noWin() {
        if (Tablero[playerX][playerY] == Tablero[Pasx][Pasy]) {

            int aleX = (int) (Math.floor(Math.random() * 9));
            int aleY = (int) (Math.floor(Math.random() * 9));
            Tablero[aleX][aleY] = 'O';
            Tablero[playerX][playerY] = 'P';
            playerX = aleX;
            playerY = aleY;

        } else if (Tablero[playerX][playerY] == Tablero[unX][unY]) {

            int aleX = (int) (Math.floor(Math.random() * 9));
            int aleY = (int) (Math.floor(Math.random() * 9));
            Tablero[aleX][aleY] = 'O';
            Tablero[playerX][playerY] = 'U';
            playerX = aleX;
            playerY = aleY;

        } else if (Tablero[playerX][playerY] == 'A') {

            int aleX = (int) (Math.floor(Math.random() * 9));
            int aleY = (int) (Math.floor(Math.random() * 9));
            Tablero[aleX][aleY] = 'O';
            Tablero[playerX][playerY] = 'A';
            playerX = aleX;
            playerY = aleY;
        }
    }

    public static void alicates() {

        int posA = (int) (Math.floor(Math.random() * 2) + 1);
        x = (int) (Math.floor(Math.random() * 9));
        y = (int) (Math.floor(Math.random() * 9));
        alicate.pos.add(new Posiciones(x, y));
        while (huecoDisponible(x, y)) {
            //Ya que los alicates pueden aparecer tanto horizontal como vertial. Esto lo genera así
            if (posA == 1) {

                for (int k = 0; k < 2; k++) {
                    Tablero[x][y] = 'A';
                    Tablero[x][y - 1] = 'A';
                    alicate.pos.add(new Posiciones(x, y - 1));
                }

            } else if (posA == 2) {

                for (int k = 0; k < 2; k++) {
                    Tablero[x][y] = 'A';
                    if (x < 10 & y < 10) {
                        int tmp = x + 1;
                        Tablero[tmp][y] = 'A';
                        alicate.pos.add(new Posiciones(tmp, y));
                    }

                }

            }
        }
    }

    public static void uniforme() {

        unX = (int) (Math.floor(Math.random() * 9));
        unY = (int) (Math.floor(Math.random() * 9));
        while (huecoDisponible(unX, unY)) {
            //Colocamos la prima u de manera aleatoria y en base a ello se decide como va a ir de manera aletoria
            Tablero[unX][unY] = 'U';

            int rand = (int) (Math.floor(Math.random() * 2) + 1);
            //Se decide si se colocan en horizontal o en vertical
            if (rand == 1) {
                int ver = unX + 1;
                int ver2 = ver + 1;
                if (ver < 10) {
                    ver = unX2;
                    Tablero[ver][unY] = 'U';
                } else {
                    Tablero[unX - 1][unY] = 'U';
                }
                if (ver2 < 10) {
                    ver2 = unX3;
                    Tablero[ver2][unY] = 'U';
                } else {
                    Tablero[unX - 1][unY] = 'U';
                }

            } else if (rand == 2) {
                int hor = unY + 1;
                int hor2 = hor + 1;
                if (hor < 10) {
                    unY2 = hor;
                    Tablero[unX][hor] = 'U';
                } else {
                    Tablero[unX][unY - 1] = 'U';
                }
                if (hor2 < 10) {
                    unY3 = hor2;
                    Tablero[unX][hor2] = 'U';
                } else {
                    Tablero[unX][unY - 1] = 'U';
                }
            }
        }

    }

    public static void pasaporte() {

        Pasx = (int) (Math.floor(Math.random() * 9));
        Pasy = (int) (Math.floor(Math.random() * 9));
        while (!huecoDisponible(Pasx, Pasy)) {
            //pasaporte.pos.add(new Posiciones(Pasx, Pasy));
            Tablero[Pasx][Pasy] = 'P';

        }
    }

    public static void colocaGuardia(int numeroG) {
        for (int i = 0; i < numeroG; i++) {
            int Gx1 = (int) (Math.floor(Math.random() * 9) + 1);
            int Gy1 = (int) (Math.floor(Math.random() * 9) + 1);
            Tablero[Gx1][Gy1] = 'G';
        }
    }

    public static void player() {
        //Coloca a un jugador      
        playerX = (int) (Math.floor(Math.random() * 9));
        playerY = (int) (Math.floor(Math.random() * 9));
        while (huecoDisponible(playerX, playerY)) {
            Tablero[playerX][playerY] = 'O';

        }

    }

}
