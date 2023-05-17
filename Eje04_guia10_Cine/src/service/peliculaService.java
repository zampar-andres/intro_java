/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
 */
package service;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collection;
import entidad.comparator;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class peliculaService {

    private Scanner scan;
    private List<Pelicula> lista_pelis;

    public peliculaService() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.lista_pelis = new ArrayList<>();
    }

    public Pelicula cargar() {
        System.out.println("Ingrese el Titulo de la Pelicula:");
        String nombre = scan.nextLine();
        System.out.println("Escriba el Director");
        String dire = scan.nextLine();
        System.out.println("Tiempo de Duracion");
        int duracion = Integer.parseInt(scan.nextLine());
        Pelicula peliCreada = new Pelicula(nombre, dire, duracion);

        lista_pelis.add(peliCreada);

       // Pelicula Pelis = new Pelicula();
        return peliCreada;
    }

    public void menu() {
        String option;
        cargar();

        do {
            System.out.println("Quieres CArgar Otra Pelicula s/n");
            option = scan.nextLine().toUpperCase();
            // option = option.toUpperCase();

            switch (option) {
                case "S":
                    cargar();
                    break;
                case "N":
                    System.out.println("usted a salido del menu de carga");
                    break;
                default:
                    System.out.println("opcion INCORRECTA");
                    break;
            }
        } while (!"N".equals(option));

    }

    public void mostrar() {
        for (Pelicula lista_peli : lista_pelis) {
            System.out.println(lista_peli);
            System.out.println("---------------------");
        }
    }

    public void pelisMayorHora() {

        for (int i = 0; i < lista_pelis.size(); i++) {
            if (lista_pelis.get(i).getDuracion() > 1) {
                System.out.println("---------------------");
                System.out.println("las peliculas mayor a una hora");
                System.out.println(lista_pelis.get(i));
                System.out.println("---------------------");
            }

        }
    }

    public void MayorM(){
        //Collections.sort(lista_pelis, comparator.peliMayorM);
        Collections.sort(lista_pelis, comparator.peliMayorM);
        for (Pelicula lista_peli : lista_pelis) {
            System.out.println(lista_peli);
        }
    }
     public void menorM(){
       lista_pelis.sort(comparator.pelimenorM);
         //Collections.sort(lista_pelis, comparator.pelimenorM);
        
        for (Pelicula lista_peli : lista_pelis) {
            System.out.println(lista_peli);
        }
    }
     
     /*
     • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

     */
public void ordenarTitulo(){
    Collections.sort(lista_pelis, comparator.ordenarTitulo);
    
    for (Pelicula lista_peli : lista_pelis) {
        System.out.println(lista_peli);
    }
}     
public void ordenarDire(){
    Collections.sort(lista_pelis, comparator.ordenarDirector);
    System.out.println("Ordenadas por Director");
    for (Pelicula lista_dire : lista_pelis) {
        System.out.println("*********");
        System.out.println(lista_dire);
        
    }
}
}