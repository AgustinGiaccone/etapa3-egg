package ejercicio6;

import java.util.Scanner;

/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
public class main6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoServicio sv= new ProductoServicio();

        String menu = "";
        while (!menu.equalsIgnoreCase("5")) {
            System.out.println("________MENU________");
            System.out.println("1)Agregar un producto");
            System.out.println("2)Modifica el precio de un producto");
            System.out.println("3)Elimina un producto");
            System.out.println("4)mostrar los productos");
            System.out.println("5)salir");
            System.out.println("ingrese una opcion:");
            menu = leer.nextLine().toLowerCase();

            switch (menu) {
                case "1":
                    sv.agregarProducto();
                    break;
                case "2":
                    sv.modificarPrecio();
                    break;
                case "3":
                    sv.eliminarProducto();
                    break;
                case "4":
                    sv.mostrarProductos();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese una opcion del menu");
                    break;
            }
            System.out.println();
        }
    }

}