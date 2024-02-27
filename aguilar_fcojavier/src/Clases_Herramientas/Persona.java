/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Herramientas;

/**
 *
 * @author JaviOrellana
 */
public class Persona {

    private String nombre;
    private String direccion;
    private String DNI;
    protected boolean sexo; //True es femenino, False masculino

    public Persona(String nombre, String direccion, String DNI, boolean sexo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
        this.sexo = sexo;
    }

    public Persona(Persona copia) {
        this.nombre = copia.nombre;
        this.direccion = copia.direccion;
        this.DNI = copia.DNI;
        this.sexo = copia.sexo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDNI() {
        return this.DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        String res = "";
        res += this.nombre + " - " + this.DNI + "\n";
        if (this.sexo) {
            res += "\nEs una chica\n";
        } else {
            res += "\nEs un chico\n";
        }
        res += "\n" + this.direccion + "\n";
        return res;
    }

}
