//Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
//edificio tendrá como métodos:

//• Método calcularSuperficie(): calcula la superficie del edificio.

//• Método calcularVolumen(): calcula el volumen del edifico.

//Estos métodos serán abstractos y los implementarán las siguientes clases:

//• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
//Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.

//• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
//por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
//los atributos del padre.

//De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
//usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
//(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
//cuantas personas entrarían en un piso y cuantas en todo el edificio.

//Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
//dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
//métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
//superficie y el volumen de cada edificio.

//Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
//techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
//cantPersonas() y mostrar los resultados de cada edificio de oficinas.

package main;

import entidad.Edificio;
import entidad.EdificioDeOficina;
import entidad.Polideportivo;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       ArrayList<Edificio> edificios = new ArrayList<>();

        // Crear edificio Polideportivo
        Polideportivo poli1 = new Polideportivo();
        poli1.ingresarDatos();
        edificios.add(poli1);

        // Crear edificio Polideportivo
        Polideportivo poli2 = new Polideportivo();
        poli2.ingresarDatos();
        edificios.add(poli2);

        // Crear edificio de oficinas
        EdificioDeOficina edif1 = new EdificioDeOficina();
        edif1.ingresarDatos();
        edificios.add(edif1);

        // Crear edificio de oficinas
        EdificioDeOficina edif2 = new EdificioDeOficina();
        edif2.ingresarDatos();
        edificios.add(edif2);
        
        

        // Recorrer la lista de edificios y mostrar la superficie y el volumen de cada uno
        for (Edificio edificio : edificios) {
            double superficie = edificio.calcularSuperficie();
            double volumen = edificio.calcularVolumen();
            

            System.out.println("Superficie del edificio: " + superficie);
            System.out.println("Volumen del edificio: " + volumen);
            System.out.println();
        }
        System.out.println("la cantidad de personas que ahi en los edificios de oficina es de: " +(edif1.cantPersonas()+edif2.cantPersonas()));
    }
}
