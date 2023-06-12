package entidad;

public class Cine {

    private Pelicula pelicula;
    private double precioEntrada;
    private Sala sala;

    public Cine() {
        Pelicula peli = new Pelicula("Esta noche digo adios", 2, 18, "Jeremias");
        this.pelicula = peli;
        this.precioEntrada = 100;
        this.sala = new Sala();
    }

    public Cine(Pelicula pelicula, double precioEntrada, Sala sala) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

}
