
package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.*/

public class alumnosServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Alumno> alumnos = new ArrayList();
    
    
    ///////  CREAR ALUMNO
    public void crearAlumno(){
        int decision = 1;
        do {
            System.out.println("Ingrese el nombre de alumno");
            String nombre = leer.next();
            
            List<Integer> notas = new ArrayList<>();
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la "+(i+1)+"° nota del alumno");
                int nota = leer.nextInt();
                if (nota>10 || nota <0) {
                    System.out.println("nota invalida");
                    if (i>=0) {
                        i--;
                    }
                }else   {
                    notas.add(nota);
                }
            }
            Alumno x = new Alumno(nombre,(ArrayList<Integer>)notas);
            
            alumnos.add(x);
            
            do {
                System.out.println("Desea agregar otro alumno?(1=SI)-(2=NO)");
                decision = leer.nextInt();
                if ( decision !=1 && decision !=2){
                    System.out.println("incorrecto, intentelo nuevamente");
                }
            } while (decision!=1 && decision!=2);
            
        } while (decision == 1);
    
    }
    
    
    public void notaFinal(){
        System.out.println("ingrese el nombre del alumno para calcular su nota final: ");
        String nombreAlumno = leer.next();
        
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                List<Integer> notas = alumno.getNotas();
                int sum=0;
                for (Integer nota : notas) {
                    sum += nota;
                    System.out.println("la suma de todas sus notas es: "+sum);
                }
                double promedio=(double)sum/notas.size();
                System.out.println("El promedio final del alumno: "+alumno.getNombre()+ " es de: [ "+promedio+"]");
                return;
            }
        }
        System.out.println("no se encuentra el alumno");
    }
    
    /////// MOSTRAR ALUMNO
    public void mostrarAlumno(){
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre()+": "+alumno.getNotas());
        }
    }
    /////////  MOSTRAR EN EL MAIN
    public void ejecutar(){
        crearAlumno();
        mostrarAlumno();
        notaFinal();
    }
}
