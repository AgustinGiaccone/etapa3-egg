
package servicio;

import entidad.Estudiante;
import entidad.Persona;
import entidad.PersonalDeServicio;
import entidad.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicios {
  ArrayList<Estudiante> estudiantes = new ArrayList<>();
     ArrayList<Profesor> profesores = new ArrayList<>();
     ArrayList<PersonalDeServicio> personales = new ArrayList<>();
     
     Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void opcionesDeCambioEstudiante(ArrayList<Persona> personas){
        estudiantes = new ArrayList<>();
        int contador = 1;
        System.out.println("-------------------------------------------");
            System.out.println("Bienvenido al Sistema de Estudiantes:");
            System.out.println("");
            System.out.println("-------------------------------------------");
        for (Persona aux : personas) {
            if(aux instanceof Estudiante){
                System.out.println(contador + "- " + ((Estudiante) aux).toStringCorto());
                estudiantes.add((Estudiante) aux);
                contador++;
            }}
        System.out.println("-------------------------------------------");
            System.out.println("Ingrese el número del estudiante que desea modificar: ");
            int eleccion = sc.nextInt();
            
            System.out.println("1-Cambiar Estado Civil    2-Cambiar Curso");
            int eleccion2 = sc.nextInt();
            
            if(eleccion2==1){
                estudiantes.get(eleccion-1).cambiarEstadoCivil();
                System.out.println("¡Cambios Realizados Exitosamente!");
            }else if(eleccion2==2){
                estudiantes.get(eleccion-1).cambiarCurso();
                System.out.println("¡Cambios Realizados Exitosamente!");
            }else{
                System.out.println("Opción Inválida");
            }
            
    }
    
    
    
        public void opcionesDeCambioProfesor(ArrayList<Persona> personas){
        profesores = new ArrayList<>();
        int contador = 1;
        System.out.println("-------------------------------------------");
        System.out.println("Bienvenido al Sistema de Profesores:");
        System.out.println("-------------------------------------------");
        for (Persona aux : personas) {
            if(aux instanceof Profesor){
                System.out.println(contador + "- " + ((Profesor) aux).toStringCorto());
                profesores.add((Profesor) aux);
                contador++;
            }}
        System.out.println("-------------------------------------------");
            System.out.println("Ingrese el número del profesor que desea modificar: ");
            int eleccion = sc.nextInt();
            
            System.out.println("1-Cambiar Estado Civil    2-Cambiar de Despacho   3-Cambiar de Departamento");
            int eleccion2 = sc.nextInt();
            
  
            if(eleccion2 == 1){
                profesores.get(eleccion-1).cambiarEstadoCivil();
                System.out.println("¡Cambios Realizados Exitosamente!");
            }else if(eleccion2 == 2){
                profesores.get(eleccion-1).asignarDespacho();
                System.out.println("¡Cambios Realizados Exitosamente!");
            }else if(eleccion2 == 3){
                profesores.get(eleccion-1).cambiarDepartamento();
                System.out.println("¡Cambios Realizados Exitosamente!");
            }else{
                System.out.println("Opción Inválida");
            }
        
    }
    
    
            public void opcionesDeCambioPersonal(ArrayList<Persona> personas){
        personales = new ArrayList<>();
        int contador = 1;
        System.out.println("-------------------------------------------");
            System.out.println("Bienvenido al Sistema de Personal de Servicio:");
             System.out.println("-------------------------------------------");
        for (Persona aux : personas) {
            if(aux instanceof PersonalDeServicio){
                System.out.println(contador + "- " + ((PersonalDeServicio)aux).toStringCorto());
                personales.add((PersonalDeServicio) aux);
                contador++;
            }}
        System.out.println("-------------------------------------------");
            System.out.println("Ingrese el número del Personal de Servicio que desea modificar: ");
            int eleccion = sc.nextInt();
            
            System.out.println("1-Cambiar Estado Civil    2-Cambiar de Despacho   3-Cambio de Sección");
            int eleccion2 = sc.nextInt();
            
            if(eleccion2==1){
                personales.get(eleccion-1).cambiarEstadoCivil();
                System.out.println("¡Cambios Realizados Exitosamente!");
            }else if(eleccion2 == 2){
                personales.get(eleccion-1).asignarDespacho();
                System.out.println("¡Cambios Realizados Exitosamente!");
            }else if(eleccion2 == 3){
                personales.get(eleccion-1).cambiarSeccion();
                System.out.println("¡Cambios Realizados Exitosamente!");
            }else{
                System.out.println("Opción Inválida");
            }
    }
    
    
    
    
    
    
}
