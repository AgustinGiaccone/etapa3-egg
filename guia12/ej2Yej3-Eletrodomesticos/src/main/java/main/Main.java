
package main;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.LavadoraServicio;
import servicio.TelevisorServicio;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        LavadoraServicio ls = new LavadoraServicio();
        TelevisorServicio ts = new TelevisorServicio();
        for (int i = 0; i < 4; i++) {
            System.out.println("1- Crear lavadora");
            System.out.println("2- Crear televisor");
            switch (leer.nextInt()) {
                case 1:
                    electrodomesticos.add(ls.crearLavadora());
                    break;
                case 2:
                    electrodomesticos.add(ts.crearTelevisor());
                    break;
            }
        }
        double precioFinalTele = 0;
        double precioFinalLavadora = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) electrodomestico;
                double precioLavadora = ls.precioFinal(lavadora);
                precioFinalLavadora += precioLavadora;
                System.out.println("El precio de la lavadora es de: " + precioLavadora);
            } else if (electrodomestico instanceof Televisor) {
                Televisor televisor = (Televisor) electrodomestico;
                double precioTele = ts.precioFinal(televisor);
                precioFinalTele += precioTele;
                System.out.println("El precio del tele es de: " + precioTele);
            }
        }

        System.out.println("El monto final por los televisores es de " + precioFinalTele);
        System.out.println("El monto final por las lavadoras es de " + precioFinalLavadora);
    }

}
