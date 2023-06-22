
package entidad;

public class Residencia extends Extrahotelero {
    private int habitaciones;
    private boolean descuentos;
    private boolean campoDeportivo;

    public Residencia() {
    }
    

    public Residencia(int habitaciones, boolean descuentos, boolean campoDeportivo, boolean esPrivado, int extension, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, extension, nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
    }
    
    @Override
    public void crear(){
        super.crear();
        System.out.println("Ingrese la cantidad de habitaciones");
        this.habitaciones = sc.nextInt();
        System.out.println("¿Hace descuentos a Gremios? 1-SI  2-NO");
        int respuesta = sc.nextInt();
        if(respuesta==1){
            this.descuentos = true;
        }else{
            this.descuentos = false;
        }
        System.out.println("¿Posee campo deportivo? 1-SI  2-NO");
        respuesta = sc.nextInt();
        if(respuesta==1){
            this.campoDeportivo = true;
        }else{
            this.campoDeportivo = false;
        }
    }

    @Override
    public String toString() {
        return "Residencia{" + "habitaciones=" + habitaciones + ", descuentos=" + descuentos + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
    
    
}
