package utilidad;
import java.util.Comparator;
import entidad.letras;
import java.util.Collections;
/*
 * @author Andres Zampar
 */
public class comparator {
    
public static Comparator<letras> ordenar = new Comparator <letras>() {
    @Override
    public int compare(letras t, letras t1) {
    return t.getLetras().compareTo(t.getLetras());
    
    }
};
}
