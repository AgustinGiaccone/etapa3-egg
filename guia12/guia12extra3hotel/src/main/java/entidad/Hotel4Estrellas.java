
package entidad;

public class Hotel4Estrellas extends Hotel{
    protected String nombre_restaurante;
    protected String gimnasio;
    protected int capacidad_restaurante;

    public Hotel4Estrellas(String nombre_restaurante, String gimnasio, int capacidad_restaurante, int cantidad_habitaciones, int camas, int pisos, int precio, String nombre, String direccion, String localidad, String gerente) {
        super(cantidad_habitaciones, camas, pisos, precio, nombre, direccion, localidad, gerente);
        this.nombre_restaurante = nombre_restaurante;
        this.gimnasio = gimnasio;
        this.capacidad_restaurante = capacidad_restaurante;
    }

    public Hotel4Estrellas() {
       
    }

    
    @Override
    public void crear(){
        super.crear();
        System.out.println("Ingrese el nombre del Restaurante");
        this.nombre_restaurante = sc.next();
        System.out.println("Ingrese la capacidad del Restaurante");
        this.capacidad_restaurante = sc.nextInt();
        System.out.println("Ingrese la Calidad del Gimnasio  A o B");
        this.gimnasio= sc.next();  
       
}
    
    //El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
//PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
//agregado por gimnasio) + (valor agregado por limosinas).
    public int precioHabitacion(){
        int precio_base = 50;
        int capacidad = this.cantidad_habitaciones * this.camas;
        int restaurant = calculoRestaurant(this.capacidad_restaurante);
        int gimnasio = calculoGimnasio(this.gimnasio);
        int precioHabitacion;
        
        precioHabitacion = precio_base + capacidad + restaurant + gimnasio;
        
        return precioHabitacion;
        
    }
    
    
    public int calculoRestaurant(int capacidad_restaurant){
    int precio;

    if(capacidad_restaurant < 30){
        precio =10;
    }else if(capacidad_restaurant >= 30 && capacidad_restaurant <= 50){
        precio=30;
    }else{
        precio=50;
    }
        return precio;
}
    
    public int calculoGimnasio (String letra_gimnasio){
        int precio;
        
        if(letra_gimnasio.equalsIgnoreCase("A")){
            precio= 50;
        }else{
            precio=30;
        }
        
        return precio;
    }

    @Override
    public String toString() {
        return  super.toString() + "Hotel4Estrellas{" + "nombre_restaurante=" + nombre_restaurante + ", gimnasio=" + gimnasio + ", capacidad_restaurante=" + capacidad_restaurante + '}';
    }

  


    
}