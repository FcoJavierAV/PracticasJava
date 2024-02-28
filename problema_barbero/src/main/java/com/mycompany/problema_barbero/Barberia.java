/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema_barbero;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dani
 */
public class Barberia {    
    Semaphore sillaBarbero = new Semaphore(1);
    Semaphore intetaPelar = new Semaphore(0);
    
    public void pelar(){
        try {
                intetaPelar.acquire();
            } catch (InterruptedException ex) {
                Logger.getLogger(Barbero.class.getName()).log(Level.SEVERE, null, ex);
            }
            sillaBarbero.release();
    }
    
    public void solicitarPelado(){
        intetaPelar.release();
        try {
            sillaBarbero.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
