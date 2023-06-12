/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
*/
package Main;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

public class main {

    public static void main(String[] args) {
            
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
            perro1.Alimentarse();
            System.out.println("Nombre:"+perro1.getNombre()+", es: "+perro1.getAlimento()+", edad: "+ perro1.getEdad()+", raza: "+perro1.getRaza());
        
        Animal perro2 = new Perro("teddy", "Croquetas", 10, "Chiwuahua");
        perro2.Alimentarse();
        System.out.println("Nombre:"+perro2.getNombre()+", come: "+perro2.getAlimento()+", edad: "+ perro2.getEdad()+", raza: "+perro2.getRaza());
        
        Animal gato1 = new Gato("Pelusa", "galletas", 15, "Siames");
        gato1.Alimentarse();
         System.out.println("Nombre:"+gato1.getNombre()+", come: "+gato1.getAlimento()+", edad: "+ gato1.getEdad()+", raza: "+gato1.getRaza());
       
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
         System.out.println("Nombre:"+caballo1.getNombre()+", come: "+caballo1.getAlimento()+", edad: "+ caballo1.getEdad()+", raza: "+caballo1.getRaza());
        
    }
}
