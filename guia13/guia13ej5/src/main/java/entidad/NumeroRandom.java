/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class NumeroRandom {
    private int num1;

    public NumeroRandom(int num1) {
        this.num1 = num1;
    }

    public NumeroRandom() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public int generarNumero(){
        Random random = new Random();
        return random.nextInt(500)+1;
    }
    
    public int ingrearNumero(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero: ");
        return leer.nextInt();
    }
}
