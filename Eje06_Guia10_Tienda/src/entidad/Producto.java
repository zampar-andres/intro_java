/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author nuevo
 */
public class Producto {
    private String name;
    private Double precio;

    public Producto() {
    }

    public Producto(String name, Double precio) {
        this.name = name;
        this.precio = precio;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "name=" + name + ", precio=" + precio + '}';
    }
    
    
}
