
package entidad;

public class Extrahotelero extends Alojamiento {
    protected boolean esPrivado;
    protected int extension;

    public Extrahotelero() {
    }

    
    
    public Extrahotelero(boolean esPrivado, int extension, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.extension = extension;
    }
    
    @Override
    public void crear(){
        super.crear();
        System.out.println("¿Es privado? 1-SI  2-NO");
        int respuesta = sc.nextInt();
        if(respuesta==1){
            this.esPrivado = true;
        }else{
            this.esPrivado = false;
        }
        
        System.out.println("Ingrese la Extensión del Predio en Metros2");
        this.extension = sc.nextInt();
        
    }

    @Override
    public String toString() {
        return "Extrahotelero{" + "esPrivado=" + esPrivado + ", extension=" + extension + '}';
    }
    
    

}