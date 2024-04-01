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
public class Main_S05_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona per = new Persona();
        Persona per2 = new Persona();
        Calculadora_14 cal = new Calculadora_14();
        
        
        cal.ingresarDatos();
        cal.sumar();
        cal.restar();
        cal.mostrarDatos();
        
        
        
        
        per.apellido = "rosas";
        per.nombre = "williams";
        per.dni = 61200005;
        per.puesto = "ingeniero";
                
        per2.apellido = "vargas";
        per2.nombre = "andres";
        per2.dni = 6112333;
        per2.puesto = "trabajador";
        
        per2.hablar();
    }
    
}
