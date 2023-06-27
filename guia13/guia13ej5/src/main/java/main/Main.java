//Escribir un programa en Java que juegue con el usuario a adivinar un número.

//La computadora debe generar un número aleatorio entre 1 y 500, 
// y el usuario tiene que intentar adivinarlo. 

// Para ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
//número que tiene que adivinar es mayor o menor que el que ha introducido el usuario.

// Cuando consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
//ha intentado adivinar el número. 

// Si el usuario introduce algo que no es un número, se debe
//controlar esa excepción e indicarlo por pantalla. 
//En este último caso también se debe contar el
//carácter fallido como un intento.
package main;

import entidad.NumeroRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumeroRandom numR = new NumeroRandom();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numeroaleatorio = numR.generarNumero();
        int intentosFallidos= 0;
        
        System.out.println("adivina el numero entre 1 y 500");
        
        while(true){
            try{
                int numUsuario = numR.ingrearNumero();
                intentosFallidos ++;
                
                if(numUsuario == numeroaleatorio){
                    System.out.println("Correcto!!! ADIVINASTE");
                    System.out.println("tuviste "+ intentosFallidos+" intentos ");
                    break;
                }else if(numUsuario < numeroaleatorio){
                    System.out.println("el numero a adivinar es mayor.");
                }else{
                    System.out.println("el numero a adivinar es menor."); 
                }
            }catch(InputMismatchException e ){
                intentosFallidos++;
                System.out.println("ERRRRRRRRRRRROOOOOOOOORRRRRRR " +e.getMessage());
                leer.nextLine();
            }
        }
    }
}
