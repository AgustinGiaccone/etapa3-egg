//En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
//nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
//amarre y el barco que lo ocupará.
//Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
//Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
//• Número de mástiles para veleros.
//• Potencia en CV para barcos a motor.
//• Potencia en CV y número de camarotes para yates de lujo.
//Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
//alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
//multiplicando por 10 los metros de eslora).
//En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
//sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
//en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
//el número de camarotes.
//Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
//métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
//precio final de su alquiler.
package main;

import entidad.BarcoAMotor;
import entidad.Velero;
import entidad.Yate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BarcoAMotor barcoMotor = new BarcoAMotor();
        Yate yate = new Yate();
        Velero velero = new Velero();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        int opcion2;
        
        do {
            System.out.println("==== Menú de alquiler de barco ====");
            System.out.println("Ingrese el numero de barco que desea alquilar");
            System.out.println("1. velero");
            System.out.println("2. barco a motor");
            System.out.println("3. yate");
            System.out.println("0. salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    velero.crear();
                    System.out.println("el alquiler del velero es: "+ velero.calcularAlquiler()); 
                    break;
                case 2:
                    barcoMotor.crear();
                    System.out.println("el alquiler del velero es: "+ barcoMotor.calcularAlquiler()); 
                    break;
                case 3:
                    yate.crear();
                    System.out.println("el alquiler del velero es: "+ yate.calcularAlquiler()); 
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println("desea alquilar otro barco? 0=NO/1=SI"); // Agregar una línea en blanco para mayor legibilidad
            opcion2=scanner.nextInt();
        } while (opcion2!=0);
        scanner.close();
        //barcoMotor.crear();
        //yate.crear();
        //velero.crear();
        //System.out.println("el alquiler es de: "+velero.calcularAlquiler());
        //velero.calcularAlquiler();
    }
}
