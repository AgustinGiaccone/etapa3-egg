package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisServicio {

    TreeSet<String> paises = new TreeSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPais() {

        String respuesta = "si";
        while (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Ingrese un pais");
            String pais = leer.next();
            paises.add(pais);
            System.out.println("desea ingresar otro pais?[SI/NO]");
            respuesta = leer.next();
        }
        System.out.println("todos los paises son:");
        System.out.println(paises);
        System.out.println("--------------------");

    }

    public void paisesOrdenAlfabeticamente() {

        ArrayList<String> p = new ArrayList(paises);
        Collections.sort(p);
        System.out.println("los paises ordenados alfabeticamente");
        System.out.println(p);
        System.out.println("---------------------");
        Iterator<String> iterator = p.iterator();
        System.out.println("Ingrese que paise desea eliminar de la lista");
        String eliminarPais = leer.next();
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase(eliminarPais)) {
                iterator.remove();
                System.out.println(p);
                return;
            }
        }
        System.out.println("no se encontro");
    }
}