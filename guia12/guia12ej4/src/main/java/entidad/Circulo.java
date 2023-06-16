//Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
//geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
//dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
//dos métodos para calcular el área, el perímetro y el valor de PI como constante.

//Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
//calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
//resultado final.

//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
package entidad;

import java.util.Scanner;
import servicio.CalculoServicio;

public class Circulo implements CalculoServicio{
    private int radio;
    private int diametro;

    Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    public Circulo() {
    }

    public Circulo(int radio, int diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }
    
//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    @Override
    public void area() {
        System.out.println("ingrese el radio del circulo: ");
        this.radio = leer.nextInt();
        System.out.println("El area del circulo es: "+ PI * this.radio * this.radio);
        
    }

    @Override
    public void perimetro() {
        System.out.println("Ingrese el diametro del circulo: ");
        this.diametro = leer.nextInt();
        System.out.println("El perimetro del circulo es: "+ PI * this.diametro);
    }
    
    
}
