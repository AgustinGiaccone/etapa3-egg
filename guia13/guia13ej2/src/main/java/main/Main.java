//Definir una Clase que contenga algún tipo de dato de tipo array
//y agregue el código para
//generar y capturar una excepción ArrayIndexOutOfBoundsException
//(índice de arreglo fuera
//de rango).
package main;

public class Main {

    public static void main(String[] args) {
        
        String[] dato= new String[5];
        
        try {
            dato[5]= "algo";
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("incorrecto "+ e.getMessage());
        }
    }
}
