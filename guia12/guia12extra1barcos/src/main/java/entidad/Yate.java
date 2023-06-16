
package entidad;

import java.text.ParseException;
import java.time.temporal.ChronoUnit;

public class Yate extends BarcoAMotor {
    
    private Integer numeroDeCamarote;

    public Yate(Integer numeroDeCamarote) {
        this.numeroDeCamarote = numeroDeCamarote;
    }

    public Yate() {
    }

    public Integer getNumeroDeCamarote() {
        return numeroDeCamarote;
    }

    public void setNumeroDeCamarote(Integer numeroDeCamarote) {
        this.numeroDeCamarote = numeroDeCamarote;
    }

    @Override
    public String toString() {
        return "Yate{" + "numeroDeCamarote=" + numeroDeCamarote + '}';
    }
    
    @Override
    
    public void crear(){
       super.crear();
        System.out.println("Ingrese el numeroDeCamarote: ");
        this.numeroDeCamarote=leer.nextInt();
   
    }
    
//En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
//sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
//en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
//el número de camarotes.
@Override
    public double calcularAlquiler(){
        double modulo = (this.eslora+this.potenciaDeMotor+this.numeroDeCamarote)*10;
        int cant_dias = (int)ChronoUnit.DAYS.between(this.fechaDeAlquiler, this.fechaDeDevolucion);                
        return modulo*cant_dias;               
    }
    
    
    
}
