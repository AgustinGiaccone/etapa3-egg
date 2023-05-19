package ejercicio1_2_juntos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
1)
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

2)
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
public class main {

    public static void main(String[] args) {
        //1)
        ArrayList<String>razas=new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String res;
        do {
            System.out.println("Ingrese la raza de su perro para la lista: ");
            //String raza=leer.next();
            razas.add(leer.next());
            System.out.println("desea agregar otra raza a la lista: S/N ");
            res = leer.next();
            
            
        } while (!res.equalsIgnoreCase("n"));
        
        System.out.println(razas.toString());
        System.out.println("");
        
        for (String aux : razas) {
            System.out.println(aux.toString());
        }
        
        //2)
        
        /*System.out.println("que raza desea sacar: ");
        String sacarRaza=leer.next();
        Iterator<String> interator = razas.iterator();
        
        while (interator.hasNext()) { 
            String razaLista=interator.next();
            if (razaLista.equalsIgnoreCase(sacarRaza)) {
                interator.remove();
                
            }else if(!interator.hasNext() && !razaLista.equalsIgnoreCase(sacarRaza)){
                System.out.println("la raza no se encuentra. ");               
            }}
        System.out.println(razas.toString());

        System.out.println();
        

        System.out.println("Ingrese una raza que desea sacar: ");
        String razaASacar=leer.next();
        for (String raza : razas) {
            if (raza.equals(razaASacar)) {
                razas.remove(razaASacar);
            }else{
                System.out.println("la raza no esta disponible");
            }
            
        }
        for (String raza : razas) {
            System.out.println(raza.toString());
        }*/
        
        for (int i = 0; i < razas.size(); i++) {
            System.out.println("Raza a sacar:");
            String saca= leer.next();
            if (razas.contains(saca)) {
                razas.remove(saca);
            }else{
                System.out.println("no existe");
            }
            System.out.println(razas.toString());
        }
    }
    
    
}