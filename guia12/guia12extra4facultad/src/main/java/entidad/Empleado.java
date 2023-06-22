
package entidad;

public abstract class Empleado extends Persona {
    private int anio_incorporacion;
    private int numero_despacho;

    public Empleado() {
    }


    public Empleado(int anio_incorporacion, int numero_despacho, String nombre, String apellido, String id, String estado_civil) {
        super(nombre, apellido, id, estado_civil);
        this.anio_incorporacion = anio_incorporacion;
        this.numero_despacho = numero_despacho;
    }

    public int getAnio_incorporacion() {
        return anio_incorporacion;
    }

    public void setAnio_incorporacion(int anio_incorporacion) {
        this.anio_incorporacion = anio_incorporacion;
    }

    public int getNumero_despacho() {
        return numero_despacho;
    }

    public void setNumero_despacho(int numero_despacho) {
        this.numero_despacho = numero_despacho;
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
        return super.toString() + "anio_incorporacion=" + anio_incorporacion + ", numero_despacho=" + numero_despacho + " ";
    }
    
    
    
     public void asignarDespacho() {
         System.out.println("Ingrese el nuevo número de despacho: ");
        this.numero_despacho = sc.nextInt();
    }
    
     
    @Override
     public void crear(){
         super.crear();
         System.out.println("Ingrese n° de despacho: ");
         this.numero_despacho = sc.nextInt();
         System.out.println("Ingrese Año de incorporación: ");
         this.anio_incorporacion = sc.nextInt();
     }
     
     
    
}
