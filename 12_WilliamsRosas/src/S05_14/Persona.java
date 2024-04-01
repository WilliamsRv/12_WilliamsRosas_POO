/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_14;

/**
 *
 * @author Lab10
 */
public class Persona {
    int edad; 
    int dni;
    String nombre;
    String apellido;
    String puesto;
    
    
    public void correr(){
        System.out.println("esta persona puede correr");
    
    }
    
    public void caminar (){
        System.out.println("puede caminar");
    }
    
    public void saltar(){
        System.out.println("puede saltat");
    }
    
    public void hablar(){
        System.out.println("hablar"+nombre);
    }
    
    public void patear(){
        System.out.println("patear");
           
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
}
