
package main;

import entidad.Persona;
//import java.util.Scanner;
import servicio.PersonaServicio;

public class Main {

    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PersonaServicio unaPersona = new PersonaServicio();
        Persona[] pacientes = new Persona[4];

        int CuantosIMC = 0;
        int CuantosIMCBajo = 0;
        int CuantosMayores = 0;

        for (int i = 0; i < pacientes.length; i++) {

                pacientes[i] = unaPersona.crearPersona();
                

            try {
                if (unaPersona.esMayorDeEdad(pacientes[i])) {
                    System.out.println("El paciente es mayor de edad");
                    CuantosMayores += 1;
                } else {
                    System.out.println("Paceinte menor de edad");
                }
            } catch (Exception e) {
                System.out.println( e.getMessage());
            }
     
                
                byte Exceso = unaPersona.calcularIMC(pacientes[i]);
                if (Exceso < 0) {
                    CuantosIMCBajo++;
                    System.out.println("Paciente de bajo peso");
                } else if (Exceso > 0) {
                    CuantosIMC++;
                    System.out.println("Paciente de alto peso");
                } else {
                    System.out.println("El Paciente tiene peso ideal");
                }
                System.out.println("Fin de paciente actual..");

        }

        System.out.println("Los Pacientes con bajo peso son : " + (CuantosIMCBajo * 100 / 4)
                + "%\nLos pacientes con alto peso :" + (CuantosIMC * 100 / 4)
                + "%\nLos Mayores de edad son " + CuantosMayores);

    }

}
