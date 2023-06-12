
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Comparator;

public class Simulador {
  private List<Alumno> alumnos;

    public Simulador() {
        this.alumnos = new ArrayList<>();
    }

    // Método para crear la lista de alumnos con nombres y DNIs aleatorios
    public List<Alumno> crearAlumnos(int cantidad, int minDni, int maxDni) {
        List<Alumno> listaAlumnos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            String nombre = "Alumno" + (i + 1);
            String apellido = "Apellido" + (i + 1);
            int dni = random.nextInt(maxDni - minDni + 1) + minDni;

            Alumno alumno = new Alumno(nombre, apellido, dni);
            listaAlumnos.add(alumno);
        }

        this.alumnos = listaAlumnos; // Asignamos la lista de alumnos creada al atributo de la clase
        return listaAlumnos;
    }

    // Método para realizar la votación
    public void votacion(List<Alumno> listaAlumnos) {
        Random random = new Random();

        for (Alumno alumno : listaAlumnos) {
            int indiceVotado = random.nextInt(listaAlumnos.size());
            Alumno votado = listaAlumnos.get(indiceVotado);
            votado.votar(); // Incrementamos la cantidad de votos del alumno votado
        }
    }

    // Método para imprimir los votos de cada alumno
    public void imprimirVotos() {
        System.out.println("Votos de cada alumno:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombreCompleto() + " - Votos: " + alumno.getCantidadVotos());
        }
    }

    // Método para realizar el recuento de votos y mostrar los resultados ordenados por cantidad de votos
    public void recuentoVotos(List<Alumno> listaAlumnos) {
        Map<String, Integer> votosTotales = new HashMap<>();

        for (Alumno alumno : listaAlumnos) {
            votosTotales.put(alumno.getNombreCompleto(), alumno.getCantidadVotos());
        }

        List<Map.Entry<String, Integer>> votosOrdenados = new ArrayList<>(votosTotales.entrySet());
        votosOrdenados.sort(Map.Entry.comparingByValue(Comparator.reverseOrder())); // Ordenamos los votos de mayor a menor

        System.out.println("Resultados del recuento de votos:");
        for (Map.Entry<String, Integer> entry : votosOrdenados) {
            System.out.println(entry.getKey() + " - Cantidad de votos: " + entry.getValue());
        }
    }

    // Método para crear los facilitadores y facilitadores suplentes a partir de los alumnos más votados
    public void crearFacilitadores(List<Alumno> listaAlumnos) {
        Map<String, Integer> votosTotales = new HashMap<>();

        for (Alumno alumno : listaAlumnos) {
            votosTotales.put(alumno.getNombreCompleto(), alumno.getCantidadVotos());
        }

        List<Map.Entry<String, Integer>> votosOrdenados = new ArrayList<>(votosTotales.entrySet());
        votosOrdenados.sort(Map.Entry.comparingByValue(Comparator.reverseOrder())); // Ordenamos los votos de mayor a menor

        List<Alumno> facilitadores = new ArrayList<>();
        List<Alumno> facilitadoresSuplentes = new ArrayList<>();

        int index = 0;
        for (Map.Entry<String, Integer> entry : votosOrdenados) {
            if (index < 5) { // Los 5 alumnos más votadosserán los facilitadores
                facilitadores.add(buscarAlumnoPorNombre(listaAlumnos, entry.getKey()));
            } else if (index < 10) { // Los siguientes 5 alumnos más votados serán los facilitadores suplentes
                facilitadoresSuplentes.add(buscarAlumnoPorNombre(listaAlumnos, entry.getKey()));
            } else {
                break; // Si ya hemos seleccionado a los 10 alumnos más votados, salimos del ciclo
            }
            index++;
        }

        // Imprimimos los facilitadores y facilitadores suplentes
        System.out.println("Facilitadores:");
        for (Alumno facilitador : facilitadores) {
            System.out.println("- " + facilitador.getNombreCompleto() + " - DNI: " + facilitador.getDni());
        }

        System.out.println("\nFacilitadores suplentes:");
        for (Alumno facilitadorSuplente : facilitadoresSuplentes) {
            System.out.println("- " + facilitadorSuplente.getNombreCompleto() + " - DNI: " + facilitadorSuplente.getDni());
        }
    }

    // Método para buscar un alumno en la lista por su nombre completo
    private Alumno buscarAlumnoPorNombre(List<Alumno> listaAlumnos, String nombreCompleto) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombreCompleto().equals(nombreCompleto)) {
                return alumno;
            }
        }
        return null;
    }
}
