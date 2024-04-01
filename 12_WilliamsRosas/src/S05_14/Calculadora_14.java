/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S05_14;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab10
 */
public class Calculadora_14 {
    
    int num1;
    int num2;
    int suma;
    int resta;
    public void sumar(){
        suma = num1+num2;
    
    }
    public void restar(){
       resta =  num1-num2;
    
    }
    
    public void ingresarDatos(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
    }
    
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "la suma es: "+ suma+ "\n"+ "la resta es: "+ resta);
        
    }
}
