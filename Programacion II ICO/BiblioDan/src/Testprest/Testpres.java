 
package Testprest ;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import BiblioDan.Alum;
import BiblioDan.Libro;
import BiblioDan.Prestamo;

public class Testpres {
    
    public static void main(String[] args) {
        
        Libro libro1 = new Libro();
        libro1.setId(1);
        libro1.setNombre("Orfulllo y prejuicio");
        libro1.setCategoria("Drama");
        libro1.setEditorial("clasicos");
        libro1.setIsbn(257);
        libro1.setStock(3);
        
        Libro libro2 = new Libro();
        libro2.setId(1);
        libro2.setNombre("Stewart");
        libro2.setCategoria("Matematicas y ciencia");
        libro2.setEditorial("SEP");
        libro2.setIsbn(3443);
        libro2.setStock(7);
        
        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro2);
        listaLibros.add(libro1);
        
        Alum alumno1 = new Alum();
        alumno1.setId(1);
        alumno1.setNombre("Abraham");
        alumno1.setApellidoPaterno("Herrera");
        alumno1.setApellidoMaterno("Romero");
        alumno1.setNumeroCuenta(202274562);
        
        Prestamo prestamo1 = new Prestamo();
        Date fechaIni = new Date();
        prestamo1.setId(1);
        prestamo1.setFolio(253);
        prestamo1.setFechainicio(fechaIni);
        prestamo1.setLibros(listaLibros);
        prestamo1.setPersona(alumno1);
        
        
        Prestamo prestamo2=new Prestamo();
        prestamo2.setId(2);
        prestamo2.setFolio(33355);
        
        Test1 test1 = new Test1();
        test1.testCrearLibro(libro1);
        test1.testCrearLibro(libro2);
        test1.testCrearAlumno(alumno1);
        test1.testCrearPrestamo(prestamo1);
        test1.testCrearPrestamo(prestamo2);

        test1.consultarTodos();
        test1.consultarPrestamo();
    }
    
}
