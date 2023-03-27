package Ser;

import java.util.ArrayList;
import java.util.List;
import BiblioDan.*;

public interface Servicio {

    public List<Alum> agregarAlumno(Alum alumno);
    public List<Alum> eliminarAlumno(Alum alumno);
    public List<Alum> buscarAlumno(Alum alumno);
    public List<Alum> actualizarAlumno(Alum alumno);
    public ArrayList<Alum> imprimirAlumno(Alum alumno);
    
    public List<Profesor> agregarProfesor(Profesor profesor);
    public List<Profesor> eliminarProfesor(Profesor profesor);
    public List<Profesor> buscarProfesor(Profesor profesor);
    public List<Profesor> actualizarProfesor(Profesor profesor);
    public ArrayList<Profesor> imprimirProfesor(Profesor profesor);
    
    public List<Libro> agregarLibro(Libro libro);
    public List<Libro> eliminarLibro(Libro libro);
    public List<Libro> buscarLibro(Libro libro);
    public List<Libro> actualizarLbro(Libro libro);
    public ArrayList<Libro> imprimirPrestamo(Libro libro);
    
    public List<Prestamo> agregarPrestamo(Prestamo prestamo);
    public List<Prestamo> eliminarPrestamo(Prestamo prestamo);
    public List<Prestamo> buscarPrestamo(Prestamo prestamo);
    public List<Prestamo> actualizarPrestamo(Prestamo prestamo);
    public ArrayList<Prestamo> imprimirPrestamo(Prestamo prestamo);
}