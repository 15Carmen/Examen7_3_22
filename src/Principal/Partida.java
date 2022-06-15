package Principal;

public class Partida{

    //atributos
    private String nombre;
    private int edad;
    private int puntos;

    //constructor
    public Partida(String nombre, int edad, int puntos){
        this.nombre=nombre;
        this.edad=edad;
        this.puntos=puntos;
    }

    //Getter y setter

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    //método toString
    @Override
    public String toString() {
        return String.format("%S, %d, %d \n", nombre, edad, puntos);
    }


}
