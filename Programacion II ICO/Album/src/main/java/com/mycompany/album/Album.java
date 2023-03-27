
package com.mycompany.album;

import java.util.ArrayList;
import java.util.List;

public class Album {
 
   public static void main(String[] args) {
        
        Genero genero1 = new Genero();
        genero1.setId(23);
        genero1.setGenero("Electronica");
        
        Genero genero2 = new Genero();
        genero2.setId(31);
        genero2.setGenero("Hevy Metal");
        
        Genero genero3 = new Genero();
        genero3.setId(1);
        genero3.setGenero("Rock");
        
        Artista artista1 = new Artista();
        artista1.setId(4);
        artista1.setNombre_art("Trevor");
        artista1.setNombre_art("Fiji Blue");
        
        Artista artista2 = new Artista();
        artista2.setId(3);
        artista2.setNombre_art("Ed Maverick");
        artista2.setNombre_art("Eduardo");
        
        Artista artista3 = new Artista();
        artista3.setId(37);
        artista3.setNombre_art("Skrillex");
        artista3.setNombre_art("Sonny");
        
        Cancion cancion1 = new Cancion();
        cancion1.setId(34);
        cancion1.setNombreCancion("Butterflies");
        cancion1.setMin(256);
        cancion1.setArtista(artista1);
        cancion1.setGenero(genero2);
        
        Cancion cancion2 = new Cancion();
        cancion2.setId(34);
        cancion2.setNombreCancion("It Takes Two");
        cancion2.setMin(257);
        cancion2.setArtista(artista1);
        cancion2.setGenero(genero2);
        
        Cancion cancion3 = new Cancion();
        cancion3.setId(34);
        cancion3.setNombreCancion("niño,");
        cancion3.setMin(256);
        cancion3.setArtista(artista2);
        cancion3.setGenero(genero2);
        
        Cancion cancion4 = new Cancion();
        cancion4.setId(34);
        cancion4.setNombreCancion("SELECTA");
        cancion4.setMin(256);
        cancion4.setArtista(artista3);
        cancion4.setGenero(genero3);
        
        Cancion cancion5 = new Cancion();
        cancion5.setId(34);
        cancion5.setNombreCancion("Real Spring");
        cancion5.setMin(256);
        cancion5.setArtista(artista3);
        cancion5.setGenero(genero3);
        
        List<Cancion> album = new ArrayList<>();
        album.add(cancion1);
        album.add(cancion2);
        
        List<Cancion> album2 = new ArrayList<>();
        album2.add(cancion3);
        
        List<Cancion> album3 = new ArrayList<>();
        album3.add(cancion4);
        album3.add(cancion5);
        
        System.out.println(album);
        System.out.println(album2);
        System.out.println(album3);
    }

  
  
}
        
    

