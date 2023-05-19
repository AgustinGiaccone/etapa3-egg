package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ejemplo_pag_8 {

    public static void main(String[] args) {
      //LISTA:
      ArrayList<Integer> numerosA = new ArrayList(); //lista de tipod Integer
      int x = 20;
      int x1 = 30;
      int x2 = 40;
      int x3 = 50;
      int x4 = 60;
      int x5 = 70;
      numerosA.add(x);// agregamos el numero 20 a la lista en la posicion 0
      numerosA.add(x1);
      numerosA.add(x2);
      numerosA.add(x3);
      numerosA.add(x4);
      numerosA.add(x5);
      //mostrar por pantalla
        
        System.out.println("los numeros de ArrayList son: "+numerosA);
            
      //CONJUNTOS:
      HashSet<Integer> numerosB=new HashSet();
      Integer y = 20;
      Integer y1 = 300;
      Integer y2 = 400;
      Integer y3 = 500;
      Integer y4 = 600;
      Integer y5 = 700;
      numerosB.add(y);
      numerosB.add(y1);
      numerosB.add(y2);
      numerosB.add(y3);
      numerosB.add(y4);
      numerosB.add(y5);
        System.out.println("los numeros del HashSet son: "+numerosB);
      //MAPAS:
      
      HashMap<Integer, String> alumnos = new HashMap();
      int dni =34576189;
      int dni1 =111111111;
      int dni2 =222222222;
      int dni3 =333333333;
      int dni4 =444444444;
      int dni5 =555555555;
      String nombreAlumno = "pepe";
      String nombreAlumno1 = "pepe1"; 
      String nombreAlumno2 = "pepe2"; 
      String nombreAlumno3 = "pepe3"; 
      String nombreAlumno4 = "pepe4"; 
      String nombreAlumno5 = "pepe5"; 
      
      alumnos.put(dni,nombreAlumno); //agregamos la llave y el valor
      alumnos.put(dni1,nombreAlumno1);
      alumnos.put(dni2,nombreAlumno2);
      alumnos.put(dni3,nombreAlumno3);
      alumnos.put(dni4,nombreAlumno4);
      alumnos.put(dni5,nombreAlumno5);
        System.out.println(alumnos);
    }
    
}
