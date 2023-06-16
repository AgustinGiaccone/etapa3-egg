
package entidad;

import java.time.LocalDate;

import java.util.Scanner;

public class Alquiler {
    protected String nombre;
    protected Integer documento;
    protected LocalDate fechaDeAlquiler;
    protected LocalDate fechaDeDevolucion;
    protected Integer posicionDeAmarre;
    protected String barcoEnPocesion;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer documento, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolucion, Integer posicionDeAmarre, String barcoEnPocesion) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionDeAmarre = posicionDeAmarre;
        this.barcoEnPocesion = barcoEnPocesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public Integer getPosicionDeAmarre() {
        return posicionDeAmarre;
    }

    public void setPosicionDeAmarre(Integer posicionDeAmarre) {
        this.posicionDeAmarre = posicionDeAmarre;
    }

    public String getBarcoEnPocesion() {
        return barcoEnPocesion;
    }

    public void setBarcoEnPocesion(String barcoEnPocesion) {
        this.barcoEnPocesion = barcoEnPocesion;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaDeAlquiler=" + fechaDeAlquiler + ", fechaDeDevolucion=" + fechaDeDevolucion + ", posicionDeAmarre=" + posicionDeAmarre + ", barcoEnPocesion=" + barcoEnPocesion + '}';
    
    }

    
    public void crear(){
        LocalDate fecha_inicio = LocalDate.of(2023, 1, 1);
        LocalDate fecha_fin = LocalDate.of(2023, 1, 1);
        
        System.out.println("Ingrese el nombre: ");
        this.nombre=leer.next();
        System.out.println("Ingrese el documento: ");
        this.documento=leer.nextInt();
        System.out.println("Ingrese la posicion del amarre: ");
        this.posicionDeAmarre=leer.nextInt();
        System.out.println("Ingrese que barco va a alquilar: ");
        this.barcoEnPocesion=leer.next();
        
        System.out.println("Ingrese N° de Mes de Inicio de Alquiler");
        fecha_inicio = fecha_inicio.withMonth(leer.nextInt());
        System.out.println("Ingrese N° de Dia de Inicio de Alquiler");
        fecha_inicio = fecha_inicio.withDayOfMonth(leer.nextInt());
        
        System.out.println("Ingrese N° de Mes de Devolución de Alquiler");
        fecha_fin = fecha_fin.withMonth(leer.nextInt());
        System.out.println("Ingrese N° de Dia de Devolución de Alquiler");
        fecha_fin = fecha_fin.withDayOfMonth(leer.nextInt());
        
        this.fechaDeAlquiler = fecha_inicio;
        this.fechaDeDevolucion = fecha_fin;
    }
    
    
}
