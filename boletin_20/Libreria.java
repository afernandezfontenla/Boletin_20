/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_20;

/**
 *
 * @author Nuevo usuario
 */
public class Libreria {

    String titulo;
    String autor;
    String ISBN;
    float prezo;
    int numeroDeUnidades;

    public Libreria(String titulo, String autor, String ISBN, float prezo, int numeroDeUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.numeroDeUnidades = numeroDeUnidades;
    }

    public Libreria() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getNumeroDeUnidades() {
        return numeroDeUnidades;
    }

    public void setNumeroDeUnidades(int numeroDeUnidades) {
        this.numeroDeUnidades = numeroDeUnidades;
    }

}
