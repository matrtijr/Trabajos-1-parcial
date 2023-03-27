
package com.mycompany.album;


public class Persona {
 private int id;
private String nombre;
private String Apellidop;
private String Apellidom;
private int fechanaci;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return Apellidop;
    }

    public void setApellidop(String Apellidop) {
        this.Apellidop = Apellidop;
    }

    public String getApellidom() {
        return Apellidom;
    }

    public void setApellidom(String Apellidom) {
        this.Apellidom = Apellidom;
    }

    public int getFechanaci() {
        return fechanaci;
    }

    public void setFechanaci(int fechanaci) {
        this.fechanaci = fechanaci;
    }

     @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellidoPaterno=" + Apellidop + ", apellidoMaterno=" + Apellidom + ",";
    }


}
