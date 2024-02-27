/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Herramientas;

/**
 *
 * @author JaviOrellana
 */
public class Asignatura {

    private String codAsig;
    private String nombreAsig;
    private int numHorasTot;
    private boolean troncal; //True es troncal, False no es troncal
    private Profesor teacher;
    private Alumno listAlum[];
    private int contadorAlum;

    public Asignatura(String nombreAsig, String codAsig, int numHorasTot, Profesor teacher, int maxAlu) {
        this.nombreAsig = nombreAsig;
        this.codAsig = codAsig;
        if (numHorasTot > 0) {
            this.numHorasTot = numHorasTot;
        } else {
            this.numHorasTot = 100;
        }
        this.teacher = teacher;
        if (maxAlu > 0) {
            this.listAlum = new Alumno[maxAlu];
        } else {
            this.listAlum = new Alumno[10];
        }
        this.troncal = true;
        this.teacher.setHorasClase(this.teacher.getHorasClase() + this.numHorasTot);
        this.contadorAlum = 0;
    }

    public String matricularAlumno(Alumno nuevo) {
        String res = "\nNo se ha podido matricular al alumno.\n";
        int i = 0;
        while (i < this.listAlum.length) {
            if (this.listAlum[i] == null) {
                this.listAlum[i] = nuevo;
                res = "\nAlumno matriculado correctamente.\n";
                this.contadorAlum++;
                i = this.listAlum.length;
            }
            i++;
        }
        return res;
    }

    public boolean estaMatriculado(Alumno alu) {
        boolean estaMatriculado = false;
        int i = 0;
        while (i < this.listAlum.length) {
            if (this.listAlum[i] == alu) {
                estaMatriculado = true;
                i = this.listAlum.length;
            }
            i++;
        }
        return estaMatriculado;
    }

    public String borrarAlumno(Alumno borrar) {
        String res = "\nNo ha sido posible eliminar al alumno, porque no está en la lista.\n";
        int i = 0;
        while (i < this.listAlum.length) {
            if (this.listAlum[i] == borrar) {
                this.listAlum[i] = null;
                res = "\nEl alumno se ha eliminado.\n";
                this.contadorAlum--;
                i = this.listAlum.length;
            }
            i++;
        }
        return res;
    }

    public boolean asignaturaCompleta() {
        boolean completa = false; //si es T esta completa si es F no esta llena
        if (this.listAlum.length == this.contadorAlum) {
            completa = true;
        }
        return completa;
    }

    public void cambiarProfesor(Profesor nuevo) {
        this.teacher.setHorasClase(this.teacher.getHorasClase() - this.numHorasTot);
        this.teacher = nuevo;
        this.teacher.setHorasClase(this.teacher.getHorasClase() + this.numHorasTot);
    }

    public String getCodAsig() {
        return this.codAsig;
    }

    public void setCodAsig(String codAsig) {
        this.codAsig = codAsig;
    }

    public String getNombreAsig() {
        return this.nombreAsig;
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    public int getNumHorasTot() {
        return this.numHorasTot;
    }

    public void setNumHorasTot(int numHorasTot) {
        this.numHorasTot = numHorasTot;
    }

    public boolean getTroncal() {
        return this.troncal;
    }

    public void setTroncal(boolean troncal) {
        this.troncal = troncal;
    }

    public Profesor getTeacher() {
        return this.teacher;
    }

    @Override
    public String toString() {
        String res = "\n";
        res += this.codAsig + ": " + this.nombreAsig + " - " + this.numHorasTot + " horas.\n";
        if (this.troncal) {
            res += "Es troncal.\n";
        } else {
            res += "No es troncal.\n";
        }
        res += "\nProfesor de la asignatura:\n==========================\n" + this.teacher.toString() + "\n";
        res += "\nLista de alumnos matriculados:\n==============================\n";
        int i = 0;
        while (i < this.listAlum.length) {
            if (this.listAlum[i] == null) {
                res += "";
            } else {
                res += this.listAlum[i].toString() + "\n-----------------------------------\n";
            }
            i++;
        }
        return res;
    }
}
