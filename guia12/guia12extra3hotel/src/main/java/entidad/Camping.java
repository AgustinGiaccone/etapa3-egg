
package entidad;

public class Camping extends Extrahotelero {
  private int capacidad_maxima;
    private int banos;
    private boolean restaurante;

    public Camping() {
    }


    
    
    public Camping(int capacidad_maxima, int banos, boolean restaurante, boolean esPrivado, int extension, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, extension, nombre, direccion, localidad, gerente);
        this.capacidad_maxima = capacidad_maxima;
        this.banos = banos;
        this.restaurante = restaurante;
    }
    
    @Override
    public void crear(){
        super.crear();
        System.out.println("Ingrese la Capacidad Maxima");
        this.capacidad_maxima = sc.nextInt();
        System.out.println("Ingrese la Cantidad de Baños");
        this.banos = sc.nextInt();
        System.out.println("¿Posee Restaurante? 1-SI  2-NO");
        int respuesta = sc.nextInt();
        if(respuesta==1){
            this.restaurante = true;
        }else{
            this.restaurante = false;
        }
    }

    @Override
    public String toString() {
        return "Camping{" + "capacidad_maxima=" + capacidad_maxima + ", banos=" + banos + ", restaurante=" + restaurante + '}';
    }
  
    
    
}
