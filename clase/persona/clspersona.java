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
// Atributos clspersona
public class clspersona {
    private String Nombre;
    private int No_de_documento;
    private String Genero;
    private int Edad;
    private float Peso;
    private float Estatura;
    private String Telefono;
    private String Estado_civil;
    private String Profesión;
    
    // Metodos clspersona
    public clspersona(){
    }
    
    public void Hablar(){
        System.out.println(this.Nombre + " está hablando");
    }
    
    public void Escribir(){
        System.out.println(this.Nombre + " está escribiendo");
    }
    
    public void Caminar(){
        System.out.println(this.Nombre + " está caminando");
    }
    
    public void Trabajar(){
        System.out.println(this.Nombre + " está trabajando");
    }
    
    public void Comer(){
        System.out.println(this.Nombre + " está comiendo");
    }
    
    public void Reir(){
        System.out.println(this.Nombre + " está riendo");
    }
    
    public void Correr(){
        System.out.println(this.Nombre + " está corriendo");
    }
    
    public void Dormir(){
        System.out.println(this.Nombre + " está durmiendo");
    }
    
    public void Observar(){
        System.out.println(this.Nombre + " está observando");
    }
    
    public void Escuchar(){
        System.out.println(this.Nombre + " está escuchando");
    }
    
    
    // set y get clspersona
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNo_de_documento() {
        return No_de_documento;
    }

    public void setNo_de_documento(int No_de_documento) {
        this.No_de_documento = No_de_documento;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getEstatura() {
        return Estatura;
    }

    public void setEstatura(float Estatura) {
        this.Estatura = Estatura;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEstado_civil() {
        return Estado_civil;
    }

    public void setEstado_civil(String Estado_civil) {
        this.Estado_civil = Estado_civil;
    }

    public String getProfesión() {
        return Profesión;
    }

    public void setProfesión(String Profesión) {
        this.Profesión = Profesión;
    }

   
    
}
