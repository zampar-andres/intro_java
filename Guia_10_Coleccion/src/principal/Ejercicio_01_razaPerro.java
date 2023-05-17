package principal;

import entidad.raza;
import service.razaService;

/*
 * @author Andres Zampar
 */
public class Ejercicio_01_razaPerro {

    public static void main(String[] args) {

        razaService rs = new razaService();
        rs.nombrarRazas();
        rs.eliminar();
    }

}
