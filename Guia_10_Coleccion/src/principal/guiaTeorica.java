/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import utilidad.comparator;

/**
 *
 * @author
 */
public class guiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // LISTAS
        ArrayList<Integer> numerosA = new ArrayList();//Arrays.asList(20, 10, 15, 66)
       // numerosA.forEach((nn) -> System.out.print(nn + " "));
        System.out.println(" ");
        int x = 20;
        int z = 10;
        int c = 25;
        int v = 33;
        int n = 5;
        numerosA.add(x);
        numerosA.add(z);
        numerosA.add(c);
        numerosA.add(v);
        numerosA.add(n);
       // ArrayList<String> letras = new ArrayList(Arrays.asList("aa", "bb", "cc", "dd"));
      //  letras.forEach((a) -> System.out.println(a));
        // COMPARATOR
        
        
        
        
        /*
  // RECORRER Y ELIMINAR//
  // con una lista de tipo integer no se puede eliminar de esta manera se debe hacer con interator
  
        for (int i = 0; i < letras.size(); i++) {
            String m = letras.get(i);
            if (m.equals("bb")) {
                letras.remove(m);
            }
        }
         letras.forEach((a)->System.out.println(a));
        
/*
// muestar lalista metodo A
        for (int i = 0; i < numerosA.size(); i++) {// size da la dimension
            System.out.println(numerosA.get(i));
        }
        //metodo b
       // numerosA.forEach((a)->System.out.println(a));
        
        /*
        Collections.sort(numerosA); // ordena de menor a mayor
        System.out.println(numerosA);*/
//ITERADOR // RECORRE PARA PODER ELIMINAR
         Iterator iterator = numerosA.iterator();
        while (iterator.hasNext()) { // hasnext() pregunta si hay siguiente para coninuar
            if (iterator.next().equals(33)) {
                iterator.remove();
            }
        }
        System.out.println(numerosA);
     /*
        /// ELIMINAR  ATRAVES DE UN METODO 
        public void eliminar(String nombre) { // pasamos por parametro (en el main eliminar(nombre)
        for(int i=0; i< lista.size(); i++){
        Clase xx = lista.get(i);
        if (xx.getNombre().equals(nombre))}
        lista.remove(xx);
        }
        }
        /// ACTUALIZAR LISTA
         public void actuli(String nombreViejo, String nombreNuevo) { // pasamos por parametro (en el main eliminar(nombre)
        for(int i=0; i< lista.size(); i++){
        Clase xx = lista.get(i);
        if (xx.getNombre().equals(nombre))}
        xx.setNombre(nombreNuevo);
        }
        }
        
        
         */
 /* List<String> lista = new ArrayList<>(Arrays.asList("hola", "adios", "hola", "hola","clau", "daniel", "jorge"));
        List<String> elementosAEliminar = new ArrayList<>();
        for (String cadena : lista) {
            if (cadena.equals("hola")) {
                elementosAEliminar.add(cadena);
            }
        }
        System.out.println(lista);
        System.out.println(elementosAEliminar);
        Collections.sort(lista);
        System.out.println(lista);
        /*
        lista.removeAll(elementosAEliminar);
        for (String cadena : lista) {
            System.out.println(cadena);
        }
        
        /* System.out.println("ARRAYLIST - Fueron cargados");
        int cont = 0;
        for(Integer cadena : numerosA){
            cont++;
//            numerosA.remove(Integer.valueOf(33));//borra el objeto
        System.out.print("{ "+cont+" } "+cadena+ " , ");
        }
        System.out.println("");
        System.out.println("#############");
        numerosA.remove(1);//borra el dato del subindice 1
        System.out.println("Fue removido el dato del indice 1");
        System.out.println(numerosA);
        System.out.println("Removemos el objeto o valor");
        numerosA.remove(Integer.valueOf(45));//borra el objeto
        System.out.println(numerosA);
        
        //CONJUNTOS
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 30;
        Integer q = 45;
        Integer w = 789;
        Integer r = 124;
        Integer o = 45;
        
        numerosB.add(y);
        numerosB.add(q);
        numerosB.add(w);
        numerosB.add(r);
        numerosB.add(o);
        System.out.println("CONJUNTOS - Fueron cargados");
        System.out.println(numerosB);
        numerosB.remove(45);
        System.out.println("Fue removido el objeto 45");
        System.out.println(numerosB);
        
        //MAPAS
        HashMap<Integer, String> alumnos = new HashMap();
        
        int dni = 21302230;
        String nombre = "Daniel";
        
        int dni1 = 23458788;
        String nombre1 = "Juana";
        
        int dni2 = 45786233;
        String nombre2 = "Hugo";
        
        int dni3 = 32458652;
        String nombre3 = "Laura";
        
        alumnos.put(dni, nombre);
        alumnos.put(dni1, nombre1);
        alumnos.put(dni2, nombre2);
        alumnos.put(dni3, nombre3);
        System.out.println("MAPAS - Fueron cargados");
        System.out.println(alumnos);
        System.out.println("Fue removido el dni2 de Hugo");
        alumnos.remove(45786233);
        System.out.println(alumnos);*/
    }

}
/*

package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class guiaTeorica {

    public static void main(String[] args) {
        
        // LISTAS
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        int z = 10;
        int c = 25;
        int v = 33;
        int n = 25;
        numerosA.add(x);
        numerosA.add(z);
        numerosA.add(c);
        numerosA.add(v);
        numerosA.add(n);
        System.out.println("ARRAYLIST - Fueron cargados");
        int cont = 0;
        for(Integer cadena : numerosA){
            cont++;
//            numerosA.remove(Integer.valueOf(33));//borra el objeto
        System.out.print("{ "+cont+" } "+cadena+ " , ");
        }
        System.out.println("");
        System.out.println("#############");
        numerosA.remove(1);//borra el dato del subindice 1
        System.out.println("Fue removido el dato del indice 1");
        System.out.println(numerosA);
        System.out.println("Removemos el objeto o valor");
        numerosA.remove(Integer.valueOf(45));//borra el objeto
        System.out.println(numerosA);
        
        //CONJUNTOS
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 30;
        Integer q = 45;
        Integer w = 789;
        Integer r = 124;
        Integer o = 45;
        
        numerosB.add(y);
        numerosB.add(q);
        numerosB.add(w);
        numerosB.add(r);
        numerosB.add(o);
        System.out.println("CONJUNTOS - Fueron cargados");
        System.out.println(numerosB);
        numerosB.remove(45);
        System.out.println("Fue removido el objeto 45");
        System.out.println(numerosB);
        
        //MAPAS
        HashMap<Integer, String> alumnos = new HashMap();
        
        int dni = 21302230;
        String nombre = "Daniel";
        
        int dni1 = 23458788;
        String nombre1 = "Juana";
        
        int dni2 = 45786233;
        String nombre2 = "Hugo";
        
        int dni3 = 32458652;
        String nombre3 = "Laura";
        
        alumnos.put(dni, nombre);
        alumnos.put(dni1, nombre1);
        alumnos.put(dni2, nombre2);
        alumnos.put(dni3, nombre3);
        System.out.println("MAPAS - Fueron cargados");
        System.out.println(alumnos);
        System.out.println("Fue removido el dni2 de Hugo");
        alumnos.remove(45786233);
        System.out.println(alumnos);
    }
    
}
*/
