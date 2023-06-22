
package entidad;

public class Estudiante extends Persona{
   private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, String id, String estado_civil) {
        super(nombre, apellido, id, estado_civil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
        return "Estudiante: "+ super.toString() + "curso=" + curso ;
    }
    
       public String toStringCorto() {
        return "Estudiante: " + "Nombre:" + super.nombre + " Apellido: " + super.apellido + " Curso: " + this.curso + "Est.Civil: " + super.estado_civil;
    }
    
    
    
    
     public void cambiarCurso() {
         System.out.println("Ingrese el nuevo curso: ");
        this.curso = sc.next();
    }
    
     
     
    @Override
   public void crear(){
       super.crear();
       System.out.println("Ingrese el curso: ");
       this.curso = sc.next();
   } 
     
     
     
     
}
