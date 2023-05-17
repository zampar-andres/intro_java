/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Andres ZAmpar
 */
public class Pais {
    private String name;

    public Pais() {
    }

    public Pais(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pais{" + "name=" + name + '}';
    }
    
    
    
}
