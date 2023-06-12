package main;

import entidad.Cine;
import servicio.CineServicio;

public class MainCine {

    public static void main(String[] args) {
        CineServicio cs = new CineServicio();
        Cine cine = cs.simulacion();
    }
}







