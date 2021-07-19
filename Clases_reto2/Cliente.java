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

// Atributos clase Cliente
// Herencia de clase Persona a Cliente
public class Cliente extends Persona {
    private String Direccion;
    private String Telefono;
    
// COnstructor Atributos Cliente
    public Cliente(String Direccion, String Telefono, String Nombres, String Apellidos, String Documento_identidad, String Correo_electronico) {
        super(Nombres, Apellidos, Documento_identidad, Correo_electronico);
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    
    public Cliente(String Nombres, String Apellidos, String Documento_identidad, String Correo_electronico) {
        super(Nombres, Apellidos, Documento_identidad, Correo_electronico);
    }

// // Getter and Setter de clase Cliente
    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
}
