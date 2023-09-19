/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 * ISBN, Título, Autor, Número de páginas
 *
 * @author merce
 */
public class Libro {

    private int ISBN;
    private String Titulo;
    private String Autor;
    private int numeroDePaginas;

    public Libro() {

    }

    public Libro(int ISBN, String Titulo, String Autor, int numeroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numeroDePaginas = numeroDePaginas;

    }

    public void setTitulo(String Titulo) {
        if (Titulo.length() > 0) {
            this.Titulo = Titulo;
        }

    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", numeroDePaginas=" + numeroDePaginas + '}';
    }
    
    
}
