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
package entidad;

import servicio.MioException;

public class ClaseB {

    public void metodoB() {
        int uno = 0;
        int dos = 2;
        System.out.println("---------------");
        System.out.println("b1: " + (uno + dos));
        System.out.println("b2: " + (uno - dos));
        System.out.println("b3: " + (uno * dos));
        System.out.println("b4: " + (uno / dos));
        System.out.println("---------------");
        try {
            System.out.println("---------------");
            System.out.println("b1: " + (uno + dos));
            System.out.println("b2: " + (uno - dos));
            System.out.println("b3: " + (uno * dos));
            System.out.println("b4: " + (uno / dos));
            System.out.println("---------------");
            throw new MioException("ahora empieza");

        } catch (MioException mioException) {
            System.out.println("ahora...." + mioException.getMessage());
            System.out.println("---------------");
            System.out.println("b1: " + (uno + dos));
            System.out.println("b2: " + (uno - dos));
            System.out.println("b3: " + (uno * dos));
            System.out.println("b4: " + (uno / dos));
            System.out.println("---------------");
        } finally {
            System.out.println("Sigamos? ");
            System.out.println("---------------");
            System.out.println("b1: " + (uno + dos));
            System.out.println("b2: " + (uno - dos));
            System.out.println("b3: " + (uno * dos));
            System.out.println("b4: " + (uno / dos));
            System.out.println("---------------");
        }

    }
}
