/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paiseService;

import entidad.Comparador;
import entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javafx.print.Collation;

/**
 *
 * @author nuevo
 */
public class paisesServicio {

    private Scanner scan;
    private HashSet<Pais> paises;

    public paisesServicio() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.paises = new HashSet<Pais>();
    }

    public Pais Crear() {
        System.out.println("Ingrese el pais");
        String nombre = scan.nextLine().toUpperCase();
        Pais paisCreado = new Pais(nombre);
        paises.add(paisCreado);

        return paisCreado;
    }

    public void menu() {
        String opt;
        Crear();
        do {
            System.out.print("Desea Cargar otro Pais s/n");
            opt = scan.nextLine().toUpperCase();
            // option = option.toUpperCase();

            switch (opt) {
                case "S":
                    Crear();
                    break;
                case "N":
                    
                    break;
                default:
                    System.out.println("opcion INCORRECTA\n"
                            + "vuelva a intentar");

                    break;
            }
        } while (!"N".equals(opt));

    }

    /*public void pruebaPaises() {

		
		
		Pais argentina = new Pais("ARGENTINA");
		Pais españa = new Pais("ESPAÑA");
		Pais brazil = new Pais("BRAZIL");
		Pais uruguay = new Pais("URUGUAY");
		
		
		paises.add(argentina);
		paises.add(españa);
		paises.add(brazil);
		paises.add(uruguay);
	
	}*/
   
    public void ordenarPaises(){
        
        ArrayList <Pais> ordenar = new ArrayList(paises);
        Collections.sort(ordenar, Comparador.ordenar);
        for (Pais aux : ordenar) {
            System.out.println("*");
            System.out.println(aux);
        }
        
    }
    
    public void Eliminar(){
        System.out.println("Que pais desea sacar de la lista");
        String del = scan.nextLine().toUpperCase();
        Iterator<Pais> ite = paises.iterator();
        while (ite.hasNext()) {            
            if (ite.next().getName().equals(del)) {
                ite.remove();
            }
        }
        
    }
    
    public void mostrar() {
        System.out.println("los paises son");
        for (Pais aux : paises) {
            System.out.println(aux);
        }
    }

}
/*
El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
