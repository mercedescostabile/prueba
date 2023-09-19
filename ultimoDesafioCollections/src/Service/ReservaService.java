/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Reserva;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author merce
 */
public class ReservaService {
    
    public Reserva crearReserva( HabitacionService hs) {
        Scanner scann = new Scanner(System.in);
       // HabitacionService hs =new HabitacionService();
        
        String idReserva = String.valueOf(java.util.UUID.randomUUID().toString());
        System.out.println("El número de su reserva es: " + idReserva);
        System.out.println("Indique la cantidad de persona que tendrá la reserva");
        int cantidadPersonas = scann.nextInt();
        System.out.println("Ingrese la fecha de inicio de su reserva (aaaa-mm-dd): ");
        String checkIn = scann.next();
        LocalDate fechaCheckIn = LocalDate.parse(checkIn);
        System.out.println("Ingrese la fecha de fin de su reserva (aaaa-mm-dd): ");
        String checkOut = scann.next();
        LocalDate fechaCheckOut = LocalDate.parse(checkOut);
        
        hs.mostrarHab();
        System.out.println("Indique el número de la habitaci+on que desea ocupar: ");
       
        int numeroHabitacion = scann.nextInt();

        return new Reserva(idReserva, numeroHabitacion, cantidadPersonas, fechaCheckIn, fechaCheckOut);
    }


    public void agregarReserva(HashSet<Reserva> listaReservas) {
        listaReservas.add(crearReserva());
        System.out.println("Reserva agregada a la lista");
    }

    public void mostrarReserva(HashSet<Reserva> listaReservas) {

        for (Reserva reserva : listaReservas) {
            System.out.println(reserva.toString());
        }
    }

    public void modificarReserva(HashSet<Reserva> listaReservas) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese el ID de la Reserva que desea modificar: ");
        String reservaBuscada = scann.next();
        for (Reserva reserva : listaReservas) {

            if (reserva.getId() == reservaBuscada) {
                System.out.println("Reserva encontrada");
                System.out.print("| Reserva N°:" + reserva.getId() + " | ");
                System.out.print("Pax:" + reserva.getCantidadPersonas() + " | ");
                System.out.print("CheckIn:" + reserva.getFechaCheckIn() + " | ");
                System.out.print("CheckOut:" + reserva.getFechaCheckOut() + " |");

                System.out.println("Indique el atributo que desea modificar:");
                System.out.println("\n 1. Pax" + "\n 2. Habitación" + "\n 3. F. CheckIn" + "\n 4. F. CheckOut");

                int opt = scann.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Indique la nueva cantidad de personas.");
                        reserva.setCantidadPersonas(scann.nextInt());
                        break;
                    case 2:
                        System.out.println("Asigne la nueva Habitación: ");
                        reserva.setCantidadPersonas(scann.nextInt());
                        break;
                    case 3:
                        System.out.println("Asigne la nueva fecha de ingreso (aaaa-mm-dd): ");
                        String checkIn = scann.next();
                        reserva.setFechaCheckIn(LocalDate.parse(checkIn));
                        break;
                    case 4:
                        System.out.println("Asigne la nueva fecha de salida (aaaa-mm-dd): ");
                        String checkOut = scann.next();
                        reserva.setFechaCheckIn(LocalDate.parse(checkOut));
                        break;

                    default:
                        System.out.println("Opción inválida");
                        break;
                }

            }
        }
    }
    
}
