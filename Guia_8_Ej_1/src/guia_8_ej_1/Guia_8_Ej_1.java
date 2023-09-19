/*
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas. 

 */
package guia_8_ej_1;
import java.util.Scanner;
import Entidad.Libro;

/**
 *
 * @author merce
 */
public class Guia_8_Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Libro L1 = new Libro ( 30, "Hola Mundo",  "NAdie",  12);//inicializar y doy valor
        Libro L2= new Libro();
        //L2.Autor= leer.next();// assignando valor al atributo instanciando L2
        Libro L3 = new Libro();
        
        llenar(L1);
       mostrar(L1);
    }
    
   public static void llenar(Libro Nuevo){
       Scanner leer = new Scanner(System.in);
       System.out.println(" Ingrese Autor");
       Nuevo.setAutor(leer.next());
       System.out.println(" Ingrese ISBN");
       Nuevo.setISBN(  leer.nextInt());
       System.out.println(" Titulo");
       Nuevo.setTitulo(leer.next());
       System.out.println(" Ingrese numero de paginas");
       Nuevo.setNumeroDePaginas(leer.nextInt());
   }
   
   public static void mostrar(Libro Nuevo) {
    System.out.println(Nuevo.toString());
   }
}
