/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Comparator;

/**
 *
 * @author nuevo
 */
public class Comparador {
    public static Comparator<Pais> ordenar = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
        return t.getName().compareTo(t1.getName());
        }
    };
}
