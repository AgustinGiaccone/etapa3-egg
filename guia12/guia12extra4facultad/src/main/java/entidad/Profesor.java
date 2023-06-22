
package entidad;

public class Profesor extends Empleado {
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anio_incorporacion, int numero_despacho, String nombre, String apellido, String id, String estado_civil) {
        super(anio_incorporacion, numero_despacho, nombre, apellido, id, estado_civil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
        return "Profesor: " + super.toString() + "departamento=" + departamento;
    }
    
       public String toStringCorto() {
        return "Profesor: " + "Nombre:" + super.nombre + " Apellido:" + super.apellido + " Departamento:" + this.departamento + "  Est.Civil: " + this.estado_civil + " Num.Despacho: " + this.getNumero_despacho();
    }
    
         public void cambiarDepartamento() {
         System.out.println("Ingrese el nuevo departamento: ");
        this.departamento = sc.next();
    }
    
         
          @Override
     public void crear(){
         super.crear();
         System.out.println("Ingrese el departamento: ");
         this.departamento = sc.next();
     } 
         
         
         
}