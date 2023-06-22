
package entidad;

import java.util.Scanner;

public abstract class Persona {
  protected String nombre;
    protected String apellido;
    protected String id;
    protected String estado_civil;

    protected Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, String id, String estado_civil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.estado_civil = estado_civil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", estado_civil=" + estado_civil + " ";
    }
    
    
    public void cambiarEstadoCivil() {
        System.out.println("Ingrese el nuevo estado civil: ");
        this.estado_civil = sc.next();
    }
    
    public void crear(){
        System.out.println("Ingrese nombre: ");
        this.nombre = sc.next();
        System.out.println("Ingrese apellido: ");
        this.apellido = sc.next();
        System.out.println("Ingrese id: ");
        this.id = sc.next();
        System.out.println("Ingrese Estado Civil: ");
        this.estado_civil = sc.next();
    }
    
    
    
    
}
