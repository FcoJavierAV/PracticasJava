/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema_barbero;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dani
 */
public class Cliente extends Thread{
    int id;
    int sleep;
    Barberia barberia;
    
    public Cliente (int id, int sleep, Barberia barberia){
        this.id = id;
        this.sleep = sleep;
        this.barberia = barberia;
    }
    
    @Override
    public void run(){
        try {
            sleep(sleep);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        barberia.solicitarPelado();
    }
}
