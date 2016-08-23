/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author lab
 */
public class Pelicula {
    
    String codigo;
    String Titulo;
    String director;
    String actores;

    public Pelicula(String codigo, String Titulo, String director, String actores) {
        this.codigo = codigo;
        this.Titulo = Titulo;
        this.director = director;
        this.actores = actores;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }
    
    
    
}
