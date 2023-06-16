
package entidad;

import java.text.ParseException;
import java.time.temporal.ChronoUnit;

public class BarcoAMotor extends Barco{
    
    protected Integer potenciaDeMotor;

    public BarcoAMotor() {
    }

    public BarcoAMotor(Integer potenciaDeMotor) {
        this.potenciaDeMotor = potenciaDeMotor;
    }

    public BarcoAMotor(Integer potenciaDeMotor, String matricula, Integer eslora, Integer añoDeFabricacion) {
        super(matricula, eslora, añoDeFabricacion);
        this.potenciaDeMotor = potenciaDeMotor;
    }

    public Integer getPotenciaDeMotor() {
        return potenciaDeMotor;
    }

    public void setPotenciaDeMotor(Integer potenciaDeMotor) {
        this.potenciaDeMotor = potenciaDeMotor;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" + "potenciaDeMotor=" + potenciaDeMotor + '}';
    }
    
    @Override
    
    public void crear(){
       super.crear();
        System.out.println("Ingrese la potenciaDeMotor: ");
        this.potenciaDeMotor=leer.nextInt();
           
    }
    
//En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
//sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
//en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
//el número de camarotes.
    @Override
    public double calcularAlquiler(){
        double modulo = (this.eslora+this.potenciaDeMotor)*10;
        int cant_dias = (int)ChronoUnit.DAYS.between(this.fechaDeAlquiler, this.fechaDeDevolucion);                
        return modulo*cant_dias;               
    }
}
