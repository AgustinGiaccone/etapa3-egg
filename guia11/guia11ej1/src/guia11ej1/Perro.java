/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/
package guia11ej1;

public class Perro {
    private String nombre;
    private String raza;
    private String tmanio;
    private int edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, String tmanio, int edad) {
        
        this.nombre = nombre;
        this.raza = raza;
        this.tmanio = tmanio;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTmanio() {
        return tmanio;
    }

    public void setTmanio(String tmanio) {
        this.tmanio = tmanio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", tmanio=" + tmanio + ", edad=" + edad + '}';
    }
    
    
}
