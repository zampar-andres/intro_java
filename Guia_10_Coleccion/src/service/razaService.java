/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 
*/
package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * @author Andres Zampar
 */
public class razaService {
private Scanner scan; // creamos el scanner
private ArrayList <String> razas; // creamos las lista de tipo String

    public razaService() {
        this.scan =  new Scanner(System.in).useDelimiter("\n"); // para utilizar el scanner en el servicio
        this.razas = new ArrayList(); // creamos la memoria de la lista
    }
    public void nombrarRazas(){
       String respuesta = "";// inicializamos la variable

        do {
            System.out.println("Ingrese la raza del Perro");
           String nomRaza = scan.next();// solicitamos por teclado y guardamos loque el usuario 

            razas.add(nomRaza);// agregamos en la lista

            System.out.println("Quiere ingresar otra Raza? (si/no)");
            respuesta = scan.next();

        } while (respuesta.equalsIgnoreCase("Si"));// si se cumple la condicion continua
        System.out.print("Las Razas son: ");
        for (String razaperro : razas) {// imprime lo que esta guardado en la lista 
            System.out.print(razaperro+ ", ");
        }
        System.out.println(" ");
    }
/*
    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
    */
 public void eliminar(){
     System.out.println("que raza desea eliminar");
     String eliminar= scan.next();
     Iterator iterator = razas.iterator();
        while (iterator.hasNext()) { // hasnext() pregunta si hay siguiente para coninuar
            if (iterator.next().equals(eliminar)) {
                iterator.remove();
            }
        }
        System.out.println(razas);
 }
    
}
