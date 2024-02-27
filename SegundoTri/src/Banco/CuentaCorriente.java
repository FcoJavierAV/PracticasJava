package Banco;

public class CuentaCorriente {

    double saldo = 0;
    int limite = 100;
    String nombre;
    String DNI;
    String NBanco = "Sr Hormiga Bank";

    public CuentaCorriente(String nombre, String DNI, double saldo) {

        this.nombre = nombre;
        this.DNI = DNI;
        this.saldo = saldo;

    }

    public double SacaDinero(double sacar) {

        if (this.saldo + sacar <= this.limite) {

            return this.saldo -= sacar;

        }

        return this.saldo;
    }

    public double Ingreso(double meter) {

        if (meter > 0) {

            return this.saldo += meter;

        }

        return this.saldo;

    }

    public void Info() {

        System.out.println("------------------------");
        System.out.println(" Su saldo es de: " + this.saldo + "\n Nombre de la cuenta: " + this.nombre + " con DNI " + this.DNI + "\n Informacion ofrecida por " + this.NBanco);

    }

}
