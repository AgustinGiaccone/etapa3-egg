//Dado el método metodoA de la clase A, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?

//class A {
//public void metodoA() {
//sentencia_a1
//sentencia_a2
//try {
//sentencia_a3
//sentencia_a4
//} catch (MioException e){
//sentencia_a6
//}
//sentencia_a5
//}
//}

package main;

import sentencia.Sentencia;

public class Main {

    public static void main(String[] args) {
        Sentencia a = new Sentencia();
        try{
            System.out.println("sin MioExeption");
            a.metodoA(10, 4);
            System.out.println();
            
            System.out.println("con MioExeption");
            a.metodoA(10, 0);
        }catch(Exception  e){
            System.out.println("Exeption "+ e.getMessage());
        }
    }
}
