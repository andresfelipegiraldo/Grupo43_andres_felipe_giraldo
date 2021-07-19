/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_2_class;

import Clases_reto2.Cliente;
import Clases_reto2.Empleado;
import Clases_reto2.Empresa;
import Clases_reto2.Cargo;
import Clases_reto2.Categoria;

/**
 *
 * @author Andres Felipe G
 */
public class Principal {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Cargo cargo1 = new Cargo("Gerente"); 
        Categoria cat1 = new Categoria("administrativo");
        Cargo cargo2 = new Cargo("Medico"); 
        Categoria cat2 = new Categoria("operativo");
        Cargo cargo3 = new Cargo("Auxiliar"); 
        Categoria cat3 = new Categoria("operativo");
        Cargo cargo4 = new Cargo("Auxiliar"); 
        Categoria cat4 = new Categoria("operativo");
        Empleado emp1 = new Empleado(4000000f, cat1, cargo1, "Andres", "Giraldo", "1088271998", "anfegiga1989@hotmail.com");
        Empresa empresa = new Empresa("INS", "6543215", "INS@minsalud.go.cov", emp1);
        Cliente cliente = new Cliente("cra 6 #23-12", "3145647766", "Juan", "Gomez", "162287654", "juangz@hotmail.com");
        Empleado emp2 = new Empleado(2670000f, cat2, cargo2, "Diego", "Ramirez", "29833322", "diegramz@hotmail.com");
        Empleado emp3 = new Empleado(1890000f, cat3, cargo3, "Ruben", "Gil", "1986222111", "rubgil111@hotmail.com");
        Empleado emp4 = new Empleado(1200000f, cat4, cargo4, "Daniel", "Fuentes", "82239223", "danifuees@gmail.com");
        emp1.asignar_subordinado(emp2);
        emp1.asignar_subordinado(emp3);
        emp1.asignar_subordinado(emp4);
        System.out.println("Administartivos"+"\n"+"Nombre: "+ emp1.getNombres()+"\n"+ "Apellido: " + emp1.getApellidos()+"\n"+ "Cedula:"+emp1.getDocumento_identidad()+"\n");
        
        for (Empleado e: emp1.getSubordinados()){
            System.out.println("Operarios"+"\n"+"Nombre: " +e.getNombres()+ "\n"+"Apellido: "+e.getApellidos()+"\n"+"Cedula: "+e.getDocumento_identidad());
        }
    }
    
}
