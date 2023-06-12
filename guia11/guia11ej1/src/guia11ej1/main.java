/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/

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

public class main {

    public static void main(String[] args) {
        
        /// EJERCICIO 1
//        Persona p1 =new Persona();
//        p1.setApellido("Perez");
//        p1.setDni(36589072);
//        p1.setEdad(23);
//        p1.setNombre("Agustin");
//        
//        Persona p2 =new Persona();
//        p2.setApellido("gomes");
//        p2.setDni(57893623);
//        p2.setEdad(33);
//        p2.setNombre("juan");
//        
//        Perro perro1 =new Perro();
//        perro1.setEdad(3);
//        perro1.setNombre("boby");
//        perro1.setRaza("golden");
//        perro1.setTmanio("mediano");
//        
//        Perro perro2 =new Perro();
//        perro2.setEdad(4);
//        perro2.setNombre("firulai");
//        perro2.setRaza("dogo");
//        perro2.setTmanio("grande");
//        
//        p1.setPerro(perro2);
//        p2.setPerro(perro1);
//        
//        
//        System.out.println("la info de la persona 1: "+p1.toString());
//        System.out.println("la info de la persona 2: "+ p2.toString());

    Servicio srv= new Servicio();
    srv.crearPersona();
    srv.crearPerro();
    srv.adopcion();
    srv.mostrarDuenios();
    }
    
}
