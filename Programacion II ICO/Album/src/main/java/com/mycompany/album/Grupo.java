
package com.mycompany.album;

import java.util.List;

public class Grupo {
    
    private int id;
    private String nombre;
  
    public List<Cancion> getCanciones() {
        return canciones;
    }
public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }
    private List<Cancion> canciones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Album{" + "id=" + id + ", nombreAlbum=" + nombre + ", canciones=" + canciones + '}';
    }
    

    
    
}
