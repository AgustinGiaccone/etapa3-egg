
package entidad;

import java.util.Scanner;

public class Polideportivo extends Edificio{
    private String nombre;
    private String tipoInstalacion;

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del polideportivo:");
        System.out.print("Ancho: ");
        ancho = scanner.nextDouble();
        System.out.print("Alto: ");
        alto = scanner.nextDouble();
        System.out.print("Largo: ");
        largo = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Tipo de instalación (Techado/Abierto): ");
        tipoInstalacion = scanner.nextLine();
    }

    public double calcularSuperficie() {
        return 2 * (ancho * largo + ancho * alto + largo * alto);
    }

    public double calcularVolumen() {
        return ancho * largo * alto;
    }
}
