package Ej106;

public class Minion extends Personaje {

    String tipo;

    public Minion(String nombre, int posH, int posV, double healthP, double shldP, double atckP, Habilidad ability, String tipo) {

        super(nombre, posH, posV, healthP, shldP, atckP, ability);
        this.nombre = "minion";

        switch (tipo) {

            case "Mago":
                this.tipo = "Mago";
                this.healthP = 12;
                this.shldP = 40;
                this.atckP = 30;
                break;

            case "Canion":
                this.tipo = "Canion";
                this.healthP = 75;
                this.shldP = 5;
                this.atckP = 25;
                break;

            default:
                this.tipo = "Melee";
                this.healthP = 50;
                this.shldP = 10;
                this.atckP = 10;
                break;

        }

    }

}
