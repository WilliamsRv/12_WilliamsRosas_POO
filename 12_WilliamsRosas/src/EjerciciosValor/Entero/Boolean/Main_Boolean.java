/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosValor.Entero.Boolean;

/**
 *
 * @author Williams
 */
public class Main_Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Boolean vd = new Boolean();
        
        boolean respuesta = vd.esPar(2);
        boolean respuesta2 = vd.esPositivo(20);
        boolean respuesta3 = vd.contieneSoloLetras("1234");
        boolean respuesta4 = vd.esBisiesto(2023);
        boolean respuesta5 = vd.esPalindromo("ojo");
        
        System.out.println("Es par? : "+ respuesta+
                "\nEs positivo?: "+respuesta2+
                "\nContiene Letras?: "+respuesta3+
                "\nEs biciesto?: "+respuesta4+
                "\nEs palindromo?: "+respuesta5);
    }
    
}
