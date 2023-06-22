
package entidad;

public class Hotel extends Alojamiento {
   protected int cantidad_habitaciones;
    protected int camas;
    protected int pisos;
    public int precio;

    public Hotel() {
    }


    public Hotel(int cantidad_habitaciones, int camas, int pisos, int precio, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidad_habitaciones = cantidad_habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precio = precio;
    }

    @Override
    public void crear(){
        super.crear();
        System.out.println("Ingrese la Cantidad de Habitaciones");
        this.cantidad_habitaciones = sc.nextInt();
        System.out.println("Ingrese la Cantidad de Camas");
        this.camas = sc.nextInt();
        System.out.println("Ingrese la Cantidad de Pisos");
        this.pisos = sc.nextInt();
}

    @Override
    public String toString() {
        return super.toString() + "Hotel{" + "cantidad_habitaciones=" + cantidad_habitaciones + ", camas=" + camas + ", pisos=" + pisos + ", precio=" + precio + '}';
    }
 

    

    
}
