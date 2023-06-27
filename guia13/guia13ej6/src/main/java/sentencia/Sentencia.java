/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentencia;

import exeption.MioExeption;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Sentencia {
    public void metodoA(int a, int b){
        System.out.println("sentencia suma: (a+b): "+(a+b));
        System.out.println("sentencia resta: (a-b): "+(a-b));
        
        try {
            System.out.println("sentencia multiplicacion: (a*b): "+(a*b));
            System.out.println("sentencia division: (a/b): "+(a/b));
            throw new MioExeption("Se produjo una exeption de MioExeption");
        } catch (MioExeption e) {
            System.out.println(e.toString());
        }
    }
}
