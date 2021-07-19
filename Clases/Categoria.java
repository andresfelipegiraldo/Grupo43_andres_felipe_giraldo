/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Andres Felipe G
 */
// Atributos clase Categoria 
public class Categoria {
    private String Nombre;
    
// Constructor clase Categoria
    public Categoria(String Nombre) {
        this.Nombre = Nombre;
    }
    
// Getter and Setter de clase Categoria

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
