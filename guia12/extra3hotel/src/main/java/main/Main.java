

package main;

import entidad.Alojamiento;
import entidad.Camping;
import entidad.Hotel;
import entidad.Hotel4Estrellas;
import entidad.Hotel5Estrellas;
import entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        
        
        int rta=1;
        int menu = 0;
        do{
            System.out.println("¡Bienvenido al Sistema de Hotelería!");
            System.out.println("Ingresa el Tipo de Alojamiento que deseas Cargar:");
            System.out.println("1-HOTEL(4 estrellas)   2-HOTEL(5 estrellas)   3-CAMPING   4-RESIDENCIA");
            rta = sc.nextInt();
            
            
            switch (rta) {
                case 1:
                    Hotel4Estrellas hotel1 = new Hotel4Estrellas();
                    hotel1.crear();
                    alojamientos.add(hotel1);
                    break;
                    
                case 2:
                    Hotel5Estrellas hotel2 = new Hotel5Estrellas();
                    hotel2.crear();
                    alojamientos.add(hotel2);
                    break;
                    
                case 3:
                    Camping camping = new Camping();
                    camping.crear();
                    alojamientos.add(camping);
                    break;
                    
                case 4:
                    Residencia resi = new Residencia();
                    resi.crear();
                    alojamientos.add(resi);
                    break;
                    
                default:
                    System.out.println("Respuesta Inválida");
                    break;
            }
            
            System.out.println("¿Seguir Agregando?  1-SI  2-NO");
            menu = sc.nextInt();
            
        }while(menu!=2);
        
        
        ArrayList<Hotel> hoteles2 = new ArrayList<>();
        
        
        System.out.println("---------- LISTADO DE ALOJAMIENTOS ----------");
        int contador = 1;
        for (Alojamiento aux : alojamientos) {
            if(aux instanceof Hotel){
                hoteles2.add((Hotel) aux);
            }
            System.out.println(contador + "- " + aux.toString());
        }
        System.out.println("---------------------------------------------");
        System.out.println("");
        
        
       
        ///creo el comparator para precios de hotel
        Comparator<Hotel> comparadorHotel = new Comparator<Hotel>() {
    @Override
    public int compare(Hotel h1, Hotel h2) {
        return h1.precio - h2.precio;
    }
};
     
        Collections.sort(hoteles2, comparadorHotel);
        
        System.out.println("---------- HOTELES (ORDENADOS MAYOR A MENOR) ----------");
        System.out.println(hoteles2);
        System.out.println("---------------------------------------------");
        
        
        


    }  
}
