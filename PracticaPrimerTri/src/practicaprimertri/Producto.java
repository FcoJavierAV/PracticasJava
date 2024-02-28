package practicaprimertri;

public class Producto {

    private String codigo, peso, nombre, lugar, piso;

    public Producto(String codigo, String peso, String nombre, String lugar, String piso) {
        this.codigo = codigo;
        this.peso = peso;
        this.nombre = nombre;
        this.lugar = lugar;
        this.piso = piso;
    }

    public String getPiso() {
        return piso;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        return "Producto \n codigo: " + codigo + ", peso: " + peso + ", nombre: " + nombre + ", lugar: " + lugar;
    }

}
