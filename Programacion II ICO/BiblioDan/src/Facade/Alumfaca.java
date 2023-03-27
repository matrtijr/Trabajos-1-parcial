
package Facade;

import bibliodao.Alumdao;
import BiblioDan.Alum;

public class Alumfaca {
    
    Alumdao alumnoDao= new Alumdao();
	
	public void agregarAlum(Alum alumno) {
		alumnoDao.agregarAlum(alumno);
	}
	
	public void leerAlumno(){
		alumnoDao.MostrarListaDeAlumnos();
		
	} 
	
	public void actualizarAlumno(Alumno alumno) {
		alumnoDao.actualizarAlumno(alumno);
	}
	
	public void eliminarAlumno(Alumno alumno) {
		alumnoDao.eliminarAlumno(alumno);
	}
    
}
