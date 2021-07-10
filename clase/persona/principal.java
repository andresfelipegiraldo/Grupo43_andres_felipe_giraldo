/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.persona;

/**
 *
 * @author Andres Felipe G
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancia de persona_1
        clspersona persona_1 = new clspersona();
        persona_1.setNombre("Andrés");
        System.out.println("Nombre: " + persona_1.getNombre());
        persona_1.setNo_de_documento(1122);
        System.out.println("No de documento: "+persona_1.getNo_de_documento());
        persona_1.setGenero("M");
        System.out.println("Genero: " + persona_1.getGenero());
        persona_1.setEdad(31);
        System.out.println("Edad: " + persona_1.getEdad());
        persona_1.setPeso((float) 82.3);
        System.out.println("Peso: " + persona_1.getPeso()); 
        persona_1.setEstatura((float) 1.72);
        System.out.println("Estatura: " + persona_1.getEstatura()); 
        persona_1.setTelefono("3136775673");
        System.out.println("Telefono: " + persona_1.getTelefono()); 
        persona_1.setEstado_civil("Casado");
        System.out.println("Estado civil : " + persona_1.getEstado_civil());
        persona_1.setProfesión("Químico");
        System.out.println("Profesión: " + persona_1.getProfesión());
        
        // Crear instancia de persona_2
        System.out.println("");
        clspersona persona_2 = new clspersona();
        persona_2.setNombre("Viviana");
        System.out.println("Nombre: " + persona_2.getNombre());
        persona_2.setNo_de_documento(2513);
        System.out.println("No de documento: "+persona_2.getNo_de_documento());
        persona_2.setGenero("F");
        System.out.println("Genero: " + persona_2.getGenero());
        persona_2.setEdad(32);
        System.out.println("Edad: " + persona_2.getEdad());
        persona_2.setPeso((float) 68);
        System.out.println("Peso: " + persona_2.getPeso()); 
        persona_2.setEstatura((float) 1.63);
        System.out.println("Estatura: " + persona_2.getEstatura()); 
        persona_2.setTelefono("3178946676");
        System.out.println("Telefono: " + persona_2.getTelefono()); 
        persona_2.setEstado_civil("Casada");
        System.out.println("Estado civil : " + persona_2.getEstado_civil());
        persona_2.setProfesión("Química");
        System.out.println("Profesión: " + persona_2.getProfesión());
        
        // Crear instancia de persona_3
        System.out.println("");
        clspersona persona_3 = new clspersona();
        persona_3.setNombre("Claudia");
        System.out.println("Nombre: " + persona_3.getNombre());
        persona_3.setNo_de_documento(4432);
        System.out.println("No de documento: "+persona_3.getNo_de_documento());
        persona_3.setGenero("F");
        System.out.println("Genero: " + persona_3.getGenero());
        persona_3.setEdad(37);
        System.out.println("Edad: " + persona_3.getEdad());
        persona_3.setPeso((float) 73);
        System.out.println("Peso: " + persona_3.getPeso()); 
        persona_3.setEstatura((float) 1.56);
        System.out.println("Estatura: " + persona_3.getEstatura()); 
        persona_3.setTelefono("3216439079");
        System.out.println("Telefono: " + persona_3.getTelefono()); 
        persona_3.setEstado_civil("Casada");
        System.out.println("Estado civil : " + persona_3.getEstado_civil());
        persona_3.setProfesión("Ingeniera Electricista");
        System.out.println("Profesión: " + persona_3.getProfesión());
        
        // Crear instancia de persona_4
        System.out.println("");
        clspersona persona_4 = new clspersona();
        persona_4.setNombre("Carmenza");
        System.out.println("Nombre: " + persona_4.getNombre());
        persona_4.setNo_de_documento(1987);
        System.out.println("No de documento: "+persona_4.getNo_de_documento());
        persona_4.setGenero("F");
        System.out.println("Genero: " + persona_4.getGenero());
        persona_4.setEdad(15);
        System.out.println("Edad: " + persona_4.getEdad());
        persona_4.setPeso((float) 58);
        System.out.println("Peso: " + persona_4.getPeso()); 
        persona_4.setEstatura((float) 1.65);
        System.out.println("Estatura: " + persona_4.getEstatura()); 
        persona_4.setTelefono("3135467798");
        System.out.println("Telefono: " + persona_4.getTelefono()); 
        persona_4.setEstado_civil("Soltera");
        System.out.println("Estado civil : " + persona_4.getEstado_civil());
        persona_4.setProfesión("Estudiante");
        System.out.println("Profesión: " + persona_4.getProfesión());
        
        // Crear instancia de persona_5
        System.out.println("");
        clspersona persona_5 = new clspersona();
        persona_5.setNombre("Alonso");
        System.out.println("Nombre: " + persona_5.getNombre());
        persona_5.setNo_de_documento(1001);
        System.out.println("No de documento: "+persona_5.getNo_de_documento());
        persona_5.setGenero("M");
        System.out.println("Genero: " + persona_5.getGenero());
        persona_5.setEdad(93);
        System.out.println("Edad: " + persona_5.getEdad());
        persona_5.setPeso((float) 79);
        System.out.println("Peso: " + persona_5.getPeso()); 
        persona_5.setEstatura((float) 1.61);
        System.out.println("Estatura: " + persona_5.getEstatura()); 
        persona_5.setTelefono("3147899975");
        System.out.println("Telefono: " + persona_5.getTelefono()); 
        persona_5.setEstado_civil("Viudo");
        System.out.println("Estado civil : " + persona_5.getEstado_civil());
        persona_5.setProfesión("Pensionado");
        System.out.println("Profesión: " + persona_5.getProfesión());
        
        //invocar metodo en persona_1
        System.out.println("");
        persona_1.Trabajar();
        
         //invocar metodo en persona_5
        System.out.println("");
        persona_5.Dormir();
        
         //invocar metodo en persona_3
        System.out.println("");
        persona_3.Escuchar();
        
         //invocar metodo en persona_2
        System.out.println("");
        persona_2.Reir();
        
         //invocar metodo en persona_4
        System.out.println("");
        persona_4.Hablar();
        
        System.out.println("");
        persona_1.Correr();
    }
    
}
