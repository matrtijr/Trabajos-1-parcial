
package bibliodao;

import java.util.ArrayList;
import java.util.List;
import BiblioDan.Prestamo;

/**
 *
 * @author Angela
 */
public class Prestamodao {

    
    //crud
    public List<Prestamo> prestamos = new ArrayList<>();

    public void Agregar(Prestamo prestamo) {
        prestamos.add(prestamo);

    }

    public void Eliminar(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }

    public Prestamo Buscar(int id) {
        for (int i = 0; i < prestamos.size(); i++) {
            Prestamo a = prestamos.get(i);
            if (a.getId() == id) {
//                 System.out.println(a.getId());
                return a;
            }
        }
        return null;

    }

    public void Actualizar(Prestamo prestamo) {
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getId() == prestamo.getId()) {
                prestamos.get(i).setFolio(prestamo.getFolio());
            }
        }
    }

    public List<Prestamo> imprimirtListaPrestamos() {
        return prestamos;
      
    }

}

