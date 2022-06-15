package Principal;

public class PartidaSimplificada{

    //atributos
    private int puntuacionTotal;
    private Partida datos;

    //constructores
    public PartidaSimplificada(){}

    public PartidaSimplificada(int puntuacionTotal, Partida datos) {
        this.puntuacionTotal = puntuacionTotal;
        this.datos = datos;
    }

    //getter y setter
    public int getPuntuacionTotal() {
        return puntuacionTotal;
    }

    public void setPuntuacionTotal(int puntuacionTotal) {
        this.puntuacionTotal = puntuacionTotal;
    }

    public Partida getDatos() {
        return datos;
    }

    public void setDatos(Partida datos) {
        this.datos = datos;
    }

    //método toString()
    @Override
    public String toString() {
        return "puntuacionTotal=" + puntuacionTotal +
                ", datos=" + datos;
    }
}
