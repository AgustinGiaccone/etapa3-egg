
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Voto {

    // ATRIBUTOS

    private Alumno alumnoQueVota;
    private HashMap<Alumno, Integer> votosPorAlumno;

    // CONSTRUCTOR

    public Voto() {
        votosPorAlumno = new HashMap<>();
    }

    // MÉTODOS

    public void votacion(HashMap<Long, Alumno> listaAlumnos) {
        List<Alumno> listaAlumnosVector = new ArrayList<>(listaAlumnos.values());
        Random aleatorio = new Random();

        for (Alumno alumno : listaAlumnos.values()) {
            alumnoQueVota = alumno;

            HashSet<Alumno> votados = new HashSet<>();

            for (int i = 0; i < 3; i++) {
                Alumno votado;

                do {
                    votado = listaAlumnosVector.get(aleatorio.nextInt(listaAlumnosVector.size()));
                } while (votado == alumnoQueVota || votados.contains(votado));

                votados.add(votado);

                // Incrementar la cantidad de votos del alumno votado
                votosPorAlumno.put(votado, votosPorAlumno.getOrDefault(votado, 0) + 1);
            }
        }
    }

    public void mostrarResultados() {
        for (Map.Entry<Alumno, Integer> entry : votosPorAlumno.entrySet()) {
            Alumno alumno = entry.getKey();
            int cantidadVotos = entry.getValue();
            System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " - Votos: " + cantidadVotos);
        }
    }

    public void mostrarFacilitadores() {
        // Ordenar los alumnos por la cantidad de votos (de mayor a menor)
        List<Map.Entry<Alumno, Integer>> sortedList = new ArrayList<>(votosPorAlumno.entrySet());
        sortedList.sort(Map.Entry.comparingByValue());
        Collections.reverse(sortedList);

        System.out.println("Facilitadores:");
        for (int i = 0; i < 5; i++) {
            if (i < sortedList.size()) {
                Alumno alumno = sortedList.get(i).getKey();
                System.out.println(alumno.getNombre() + " " + alumno.getApellido());
            }
        }

        System.out.println("Facilitadores Suplentes:");
        for (int i = 5; i < 10; i++) {
            if (i < sortedList.size()) {
                Alumno alumno = sortedList.get(i).getKey();
                System.out.println(alumno.getNombre() + " " + alumno.getApellido());
            }
        }
    }
}