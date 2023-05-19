
package ejercicio4;

import java.util.Scanner;

public class main4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        PeliculaServicio peliServi = new PeliculaServicio();
        
        peliServi.crearPelicula();
        peliServi.mostrarPeliculas();
    }
    
}