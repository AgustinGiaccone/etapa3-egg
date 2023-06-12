
package entidad;

import java.util.Random;

public class Revolver {
    
    //ATRIBUTOS
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    
    
                        //METODOS
    
    
    public void llenarRevolver() {
        Random random = new Random();
        this.posicionActual = random.nextInt(6);    // COLOCA LA RECAMARA EN UNA POSICION RANDOM
        this.posicionAgua=random.nextInt(6);        // COLOCA EL CARTUCHO DE AGUA EN LA RECAMARA EN UNA POSICION RANDOM
    }

    public boolean mojar() {
        return this.posicionActual == this.posicionAgua;   //DEVULVE TRUE SI LA POSICION DEL TAMBOR ES LA MISMA QUE LAS POSICION DE LA BALA DE AGUA
    }

    public void siguienteChorro() {
        if (this.posicionActual== 5) {      //SI EL TAMBOR ESTA EN SU ULTIMA RECAMARA PASA
            this.posicionActual=0;          // A LA POSICION 0 DE LA RECAMARA
        } else {
            this.posicionActual=this.posicionActual+1;     //MIENTRAS QUE LA RECAMARA NO SEA 5 SE VA CAMBIANDO DE RECAMARA
        }
    }
}
