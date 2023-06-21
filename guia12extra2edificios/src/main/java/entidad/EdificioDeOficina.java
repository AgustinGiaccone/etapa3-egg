
package entidad;

import java.util.Scanner;

public class EdificioDeOficina extends Edificio {
    private int numeroOficinas;
    private int personasPorOficina;
    private int numeroPisos;

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del edificio de oficinas:");
        System.out.print("Ancho: ");
        ancho = scanner.nextDouble();
        System.out.print("Alto: ");
        alto = scanner.nextDouble();
        System.out.print("Largo: ");
        largo = scanner.nextDouble();
        System.out.print("Número de oficinas: ");
        numeroOficinas = scanner.nextInt();
        System.out.print("Personas por oficina: ");
        personasPorOficina = scanner.nextInt();
        System.out.print("Número de pisos: ");
        numeroPisos = scanner.nextInt();
    }

    public double calcularSuperficie() {
        return 2 * (ancho * largo + ancho * alto + largo * alto);
    }

    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    public int cantPersonas() {
        int personasPorPiso = personasPorOficina * numeroOficinas;
        int totalPersonas = personasPorPiso * numeroPisos;

        System.out.println("Personas por piso: " + personasPorPiso);
        System.out.println("Personas en todo el edificio: " + totalPersonas);
        return totalPersonas;
    }
}
