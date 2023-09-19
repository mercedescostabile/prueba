/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author merce
 */
public class Reserva {
      private String id;
    private int numeroHabitacion, cantidadPersonas;
    private LocalDate fechaCheckIn, fechaCheckOut;
    
    public Reserva() {
    }
    public Reserva(String id, int numeroHabitacion, int cantidadPersonas, LocalDate fechaCheckIn,
            LocalDate fechaCheckOut) {
        this.id = id;
        this.numeroHabitacion = numeroHabitacion;
        this.cantidadPersonas = cantidadPersonas;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public LocalDate getFechaCheckIn() {
        return fechaCheckIn;
    }

    public void setFechaCheckIn(LocalDate fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    public LocalDate getFechaCheckOut() {
        return fechaCheckOut;
    }

    public void setFechaCheckOut(LocalDate fechaCheckOut) {
        this.fechaCheckOut = fechaCheckOut;
    }
    @Override
    public String toString() {
        return "Reserva [id=" + id + ", numeroHabitacion=" + numeroHabitacion + ", cantidadPersonas=" + cantidadPersonas
                + ", fechaCheckIn=" + fechaCheckIn + ", fechaCheckOut=" + fechaCheckOut + "]";
    }
    
    
}
