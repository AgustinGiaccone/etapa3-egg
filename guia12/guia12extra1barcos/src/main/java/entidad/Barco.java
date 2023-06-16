
package entidad;

import java.text.ParseException;
import java.time.temporal.ChronoUnit;

public class Barco extends Alquiler{
    
    protected String matricula;
    protected Integer eslora;
    protected Integer anioDeFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer añoDeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioDeFabricacion = añoDeFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAñoDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAñoDeFabricacion(Integer añoDeFabricacion) {
        this.anioDeFabricacion = añoDeFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioDeFabricacion=" + anioDeFabricacion + '}';
    }
  
    @Override
    
    public void crear(){
       super.crear();
        System.out.println("Ingrese la matricula: ");
        this.matricula=leer.next();
        System.out.println("Ingrese el eslora del barco: ");
        this.eslora=leer.nextInt();
        System.out.println("Ingrese el Año de fabricacion: ");
        this.anioDeFabricacion= leer.nextInt();     
    }
//Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
//alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
//multiplicando por 10 los metros de eslora).
    public double calcularAlquiler(){
        double modulo = this.eslora*10;
        int cant_dias = (int)ChronoUnit.DAYS.between(this.fechaDeAlquiler, this.fechaDeDevolucion);
        
        
        return modulo*cant_dias;
        
        
    }
    
}
