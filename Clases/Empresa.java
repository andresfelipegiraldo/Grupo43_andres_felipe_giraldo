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

// Atributos de clase Empresa
public class Empresa {
    private String Nomre_empresa;
    private String NIT;
    private String direccion;
    private Cliente X;
    private Empleado emp;
    
// Constructor clsae Empresa

    public Empresa(String Nomre_empresa, String NIT, String direccion, Empleado emp) {
        this.Nomre_empresa = Nomre_empresa;
        this.NIT = NIT;
        this.direccion = direccion;
        this.emp = emp;
    }
    
// Getter and Setter de clase Empresa

    /**
     * @return the Nomre_empresa
     */
    public String getNomre_empresa() {
        return Nomre_empresa;
    }

    /**
     * @param Nomre_empresa the Nomre_empresa to set
     */
    public void setNomre_empresa(String Nomre_empresa) {
        this.Nomre_empresa = Nomre_empresa;
    }

    /**
     * @return the NIT
     */
    public String getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the X
     */
    public Cliente getX() {
        return X;
    }

    /**
     * @param X the X to set
     */
    public void setX(Cliente X) {
        this.X = X;
    }

    /**
     * @return the emp
     */
    public Empleado getEmp() {
        return emp;
    }

    /**
     * @param emp the emp to set
     */
    public void setEmp(Empleado emp) {
        this.emp = emp;
    }
}
