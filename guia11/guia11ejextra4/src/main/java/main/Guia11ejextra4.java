
package main;

import entidad.Alumno;
import java.util.List;
import servicio.Simulador;

public class Guia11ejextra4 {

    public static void main(String[] args) {
       Simulador simulador = new Simulador();
        List<Alumno> listaAlumnos = simulador.crearAlumnos(10, 10000000, 99999999); // Creamos la lista de alumnos
        simulador.votacion(listaAlumnos); // Realizamos la votación
        simulador.imprimirVotos(); // Imprimimos los votos de cada alumno
        simulador.recuentoVotos(listaAlumnos); // Realizamos el recuento de votos y mostramos los resultados
        simulador.crearFacilitadores(listaAlumnos); // Creamos los facilitadores y facilitadores suplentes
    }
}
