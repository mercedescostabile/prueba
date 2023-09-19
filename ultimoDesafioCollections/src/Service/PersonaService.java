/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Persona;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author merce
 */
public class PersonaService {

    private Scanner sc;
    HashSet<Persona> clientes;

    public PersonaService() {

        //  this.newMap = new HashMap<>(); // Creo el espacio en memoria del MAPA
        this.sc = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
        this.clientes = new HashSet<>();

    }

    public void crearPersona() {

        String opcion;
        do {

            Persona p1 = new Persona();
            System.out.println("Ingrese el nombre");
            p1.setNombre(sc.next());
            System.out.println("Ingrese el DNI");
            p1.setDni(sc.nextInt());
            System.out.println("Ingrese el Pais");
            p1.setPais(sc.next());
            System.out.println("Ingrese la edad");
            p1.setEdad(sc.nextInt());
            

            clientes.add(p1);

            System.out.println("Deasea agregar a la lista S/N");
            opcion = sc.next();

        } while (opcion.equalsIgnoreCase("s"));
    }

    public void mostrarClientes() {

        for (Persona cliente : clientes) {
            
            System.out.println(cliente);
            
        }
    }

}
