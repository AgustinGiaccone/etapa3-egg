
package main;

import entidad.Estudiante;
import entidad.Persona;
import entidad.PersonalDeServicio;
import entidad.Profesor;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.Servicios;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Servicios sv = new Servicios();
        
        System.out.println("¡Bienvenido!");
        
        ArrayList<Persona> personas = new ArrayList<>();
        
        int num_cargas=1;
        int respuesta;
        do{
            System.out.println("-------------------------------------------");
            System.out.println("Ingrese una opción: ");
            System.out.println("1-CARGAR PERSONAL  2-REALIZAR CAMBIOS   3-MOSTRAR TODOS   4-SALIR");
            respuesta = sc.nextInt();
            
            switch (respuesta) {
                case 1:
                    System.out.println("------ CARGA N°" + num_cargas + " ------");
                    num_cargas++;
                    System.out.println("1-Profesor  2-Personal de Servicio  3-Estudiante");
                    int eleccion = sc.nextInt();
                    switch (eleccion) {
                        case 1:
                            Profesor profe = new Profesor();
                            profe.crear();
                            personas.add(profe);
                            break;
                        case 2:
                            PersonalDeServicio servi = new PersonalDeServicio();
                            servi.crear();
                            personas.add(servi);
                            break;
                        case 3:
                            Estudiante estu = new Estudiante();
                            estu.crear();
                            personas.add(estu);
                            break;
                        default:
                            System.out.println("Opción inválida");
                            break;
                    }
                    break;
                    
                    
                case 2:
                    System.out.println("Elija su Puesto o Cargo: ");
                    System.out.println("1-ESTUDIANTE   2-PROFESOR   3-PERSONAL DE SERVICIO");
                    int puesto = sc.nextInt();
                    switch (puesto) {
                        case 1:
                            ///si es ESTUDIANTE:
                            sv.opcionesDeCambioEstudiante(personas);
                            break;
                        case 2:
                            ///si es PROFESOR:
                            sv.opcionesDeCambioProfesor(personas);
                            break;
                        case 3:
                            ///si es PERSONAL DE SERVICIO
                            sv.opcionesDeCambioPersonal(personas);
                            break;
                        default:
                            System.out.println("Opción inválida");
                            break;
                    }
                    break;
                    
                    case 3:
                    //MOSTRAR TODOS
                        for (Persona aux : personas) {
                            System.out.println(aux.toString());
                        }
                    break;
                    
                case 4:
                    System.out.println("Saliendo del Sistema...");
                    break;
                    
                default:
                    System.out.println("Opción Inválida");
                    break;
            }
            }while(respuesta!=4);
  
    }
    
    
    
}
