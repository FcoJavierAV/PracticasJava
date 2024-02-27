
package pruebaticket;

import java.util.Scanner;


public class Pruebaticket {

    public static void main(String[] args) {
        
        
        int edad = 0;
        Scanner teclado = new Scanner(System.in);
      
        
       do{
           
                   System.out.print("Introduzca la edad de Rubén:");
        edad = teclado.nextInt();
        
        if(edad == 26){
            System.out.println("Rubén tiene: " + edad + " años");
        }
        else{
             System.out.println("ERROR Rubén no tiene esa edad");
        }
        System.out.println("-------------------------------");
       }while (edad !=26);

    }

}
