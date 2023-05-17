package entidad;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * @author Andres Zampar
 */
public class letras {
private String letras;
private int numeros;

    public letras() {
    }

    public letras(String letras, int numeros) {
        this.letras = letras;
        this.numeros = numeros;
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "letras{" + "letras=" + letras + ", numeros=" + numeros + '}';
    }

   
}
