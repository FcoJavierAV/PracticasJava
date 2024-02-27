package Ej106;

public class Habilidad {

    String nombre;
    private double costeMana;
    int lvl;
    char tecla;
    private double danBase;

    public Habilidad(String nombre, char tecla) {

        this.nombre = nombre;
        this.tecla = tecla;
        this.lvl = 1;
        this.costeMana = (int) (Math.round(Math.random() * (10 - 1 + 1) + 1)) + this.lvl / 2;
        this.danBase = (int) (Math.round(Math.random() * (20 - 5 + 1) + 5)) + this.costeMana / 3;

    }

    public void subirNivel() {

        this.lvl++;
        this.costeMana = (int) (Math.round(Math.random() * (10 - 1 + 1) + 1)) + this.lvl / 2;
        this.danBase = (int) (Math.round(Math.random() * (20 - 5 + 1) + 5)) + this.costeMana / 3;

    }

    @Override
    public String toString() {

        return "\nLa habilidad: "
                + this.nombre + " \nSe usa con la tecla: "
                + this.tecla + " \nTiene un nivel de: "
                + this.lvl + " \nConsume: "
                + this.costeMana
                + " de mana \nDanio base de: " + this.danBase + "\n";

    }

}
