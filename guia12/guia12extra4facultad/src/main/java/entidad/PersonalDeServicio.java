
package entidad;

public class PersonalDeServicio extends Empleado {
    private String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, int anio_incorporacion, int numero_despacho, String nombre, String apellido, String id, String estado_civil) {
        super(anio_incorporacion, numero_despacho, nombre, apellido, id, estado_civil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
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
        return "PersonalDeServicio: " + super.toString() + "seccion=" + seccion ;
    }
    
    
     
    public String toStringCorto() {
        return "PersonalDeServicio: " + "Nombre:" + super.nombre + " Apellido: " + super.apellido + "Seccion: " + this.seccion + "Num Despacho: " + this.getNumero_despacho() + " Est. Civil: " + this.estado_civil;
    }
    
    
    public void cambiarSeccion() {
    System.out.println("Ingrese la nueva sección a la que pertenece: ");
   this.seccion = sc.next();
   }

    @Override
   public void crear(){
       super.crear();
       System.out.println("Ingrese la sección: ");
       this.seccion = sc.next();
   } 
    
    
    
    
}
