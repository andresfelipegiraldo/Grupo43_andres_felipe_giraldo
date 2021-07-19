/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_reto2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres Felipe G
 */
// Atributos clase Empleado
// Herencia de clase Persona a Empleado
public class Empleado extends Persona {
    private float Salario;
    private Categoria cat;
    private Cargo crg;
    private List<Empleado> subordinados;
    private Empleado jefe;
    
// Constructor clase Empleado

    public Empleado(float Salario, Categoria cat, Cargo crg, String Nombres, String Apellidos, String Documento_identidad, String Correo_electronico) {
        super(Nombres, Apellidos, Documento_identidad, Correo_electronico);
        this.Salario = Salario;
        this.cat = cat;
        this.crg = crg;
        this.subordinados = new ArrayList<Empleado>();
    }
    
    // Metodo Agignar subordinado
    public void asignar_subordinado(Empleado emp){
        this.getSubordinados().add(emp);
        emp.setJefe(this);
    }

    public Empleado(String Nombres, String Apellidos, String Documento_identidad, String Correo_electronico) {
        super(Nombres, Apellidos, Documento_identidad, Correo_electronico);
    }

// Getter and Setter de clase Empleadp
    
    /**
     * @return the Salario
     */
    public float getSalario() {
        return Salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    /**
     * @return the cat
     */
    public Categoria getCat() {
        return cat;
    }

    /**
     * @param cat the cat to set
     */
    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    /**
     * @return the crg
     */
    public Cargo getCrg() {
        return crg;
    }

    /**
     * @param crg the crg to set
     */
    public void setCrg(Cargo crg) {
        this.crg = crg;
    }

    /**
     * @return the jefe
     */
    public Empleado getJefe() {
        return jefe;
    }

    /**
     * @param jefe the jefe to set
     */
    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

    /**
     * @return the subordinados
     */
    public List<Empleado> getSubordinados() {
        return subordinados;
    }

    /**
     * @param subordinados the subordinados to set
     */
    public void setSubordinados(List<Empleado> subordinados) {
        this.subordinados = subordinados;
    }
}
