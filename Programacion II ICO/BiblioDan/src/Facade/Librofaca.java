
package Facade;

import bibliodao.Librodao;
import BiblioDan.Libro;

public class Librofaca {
    
    Librodao libroDao= new Librodao();
	
	public void agregarLibro(Libro libro) {
		libroDao.agregarLibro(libro);
	}
	
	public void leerLibro(){
		libroDao.MostrarListaDeLibro();
		
	} 
	
	public void actualizarLibro(Libro libro) {
		libroDao.actualizarLibro(libro);
	}
	
	public void eliminarLibro(Libro libro) {
		libroDao.eliminarLibro(libro);
	}
    
}
