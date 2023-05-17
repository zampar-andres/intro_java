package service;

import entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class producService {

    private Scanner scan; //=  new Scanner(System.in).useDelimiter("\n");
     HashMap<String, Double> Productos; //= new HashMap();

    public producService() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.Productos = new HashMap();
    }

    

    public void menu() {
        int opc;
        boolean mm= true;
        do {
            System.out.println("Elija una opcion");
            System.out.println("1. Cargar Producto Nuevo\n"
                    + "2. Modificar Precio\n"
                    + "3. Eliminar Producto\n"
                    + "4. Mostrar Lista de Productos\n"
                    + "5. Salir");
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    cargarProducto();
                    break;
                case 2:
                    modificar();
                    break;
                case 3:
                    EliminarP();
                    break;
                case 4:
                    mostrarP();
                    break;
                case 5:   
                break;
                default:
                    System.out.println(" ");
                    System.out.println("------------------------");
                    System.out.println("Opcion incorrecta");
    System.out.println("------------------------");
                    System.out.println(" ");
            }
           
        } while (mm!=true);
        
    }
    
public void cargarProducto(){
    Scanner scan = new Scanner(System.in);
    System.out.println("CREAR PRODUCTO NUEVO");
    System.out.print("Nombre: ");
    String nombre=scan.nextLine();
    System.out.print("Precio:");
    Double precio=scan.nextDouble();
   
    
    Productos.put(nombre, precio);
    System.out.println("Que Desea Hacer\n"
            + "1. Producto Nuevo\n"
            + "2. Volver al Menu");
    int opcion=scan.nextInt();
    switch (opcion){
        case 1: cargarProducto();
        break;
        case 2:
            menu();
            break;
    }
    
//    if (opcion.equalsIgnoreCase("s")) {
//    menu();     
//    }else {
//        System.out.println("Gracias");
//        
//    }
   
   // Productos.remove(nombre);
  //  Productos.replace(nombre, precio);
}
public void modificar(){
    Scanner leer = new Scanner(System.in);
    System.out.println("ingrese el producto para actualizar");
    String act= leer.nextLine();
    System.out.println("nuevo precio");
    Double precion= leer.nextDouble();
    System.out.println(act);
    Productos.replace(act, precion);
    System.out.println("Que Desea Hacer\n"
            + "1. Modificar Otro Producto\n"
            + "2. Volver al Menu");
    int opcion=scan.nextInt();
    switch (opcion){
        case 1: modificar();
        break;
        case 2:
            menu();
            break;
    }
}
  public void mostrarP(){
      for (Map.Entry<String, Double> aux : Productos.entrySet()) {
          String key = aux.getKey();
          Double value = aux.getValue();
          System.out.println("prducto;" +key+ " precio: "+value);
      }
      System.out.println("Que Desea Hacer\n"
            + "1. Volver al Menu\n"
            + "2. Salir");
    int opcion=scan.nextInt();
    switch (opcion){
        case 1: menu();
        break;
        case 2:
            System.out.println("App Finalizada");
            break;
    }
  }  
  public void EliminarP(){
    Scanner leer = new Scanner(System.in);
    System.out.println("ingrese el producto para Eliminar");
    String act= leer.nextLine();
   
    Productos.remove(act);
    System.out.println("Que Desea Hacer\n"
            + "1. Eliminar Otro Producto\n"
            + "2. Volver al Menu");
    int opcion=scan.nextInt();
    switch (opcion){
        case 1: EliminarP();
        break;
        case 2:
            menu();
            break;
    }
}
}