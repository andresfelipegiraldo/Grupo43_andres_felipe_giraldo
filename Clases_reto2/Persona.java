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
// Atributos clase Persona
public class Persona {
    private String Nombres;
    private String Apellidos;
    private String Documento_identidad;
    private String Correo_electronico;

// Constructor Atributos persona
    public Persona(String Nombres, String Apellidos, String Documento_identidad, String Correo_electronico) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Documento_identidad = Documento_identidad;
        this.Correo_electronico = Correo_electronico;
    }
    
    

    /**
     * @return the Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres the Nombres to set
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }
    
// Getter and Setter de clase Persona
    /**
     * @return the Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param Apellidos the Apellidos to set
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * @return the Documento_identidad
     */
    public String getDocumento_identidad() {
        return Documento_identidad;
    }

    /**
     * @param Documento_identidad the Documento_identidad to set
     */
    public void setDocumento_identidad(String Documento_identidad) {
        this.Documento_identidad = Documento_identidad;
    }

    /**
     * @return the Correo_electronico
     */
    public String getCorreo_electronico() {
        return Correo_electronico;
    }

    /**
     * @param Correo_electronico the Correo_electronico to set
     */
    public void setCorreo_electronico(String Correo_electronico) {
        this.Correo_electronico = Correo_electronico;
    }
    
}
