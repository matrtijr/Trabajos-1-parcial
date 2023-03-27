

package bibliodao;

import java.util.ArrayList;
import java.util.List;
import BiblioDan.Alum;

public class Alumdao {
    
     public  List<Alum> alumnos = new ArrayList<>();

     
    public void agragarAlumno(Alum alumno) {
        alumnos.add(alumno);

    }

    public void eliminarAlumno( Alum alumno) {
        alumnos.remove(alumno);
    }

    public Alum buscarAlumno(int id) {
        for (int i = 0; i < alumnos.size(); i++) {
            Alum a= alumnos.get(i);
            if(a.getId()== id ){
//                 System.out.println(a.getId());
                 return a;
            }
        }
         return null;
     
    }
    
    
        public void  actualizarAlumno(Alum alumno) {
        for (int i = 0; i < alumnos.size(); i++) {
          if(alumnos.get(i).getId()== alumno.getId()){
              alumnos.get(i).setNombre(alumno.getNombre());
               alumnos.get(i).setApellidoMaterno(alumno.getApellidoMaterno());
          }
            }
        }
     
    
    public void imprimirAlumno (ArrayList<Alum> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }
}

