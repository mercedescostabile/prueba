/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ultimodesafiocollections;

import Entidades.Habitacion;
import Service.HabitacionService;
import Service.PersonaService;
import Service.ReservaService;
import java.util.HashSet;

/**
 *
 * @author merce
 */
public class UltimoDesafioCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaService ps = new PersonaService();
        ReservaService rs = new ReservaService();
        //ps.crearPersona();
        //ps.mostrarClientes();
      
        
        
        HabitacionService hs=new HabitacionService();
        hs.crearHabitacion();
        //hs.mostrarHab();
        rs.crearReserva(hs);
    }
    
}
