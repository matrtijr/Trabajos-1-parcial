
package com.mycompany.album;


public class Genero {
    private int id;
    private String genero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        return "Genero{" + "id=" + id + ", nombreGenero=" + genero + '}';
    }
    
}
