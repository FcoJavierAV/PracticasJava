package Ej106;

public class Personaje {

    protected String nombre;
    protected double healthP;
    protected double shldP;
    protected double atckP;
    protected int posH, posV;
    protected Habilidad ability;
    protected boolean vivo; //Controlamos si esta vivo T o muerto F

    public Personaje(String nombre, int posH, int posV, double healthP, double shldP, double atckP, Habilidad ability) {

        this.nombre = nombre;
        this.ability = ability;
        this.vivo = true;

        if (this.healthP >= 0) {

            this.healthP = healthP;
        }
        if (this.shldP >= 0) {

            this.shldP = shldP;
        }
        if (this.atckP >= 0) {

            this.atckP = atckP;
        }

        if (posH >= 0 && posV >= 0) {

            this.posH = posH;
            this.posV = posV;

        }

    }

    public void desplazarse(int x, int y) {

        this.posH += x;

        this.posV += y;

        if (posH < 0) {
            this.posH = 0;
        }
        if (posV < 0) {
            this.posV = 0;
        }
    }

    @Override
    public String toString() {

        return "Nombre de personaje: " + this.nombre
                + " \nCon puntos de vida: " + this.healthP
                + " \nPuntos de escudo: " + this.shldP
                + " \nPuntos de ataque: " + this.atckP
                + " \nPosicion: " + this.posH + " y " + this.posV
                + ability.toString();
    }

    public void atacar(Personaje otro) {

        if (this.vivo) {

            double danio = this.atckP - otro.shldP;

            if (danio > 0) {

                otro.healthP -= danio;
                System.out.println(this.nombre + " hace " + danio + " puntos de danio a " + otro.nombre + "\n");
            } else {

                System.out.println(this.nombre + " no hace danio a " + otro.nombre + "\n");

            }
            otro.comprobarEstado(); //comprueba que no se haya muerto.
        }

    }

    public boolean comprobarEstado() {
        //comprueba el estado si esta vivo o muerto
        return this.vivo;

    }

}
