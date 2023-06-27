//Dado el método metodoB de la clase B, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
//class B {
//public void metodoB() {
//sentencia_b1
//try {
//sentencia_b2
//} catch (MioException e){
//sentencia_b3
//}
//finally
//sentencia_b4
//}
//}
package main;

import entidad.ClaseB;

public class Main {

    public static void main(String[] args) {
        ClaseB metodoB = new ClaseB();
        System.out.println("Estamos haciendo metodoB...");
        metodoB.metodoB();
    }
}
