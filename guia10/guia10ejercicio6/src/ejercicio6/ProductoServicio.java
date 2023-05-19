package ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
public class ProductoServicio {
    HashMap<String,Double>productos=new HashMap<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void agregarProducto(){
        System.out.println("Ingrese el nombre del producto: ");
        String nombreProducto=leer.nextLine();
        System.out.println("Ingrese el precio de ese producto: ");
        double precio=leer.nextDouble();
        leer.nextLine();
        
        if (productos.containsKey(nombreProducto)) {
            System.out.println("el producto ya existe");
        }
        
        productos.put(nombreProducto, precio);
        System.out.println("!!!!!!producto agregado!!!!!!");
    }
    
    public void modificarPrecio(){
        System.out.println("Ingrese el nombre del producto: ");
        String nombre= leer.nextLine();
        if (productos.containsKey(nombre)) {
            System.out.println("Ingrese el nuevo precio del producto: ");
            double nuevoPrecio= leer.nextDouble();
            
            productos.put(nombre, nuevoPrecio);
            System.out.println("el precio del producto se actualizo");
        }else{
            System.out.println("Ese producto no existe");
        }
    }
    
    public void eliminarProducto() {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = leer.nextLine();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }
    
    public void mostrarProductos() {
        System.out.println("------- PRODUCTOS -------");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String nombre = entry.getKey();
            double precio = entry.getValue();
            System.out.println(nombre + " - Precio: " + precio);
        }
    }
            
}
