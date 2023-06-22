
package entidad;

public class Hotel5Estrellas extends Hotel4Estrellas {
   private int salones_conferencia;
    private int suites;
    private int limosinas;

    public Hotel5Estrellas(int salones_conferencia, int suites, int limosinas, String nombre_restaurante, String gimnasio, int capacidad_restaurante, int cantidad_habitaciones, int camas, int pisos, int precio, String nombre, String direccion, String localidad, String gerente) {
        super(nombre_restaurante, gimnasio, capacidad_restaurante, cantidad_habitaciones, camas, pisos, precio, nombre, direccion, localidad, gerente);
        this.salones_conferencia = salones_conferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Hotel5Estrellas() {
    }

    
    @Override
    public void crear(){
        super.crear();
        System.out.println("Ingrese la Cantidad de Salones de Conferencia");
        this.salones_conferencia = sc.nextInt();
        System.out.println("Ingrese la Cantidad de Suites");
        this.suites = sc.nextInt();
        System.out.println("Ingrese la Cantidad de Limosinas");
        this.limosinas = sc.nextInt();
    }
    
 
    
    @Override
    public int precioHabitacion(){
        int precioHabitacion = super.precioHabitacion() + calculoLimosinas(this.limosinas);
        return precioHabitacion;
    }
    
    public int calculoLimosinas(int cantidad_limosinas){
        return cantidad_limosinas * 15;
    }

    @Override
    public String toString() {
        return "Hotel5Estrellas{" + "salones_conferencia=" + salones_conferencia + ", suites=" + suites + ", limosinas=" + limosinas + '}';
    }
    
    
    
    
    
}
