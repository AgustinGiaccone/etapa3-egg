package entidad;

public class Alumno {

    private String nombre;
    private String apellido;
    private int dni;
    private int cantidadVotos;

    public Alumno(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cantidadVotos = 0; // Inicializamos la cantidad de votos en cero
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public int getDni() {
        return dni;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void votar() {
        cantidadVotos++; // Incrementamos la cantidad de votos del alumno
    }
}
