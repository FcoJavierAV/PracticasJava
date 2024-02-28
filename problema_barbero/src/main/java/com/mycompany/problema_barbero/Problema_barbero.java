/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problema_barbero;

/**
 *
 * @author Dani
 */
public class Problema_barbero {

    public static void main(String[] args) {
        Barberia barberia = new Barberia();
        
        Barbero barbero = new Barbero(barberia);
        Cliente cliente1 = new Cliente(1, 0, barberia);
        Cliente cliente2 = new Cliente(2, 1000, barberia);
        Cliente cliente3 = new Cliente(3, 2000, barberia);
        Cliente cliente4 = new Cliente(4, 3000, barberia);
        Cliente cliente5 = new Cliente(5, 4000, barberia);
        
        barbero.start();
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();
        
        barbero.noHayMasClientes();
    }
}
