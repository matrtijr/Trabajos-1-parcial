
package Testprest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import bibliodao.Alumdao;
import bibliodao.Librodao;
import bibliodao.Prestamodao;
import bibliodao.Profesordao;
import BiblioDan.Alum;
import BiblioDan.Libro;
import BiblioDan.Prestamo;
/**
 *
 * @author dndra
 */
public class Test1 {
    Alumdao alumnoDao = new Alumdao();
    Librodao libroDao = new Librodao();
    Prestamodao prestamoDao = new Prestamodao();
    Profesordao profesorDao = new Profesordao();

    public void testCrearPrestamo(Prestamo prestamo) {
        prestamoDao.Agregar(prestamo);
        System.out.println("Fin agregar prestamo");

    }

    public void testCrearLibro(Libro libro) {
        libroDao.Agregar(libro);
        System.out.println("Fin agregar");

    }
    
    
    public void testCrearAlumno(Alum alumno){
        alumnoDao.agragarAlumno(alumno);
        System.out.println("agregoalumno");
    }

    public void consultarPrestamo() {

        //si es diferente de nulo que se imprima
        Prestamo p = prestamoDao.Buscar(2);
        System.out.println("Bsqueda por id  " + p.toString());
    }

    public void consultarTodos() {
        List<Prestamo> prestamos = prestamoDao.imprimirtListaPrestamos();
        // forech  NombreClase nombreVariaTemporal : nombre de la lista que se recorre
        for (Prestamo p : prestamos) {
            System.out.println(p.toString());
        }

    }

}

    

