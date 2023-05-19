
package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
import java.util.Scanner;

public class PeliculaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Pelicula>peli = new ArrayList();
    
    //////////////// CREAR PELICULA()
    public void crearPelicula(){
        System.out.println("------------");
        int d = 1;
        do {
            System.out.println("Ingrese el nom,bre de la pelicula ");
            String nombrePelicula = leer.next();
            System.out.println("Ingrese el director de la pelicula");
            String directorPelicula = leer.next();
            System.out.println("Ingrese la duracion de la pelicula");
            double duracionPelicula= leer.nextInt();
            
            Pelicula p = new Pelicula(nombrePelicula, directorPelicula, duracionPelicula);
                        
            peli.add(p);
            
            System.out.println("quiere ingresar otra pelicula?[Si/No]");
            d=leer.nextInt();
        } while (d==1);      
    }
    
    ////////////// MOSTRAR PELICULAS        
    public void mostrarPeliculas(){
        
        mostrarPelis();
        System.out.println("------------");
        mostrarMayorHora();
        System.out.println("------------");
        menorDuracion();
        System.out.println("------------");
        mayorDuracion();
        System.out.println("-----------");
        tituloAlfabeticamente();
        System.out.println("-----------");
        directorAlfabeticamente();
        System.out.println("-----------");
        ordenarTituloPelicula();
        System.out.println("-----------");
        
    }
    
    public void mostrarPelis(){
        System.out.println("las peliculas que se encuentran son: ");
        for (int i = 0; i < peli.size(); i++) {
            System.out.println((i+1)+". "+ peli.get(i).getPelicula()+": "+ peli.get(i).getHoras()+ "hs ("+peli.get(i).getDirector()+")");
        }
    }
    
    public void mostrarMayorHora(){
        System.out.println("las peliculas que duran mas de 1 hora son:");
        for (int i = 0; i < peli.size(); i++) {
            if (peli.get(i).getHoras()>=1) {
                System.out.println((i+1)+". "+ peli.get(i).getPelicula()+": "+ peli.get(i).getHoras()+ "hs ("+peli.get(i).getDirector()+")");
            }
        }
    }
    
    public void menorDuracion(){
        System.out.println("Pleiculas ordenadas de menor a mayor duracion"); 
        Comparator<Pelicula> comp = Comparator.comparing(Pelicula::getHoras);
        Collections.sort(peli, comp);       
        for (int i = 0; i < peli.size(); i++) {
            System.out.println((i+1)+". "+ peli.get(i).getPelicula()+": "+ peli.get(i).getHoras()+ "hs ("+peli.get(i).getDirector()+")");       
        }
    }
    
    public void mayorDuracion(){
        System.out.println("Pleiculas ordenadas de mayor a menor duracion"); 
        Comparator<Pelicula> comp = Comparator.comparing(Pelicula::getHoras);
        Collections.sort(peli, comp.reversed());       
        for (int i = 0; i < peli.size(); i++) {
            System.out.println((i+1)+". "+ peli.get(i).getPelicula()+": "+ peli.get(i).getHoras()+ "hs ("+peli.get(i).getDirector()+")");       
        }
    }
    
    public void tituloAlfabeticamente(){
        Comparator<Pelicula> comp1 = Comparator.comparing(Pelicula::getPelicula);
        System.out.println("peliculas ordenadas alfabeticamente[a-->z]");
        Collections.sort(peli, comp1);       
        for (int i = 0; i < peli.size(); i++) {
            System.out.println((i+1)+". "+ peli.get(i).getPelicula()+": "+ peli.get(i).getHoras()+ "hs ("+peli.get(i).getDirector()+")");       
        }
    }
    
    public void directorAlfabeticamente(){
        Comparator<Pelicula> comp2 = Comparator.comparing(Pelicula::getDirector);
        System.out.println("Directores ordenadas alfabeticamente[a-->z]");
        Collections.sort(peli, comp2);       
        for (int i = 0; i < peli.size(); i++) {
            System.out.println((i+1)+". "+ peli.get(i).getPelicula()+": "+ peli.get(i).getHoras()+ "hs ("+peli.get(i).getDirector()+")");       
        }
    }
    
    public void ordenarTituloPelicula(){
       /* 
        Comparator<Pelicula> comp = new Comparator<Pelicula>(){
            public int compare(Pelicula p1, Pelicula p2){
                return p1.getPelicula().compareTo(p2.getPelicula());
            }
        };
        Collections.sort(peli, comp);
        System.out.println("------------");
        System.out.println("---PELICULAS ORDENADAS POR TITULO---");
            for (Pelicula peli : peli) {
                System.out.println("Titulo : "+peli.getPelicula()+" Director : "+peli.getDirector()+" Horas : "+ peli.getHoras());
        }*/
    }
    
    
}