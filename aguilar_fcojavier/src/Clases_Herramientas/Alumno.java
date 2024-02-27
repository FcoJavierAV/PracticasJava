/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Herramientas;

/**
 *
 * @author JaviOrellana
 */
public class Alumno extends Persona {

    private double notaMedia;
    private String estudios;

    public Alumno(String nombre, String direccion, String DNI, boolean sexo, double notaMedia, String estudios) {
        super(nombre, direccion, DNI, sexo);
        if (notaMedia >= 0 && notaMedia <= 10) {
            this.notaMedia = notaMedia;
        } else {
            this.notaMedia = 5;
        }
        switch (estudios) {
            case "FP Medio":
                this.estudios = estudios;
                break;
            case "Bachillerato":
                this.estudios = estudios;
                break;
            default:
                this.estudios = "Otros";
                break;
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += "\nAccede al instituto desde " + this.estudios + " con una nota media de " + this.notaMedia;
        return super.toString() + res;
    }
}
