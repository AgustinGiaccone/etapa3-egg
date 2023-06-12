/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package guia11ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Persona> personas = new ArrayList();
    ArrayList<Perro> perros = new ArrayList();
    String respuesta;

    public void crearPersona() {
        System.out.println("Lista de personas");
        do {
            Persona p1 = new Persona();
            System.out.println("Ingrese el nombre");
            p1.setNombre(leer.next());
            System.out.println("Ingrese el apellido");
            p1.setApellido(leer.next());
            System.out.println("Ingrese el DNI");
            p1.setDni(leer.nextInt());
            System.out.println("Ingrese la edad");
            p1.setEdad(leer.nextInt());
            personas.add(p1);
            System.out.println("Desea agregar otra persona?S/N");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("S"));

    }

    public void crearPerro() {
        System.out.println("lista de perros");
        do {
            Perro perro1 = new Perro();
            System.out.println("Ingrese el nombre");
            perro1.setNombre(leer.next());
            System.out.println("Ingrese el raza");
            perro1.setRaza(leer.next());
            System.out.println("Ingrese el tamaño");
            perro1.setTmanio(leer.next());
            System.out.println("Ingrese la edad");
            perro1.setEdad(leer.nextInt());
            perros.add(perro1);
            System.out.println("Desea agregar otro perro?S/N");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("S"));
    }

    public void adopcion() {
        do {
            System.out.println("Ingrese su nombre para ver si se encuentra en la lista");
            String nombrePersona = leer.next();
            int contador = 0;
            for (Persona aux : personas) {
                if (aux.getNombre().equalsIgnoreCase(nombrePersona)) {
                    System.out.println("Correcto, usted se encuentra en el sistema");
                    System.out.println("La lista de los perros disponibles es: ");
                    System.out.println(perros.toString());
                    System.out.println("ingrese el nombre del perro");
                    String perroAAdoptar = leer.next();
                    contador++;
                    Iterator<Perro> inter = perros.iterator();
                    while (inter.hasNext()) {
                        Perro next = inter.next();
                        if (next.getNombre().equalsIgnoreCase(perroAAdoptar)) {
                            aux.setPerro(next);
                            inter.remove();
                            System.out.println("Felicitaciones!!!! el perro es suyo");
                            break;
                        }
                    }
                }
            }
            if (contador == 0) {
                System.out.println("Su nombre no figura en la lista");
                break;
            }

            System.out.println("alguien mas desea adoptar?S/N");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("S"));

    }

    public void mostrarDuenios() {
        
        System.out.println("La lista de dueños es: ");
        
        for (Persona persona : personas) {
            if (persona.getPerro()!=null) {
                System.out.println("el nuevo dueño: " + persona.getNombre() + " y su mascota es: " + persona.getPerro());

            }            
        }
    }
}
