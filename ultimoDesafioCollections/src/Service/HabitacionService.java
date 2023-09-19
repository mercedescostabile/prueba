/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Habitacion;
import Entidades.Persona;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author merce
 */
public class HabitacionService {

    private Scanner sc;
    HashSet<Habitacion> habitaciones;

    public HabitacionService() {

        //  this.newMap = new HashMap<>(); // Creo el espacio en memoria del MAPA
        this.sc = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
        this.habitaciones = new HashSet<>();

    }

    public void crearHabitacion() {
        String opcion;
        do {
            Habitacion hab = new Habitacion();
            System.out.println("Ingrese el numero de habitacion");
            hab.setNumero(sc.nextInt());
            System.out.println("Ingrese la fecha de inicio de su reserva (aaaa-mm-dd): ");
            String checkIn = sc.next();
            LocalDate fechaCheckIn = LocalDate.parse(checkIn);
            hab.setFechaOcupacion(fechaCheckIn);
            
            habitaciones.add(hab);
            do {
                System.out.println("Quiere agregar otra habitacion? (S/N)");
                opcion = sc.next();
            } while (!opcion.equalsIgnoreCase("S") & !opcion.equalsIgnoreCase("N"));
        } while (opcion.equalsIgnoreCase("S"));
    }
    
     public void mostrarHab() {

        for (Habitacion hab : habitaciones) {
            
            System.out.println(hab);
            
        }
}

}