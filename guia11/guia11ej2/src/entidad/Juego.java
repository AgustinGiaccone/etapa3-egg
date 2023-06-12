
package entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
   ArrayList<Jugador> jugadores;
   private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
public void llenarJuego(){
    ArrayList<Jugador>jugadores= new ArrayList();
    int cantidad;
    do {
       System.out.println("Cuantos jugadores desean participar?");
       cantidad=leer.nextInt();
    } while (cantidad > 6 || cantidad < 2);
    int id = 0;
    for (int i = 0; i<cantidad; i++) {
        
        Jugador jugador = new Jugador(id);
        jugadores.add(jugador);
        id++;
    }
    
    this.jugadores=jugadores;
    this.revolver=new Revolver();
    revolver.llenarRevolver();
}

public void ronda(){
    boolean juego = true;
    do {
        for (Jugador jugador : jugadores) {
        jugador.disparo(revolver, jugador);
            System.out.println(jugador.getNombre() +" te toca");
            System.out.println("Continuar");
            leer.next();
        if (jugador.isMojado()) {
            System.out.println("BOOOOOOOOMMMM!!!!!!!!!!!");
            System.out.println("Finalizp el juego, el jugador "+ jugador.getNombre()+" se mojo");
            juego = false;
            break;
        }else{
            System.out.println("Safaste");
        }
    }
    } while (juego);
    
    
}
   
}
