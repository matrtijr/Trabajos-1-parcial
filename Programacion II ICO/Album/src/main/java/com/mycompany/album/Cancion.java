
package com.mycompany.album;


public class Cancion {

    private int id;
    private String nomCancion;
    private int min;
    private Artista artista;
    private Genero genero;

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomCancion() {
        return nomCancion;
    }

    public void setNombreCancion(String nomCancion) {
        this.nomCancion = nomCancion;
    }

    public int getDuracion() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "Cancion{" + "id=" + id + ", nombreCancion=" + nomCancion + ", duracion=" + min + ", artista=" + artista + ", genero=" + genero + '}';
    }

    
}
