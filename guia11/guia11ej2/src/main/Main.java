
package main;

import entidad.Juego;

public class Main {

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.llenarJuego();
        juego.ronda();
    }
    
}
