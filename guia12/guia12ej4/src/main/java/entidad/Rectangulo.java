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

public class Rectangulo implements CalculoServicio{
    
    private int base;
    private int altura;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
    @Override
    public void area() {
        System.out.println("Ingrese la base del rectangulo: "); 
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        this.altura = leer.nextInt();
        System.out.println("El area del rectangulo es: "+ this.base * this.altura);
    }

    @Override
    public void perimetro() {
        System.out.println("El perimetro del rectangulo es: " +(this.altura+this.base)*2);
        
    }
}
