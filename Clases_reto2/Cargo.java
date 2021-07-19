/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_reto2;

/**
 *
 * @author Andres Felipe G
 */
// Atributos de la clase Cargo
public class Cargo {
  
    private String Nivel_jerarquico;

// Constructor clase Cargo
   
   
    public Cargo(String Nivel_jerarquico) {
        this.Nivel_jerarquico = Nivel_jerarquico;
    }

// Getter and Setter de clase Cargo


    /**
     * @return the Nivel_jerarquico
     */
    public String getNivel_jerarquico() {
        return Nivel_jerarquico;
    }

    /**
     * @param Nivel_jerarquico the Nivel_jerarquico to set
     */
    public void setNivel_jerarquico(String Nivel_jerarquico) {
        this.Nivel_jerarquico = Nivel_jerarquico;
    }
}
