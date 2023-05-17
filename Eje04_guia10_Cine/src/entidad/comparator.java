/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Comparator;
import entidad.Pelicula;
/**
 *
 * @author nuevo
 */
public class comparator {
  // public static Comparator<Pelicula> ordenarPeliculaMayorM = new Comparator<Pelicula>() {
       public static Comparator<Pelicula> peliMayorM = new Comparator<Pelicula>() {
           @Override
           public int compare(Pelicula t, Pelicula t1) {
           return t1.getDuracion().compareTo(t.getDuracion());
           
           }
       };
    
      public static Comparator<Pelicula> pelimenorM = new Comparator<Pelicula>() {
           @Override
           public int compare(Pelicula t, Pelicula t1) {
           return t.getDuracion().compareTo(t1.getDuracion());
           }
       }; 
      
      public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {
           @Override
           public int compare(Pelicula t, Pelicula t1) {
           return t.getTitulo().compareTo(t1.getTitulo());
           
           }
       };
       
      public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {
           @Override
           public int compare(Pelicula t, Pelicula t1) {
         
           return t.getDirector().compareTo(t1.getDirector());
           }
       };
}
