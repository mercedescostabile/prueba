/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidades;

import java.time.LocalDate;
import java.util.Calendar;

public class Habitacion {
    private int numero;
    private LocalDate fechaOcupacion;

    public Habitacion() {}


    public Habitacion(int numero, LocalDate fechaOcupacion) {
        this.numero = numero;
        this.fechaOcupacion = fechaOcupacion;
    }


    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate  getFechaOcupacion() {
        return this.fechaOcupacion;
    }

    public void setFechaOcupacion(LocalDate  fechaOcupacion) {
        this.fechaOcupacion = fechaOcupacion;
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", fechaOcupacion='" + getFechaOcupacion() + "'" +
            "}";
    }


}



