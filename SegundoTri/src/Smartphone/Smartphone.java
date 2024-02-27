package Smartphone;

public class Smartphone {

    double pulgadas;
    int ram;
    double espacio;
    double peso;
    String camara;
    String modelo;
    String marca;
    boolean estado = false; //F apagado y T encendido

    public Smartphone(double pulgadas, int ram, double espacio, String marca, String modelo) {

        this.pulgadas = pulgadas;
        this.peso = 133.3;
        this.ram = ram;
        this.espacio = espacio;
        this.camara = "12mpx";
        this.marca = marca;
        this.modelo = modelo;

    }

    public void Encender() {

        if (!this.estado) {

            this.estado = true;
            System.out.println("Su smartphone es un " + this.marca + " , su modelo es " + this.modelo + " y su espacio es de " + this.espacio + " GB");

        } else {
            System.out.println("No puede encenderse porque ya esta encendido");
        }

    }

    public void Apagar() {

        if (this.estado) {

            this.estado = false;
            System.out.println("El smartphone se ha pagado");

        } else {
            System.out.println("No puede apagarse porque ya esta apagado");
        }
    }

}
