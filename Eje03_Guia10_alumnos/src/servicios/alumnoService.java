/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
*/
package servicios;

import entidad.Alumnos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author nuevo
 */
public class alumnoService {
   private Scanner scan;
   private List<Alumnos> lista_alumnos;

    public alumnoService() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.lista_alumnos = new ArrayList<>();
    }
   public Alumnos crearAlumnos(){
       System.out.println("Ingrese los Datos del Alumno.");
       System.out.print("Nombre: ");
       String nombre=scan.nextLine();
       System.out.print("Ingrese la 1° Nota: ");
       int nota1 = Integer.parseInt(scan.nextLine());
       System.out.print("Ingrese la 2° Nota: ");
       int nota2 = Integer.parseInt(scan.nextLine());
       System.out.print("Ingrese la 3° Nota: ");
       int nota3 = Integer.parseInt(scan.nextLine());
       
       List<Integer> notas = new ArrayList<>();
       notas.add(nota1);
       notas.add(nota2);
       notas.add(nota3);
       
       //creamos el objeto y pasamos por parametros
       
       Alumnos alumno = new Alumnos(nombre, notas);
       
       agregar(alumno);
       return alumno;
       
       
       
   }
   public void agregar(Alumnos alumno){
       lista_alumnos.add(alumno);
   }
    public void mostrar(){
        for (Alumnos lista_alumno : lista_alumnos) {
            System.out.println(lista_alumno);
        }
    }
    
}
