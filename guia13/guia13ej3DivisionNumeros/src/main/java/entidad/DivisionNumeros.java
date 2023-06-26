//Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
//números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//una división con los dos numeros y mostrar el resultado.
package entidad;

public class DivisionNumeros {
    
    public int division(String numA, String numB){
        //FUNCION Integer.parseInt()
        //CONVIERTE UN NUMERO QUE FUE ASIGNADO COMO STRIN A UN ENTERO(INT)
        int convertirA = Integer.parseInt(numA);
        int convertirB = Integer.parseInt(numB);
        
        return convertirA/convertirB;
    }
}
