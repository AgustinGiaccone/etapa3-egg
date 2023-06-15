package entidad;

//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
import servicio.CalculosServicio;

//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
public class Circulo implements CalculosServicio {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(this.radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return PI * radio * 2;
    }

}
