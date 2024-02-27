
package Banco;

public class TestCuenta {

    
    public static void main(String[] args) {
        
        
        //String nombre, String DNI, double saldo
        CuentaCorriente manolo = new CuentaCorriente("Manolo Garcia", "33456678F", 15100.9);
        
        
        manolo.SacaDinero(103);
        manolo.Info();
        manolo.Ingreso(3000);
        manolo.Info();
                      
        
    }
    
}
