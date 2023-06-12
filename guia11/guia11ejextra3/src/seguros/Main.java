package main;

import java.util.HashMap;

import Entidades.Alumno;
import Entidades.Simulador;
import Entidades.Voto;

public class Main {

    public static void main(String[] args) throws Exception {

        Simulador simulacion = new Simulador();

        HashMap<Long, Alumno> listaAlumnos = simulacion.crearListaAlumnos();

        simulacion.impresionLista();

        Voto voto = new Voto();
        voto.votacion(listaAlumnos);
        voto.mostrarResultados();
        voto.mostrarFacilitadores();

    }
}
