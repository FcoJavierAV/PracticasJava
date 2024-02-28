/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema_barbero;

/**
 *
 * @author Dani
 */
public class Barbero extends Thread{
    boolean hayMasClientes = true;
    Barberia barberia;
    
    public Barbero (Barberia barberia){
        this.barberia = barberia;
    }
    
    @Override
    public void run(){
        while(hayMasClientes){
            barberia.pelar();
        }
    }
    
    public boolean noHayMasClientes(){
        hayMasClientes = false;
        return hayMasClientes;
    }
    
}
