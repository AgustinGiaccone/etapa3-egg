
package entidad;

public abstract class Edificio {
    protected double ancho;
    protected double alto;
    protected double largo;

    public abstract void ingresarDatos();

    public abstract double calcularSuperficie();

    public abstract double calcularVolumen();
}
