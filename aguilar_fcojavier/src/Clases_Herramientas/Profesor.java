/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Herramientas;

/**
 *
 * @author JaviOrellana
 */
public class Profesor extends Persona {

    private double sueldo;
    private String estudios;
    private int horasClase;
    private boolean busy; //True está ocupado, False no está ocupado

    public Profesor(String nombre, String direccion, String DNI, boolean sexo, double sueldo, String estudios) {
        super(nombre, direccion, DNI, sexo);
        if (sueldo > 350) {
            this.sueldo = sueldo;
        } else {
            this.sueldo = 350;
        }

        this.horasClase = 0;
        this.busy = false;

        switch (estudios) {
            case "Doctorado":
                this.estudios = estudios;
                break;
            case "Postgrado":
                this.estudios = estudios;
                break;
            case "Universitario":
                this.estudios = estudios;
                break;
            case "FP Superior":
                this.estudios = estudios;
                break;
            case "Bachillerato":
                this.estudios = estudios;
                break;
            default:
                this.estudios = "FP Medio";
                break;
        }
    }

    public void enClase() {
        if (!this.sexo && !this.busy) {
            System.out.println("El profesor " + this.getNombre() + " no está dando clase.\n");
        } else if (!this.sexo && this.busy) {
            System.out.println("El profesor " + this.getNombre() + " está dando clase.\n");
        } else if (this.sexo && !this.busy) {
            System.out.println("La profesora " + this.getNombre() + " no está dando clase.\n");
        } else {
            System.out.println("La profesora " + this.getNombre() + " está dando clase.\n");
        }
    }

    public int getHorasClase() {
        return this.horasClase;
    }

    public void setHorasClase(int horasClase) {
        if (horasClase > 0) {
            this.horasClase = horasClase;
        }
    }

    public boolean getBusy() {
        return this.busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    @Override
    public String toString() {
        String res = "";
        res += "\nSu nivel de estudios es: " + this.estudios + "\n";
        if (!this.sexo && !this.busy) {
            res += "\nTrabaja como Profesor durante " + this.horasClase + " horas y cobra " + this.sueldo + "€."
                    + "\n\nAhora mismo no está dando clase.\n";
        } else if (!this.sexo && this.busy) {
            res += "\nTrabaja como Profesor durante " + this.horasClase + " horas y cobra " + this.sueldo + "€."
                    + "\n\nAhora mismo está dando clase.\n";
        } else if (this.sexo && !this.busy) {
            res += "\nTrabaja como Profesora durante " + this.horasClase + " horas y cobra " + this.sueldo + "€."
                    + "\n\nAhora mismo no está dando clase.\n";
        } else {
            res += "\nTrabaja como Profesora durante " + this.horasClase + " horas y cobra " + this.sueldo + "€."
                    + "\n\nAhora mismo está dando clase.\n";
        }

        return super.toString() + res;
    }
}
