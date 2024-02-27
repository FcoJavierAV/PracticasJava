package Ej106;

public class Campeon extends Personaje {

    double cantPmagia;
    int lvlCam;
    String rol;

    public Campeon(String nombre, int posH, int posV, double healthP, double shldP, double atckP, Habilidad ability, double cantPmagia, String rol, int lvlCam) {

        super(nombre, posH, posV, healthP, shldP, atckP, ability);

        this.lvlCam = 1;

        switch (rol) {

            case "Tanque":
                this.rol = "Tanque";
                this.cantPmagia = 100;
                break;

            case "Support":
                this.rol = "Support";
                this.cantPmagia = 300;
                break;

            case "Mago":
                this.rol = "Mago";
                this.cantPmagia = 500;
                break;

            case "Jungla":
                this.rol = "Jungla";
                this.cantPmagia = 200;
                break;

            default:
                this.rol = "Carry";
                this.cantPmagia = 300;
                break;
        }

    }

    public void subirNivel(Habilidad nueva) {

        this.lvlCam++;
        this.healthP = this.healthP + (int) (Math.round(Math.random() * (9 - 1 + 1) + 1));
        this.shldP = this.shldP + (int) (Math.round(Math.random() * (9 - 1 + 1) + 1)) / 10;
        this.atckP = this.atckP + (int) (Math.round(Math.random() * (9 - 1 + 1) + 1)) / 10;

        if (this.lvlCam == 4 || this.lvlCam == 6 || this.lvlCam == 8) {

            ability = nueva;
        }
    }
    
    @Override
    public String toString(){
        
        return "Nombre de personaje: " + this.nombre
                + " \nCon puntos de vida: " + this.healthP
                + " \nPuntos de escudo: " + this.shldP
                + " \nPuntos de ataque: " + this.atckP
                + " \nPosicion: " + this.posH + " y " + this.posV
                + " \nCantidad de puntos de magia: " + this.cantPmagia
                + " \nRol: " + this.rol
                + " \nNivel de campeon: " + this.lvlCam
                + ability.toString();
        
    }

}
