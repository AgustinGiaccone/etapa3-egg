
package entidad;

import java.util.Scanner;

public abstract class Alojamiento {
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;
    
    protected Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Alojamiento() {
    }
    
    
    
    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }
    
    public void crear(){
        System.out.println("Ingrese el nombre del Alojamiento");
        this.nombre = sc.next();
        System.out.println("Ingrese la dirección");
        this.direccion = sc.next();
        System.out.println("Ingrese la localidad");
        this.localidad = sc.next();
        System.out.println("Ingrese el nombre del gerente");
        this.gerente = sc.next();
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }
    
    
    
    
}

