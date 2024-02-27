package Herencia.Ej104;

public class Profesor {

    private String nombre;
    protected Asignatura listaAsig[];
    protected int numHorsClase;
    protected boolean impartir; //si es T esta dando clase y si es F no esta dando clase

    public Profesor(String nombre, int cantAsigM) {

        this.nombre = nombre;
        this.numHorsClase = numHorsClase;
        this.impartir = false;

        int numAsig = (int) (Math.round(Math.random() * (cantAsigM - 1 + 1) + 1));

        this.listaAsig = new Asignatura[cantAsigM];

        for (int i = 0; i < numAsig; i++) {

        }
    }

    private void darClase() {

        if (!this.impartir) {

            System.out.println(this.nombre + "está dando clase de ");
            this.impartir = true;

        }
        else{
            
            System.out.println(this.nombre + "no puede dar otra clase");
            
        }

    }

    public void parar() {

        if (this.impartir) {
            
            
            this.impartir = false;

        }

    }

}
