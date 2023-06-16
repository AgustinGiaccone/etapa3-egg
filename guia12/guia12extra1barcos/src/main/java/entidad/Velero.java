
package entidad;

import java.text.ParseException;
import java.time.temporal.ChronoUnit;

public class Velero extends Barco{
    
    private Integer NumeroDeMastil;

    public Velero() {
    }

    public Velero(Integer NumeroDeMastil) {
        this.NumeroDeMastil = NumeroDeMastil;
    }

    public Velero(Integer NumeroDeMastil, String matricula, Integer eslora, Integer añoDeFabricacion) {
        super(matricula, eslora, añoDeFabricacion);
        this.NumeroDeMastil = NumeroDeMastil;
    }

    public Integer getNumeroDeMastil() {
        return NumeroDeMastil;
    }

    public void setNumeroDeMastil(Integer NumeroDeMastil) {
        this.NumeroDeMastil = NumeroDeMastil;
    }

    @Override
    public String toString() {
        return "Velero{" + "NumeroDeMastil=" + NumeroDeMastil + '}';
    }
    
    
    @Override
    
    public void crear(){
       super.crear();
        System.out.println("Ingrese el NumeroDeMastiles: ");
        this.NumeroDeMastil=leer.nextInt();   
    }
    @Override
    public double calcularAlquiler(){
        double modulo = (this.eslora+this.NumeroDeMastil)*10;
        int cant_dias = (int)ChronoUnit.DAYS.between(this.fechaDeAlquiler, this.fechaDeDevolucion);                
        return modulo*cant_dias;               
    }
}
